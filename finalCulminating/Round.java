package finalCulminating;

import java.util.ArrayList;

public class Round {
	
	private int numberOfRound;
	public int playersWallet;
	public int computersWallet;
	private char phrase[]; //complete phrase
	private char knownPhrase[]; //the phrase known by players
	private ArrayList<Character> phraseInAList = new ArrayList<Character>();//array list for letters shown to the player
	private ArrayList<Character> usedLetters = new ArrayList<Character>(); //array lists for used letters
	private boolean isPlayerTurn = true;
	
	public Round(int roundNumber, int _playersWallet, int _computersWallet) {
		numberOfRound = roundNumber - 1; //specify round number
		playersWallet = _playersWallet;
		computersWallet = _computersWallet;
		phrase = FileManager.phrases[RNG.GetRandomNumber(25)].toCharArray(); //getting the random phrase
		knownPhrase = new char[phrase.length];
		for(int i = 0; i < phrase.length; i++) {
			phraseInAList.add(phrase[i]);
			if(phrase[i] == ' ') knownPhrase[i] = ' '; //if the phrase contains a space, then make it a space in the char array,
			else knownPhrase[i] = '_'; //if [i]th element is a letter then it becomes an _
		}
	}
	
	public void StartRound() {
		while(true) {
			//checking if the letters in the phrase are fully guessed or not
			boolean isPhraseFinished = true;
			for(int i = 0; i < knownPhrase.length; i++) {
				if(knownPhrase[i] == '_') {
					isPhraseFinished = false;
					break;
				}
			}

			if(!isPhraseFinished) {
				SpinAndGuess();
			}
			else {
				break;
			}
		}
		String phraseInString = "";
		for(int i = 0; i < phrase.length; i++) {
			phraseInString += phrase[i];
		}
		System.out.println("The phrase was: " + phraseInString);
	}
	 
	//defining what each number in the FileManager's roundPricesArrays coming 
	private int Spin() {
		int num = FileManager.roundPricesArrays[numberOfRound][RNG.GetRandomNumber(25)];
		if(num == 0) { //bankruptcy 
			System.out.println("\nSpinner landed on bankruptcy. Lost turn. :(");
			if(isPlayerTurn) playersWallet = 0;
			else computersWallet = 0;
			return -1;
		}
		else if(num == 1) { //lost turn
			if(isPlayerTurn) System.out.println("\nYour spinner landed on lose turn.");
			else System.out.println("\nThe computer's spinner landed on lose turn");
			return -1;
		}
		else { 
			
			if(num > 900) { //top dollar amount
				if (isPlayerTurn) System.out.println("\nYou landed on Top Dollar amount!!! $" + num);
				else System.out.println("\nThe computer landed on Top Dollar amount :(( $" + num);
			}
			else { //normal dollar amount
				if (isPlayerTurn) System.out.println("\nYour Dollar amount is $" + num);
				else System.out.println("\nThe computer's Dollar amount is: $" + num);
			}
			return num;
		}
	}
	
	private void AddToWallet(boolean WhosTurn, int amount) {
		if(WhosTurn) playersWallet += amount;
		else computersWallet += amount;
	}
	
	private void SpinAndGuess() {
		String knownPhraseInString = "";
		for(int i = 0; i < knownPhrase.length; i++) {
			knownPhraseInString += knownPhrase[i] + " ";
		}
		System.out.println("<------------------------------------------------------------------>\nPlayers wallet: $" + playersWallet + "                      Computers wallet: $" + computersWallet + "\nThe phrase is: " + knownPhraseInString + "\n<------------------------------------------------------------------>");
		
		int spinResult = Spin();
		if(spinResult == -1) {
			isPlayerTurn = !isPlayerTurn; //switch turns
		}
		else {
			char inputedLetter = ' ';
			if(isPlayerTurn) {
				String RemainingLetters = "";
				for(char c : FileManager.fullAlphabet) { //Printing the letters available for guessing
					if(!usedLetters.contains(c)) RemainingLetters += (c + " | ");
				}
				System.out.println("The remaining letters are:\n " + RemainingLetters + " \nGuess a letter:");
				
				while(true) {
					inputedLetter = InputManager.playerInput().charAt(0);
					boolean vowelEntered = false;
					for(int i = 0; i < FileManager.vowels.length; i++) {
						if(FileManager.vowels[i] == inputedLetter) {
							vowelEntered = true;
						}
					}
					if(vowelEntered) { //checking to see if player has enough money to buy a value and if so, reducing 250
						if(playersWallet >= 250) {
							playersWallet -= 250;
							break;
						}
						else {
							System.out.println("\nYou don't have enough money to buy a vowel.\nGuess again:");
						}
					}
					else {
						break;
					}
				}
			}
			else {
				int randomNum = -1;
				while(true) {
					//Check if phrase has only vowels left
					boolean itHasNoConsenants = false;
					for(int i = 0; i < knownPhrase.length; i++) {
						for(int j = 0; j < FileManager.consenants.length; j++) {
							if(knownPhrase[i] == FileManager.consenants[j]) {
								itHasNoConsenants = true;
								break;
							}
						}
						if(itHasNoConsenants) break;
					}
					
					if(itHasNoConsenants) {
						randomNum = RNG.GetRandomNumber(5);
					}
					else {
						randomNum = 0; //if there is only vowels left, the chance for computer to guess vowel -> 100%
					}
					
					if(randomNum == 0 && computersWallet >= 250) {
						inputedLetter = FileManager.vowels[RNG.GetRandomNumber(FileManager.vowels.length)];
					}
					else { //computer guessing consonant
						inputedLetter = FileManager.consenants[RNG.GetRandomNumber(FileManager.consenants.length)];
					}
					
					if(!usedLetters.contains(inputedLetter)) {
						break;
					}
				}
				System.out.println("\nThe computer guessed the letter: " + inputedLetter);
				if(randomNum == 0 && computersWallet >= 250) { //-250 if computer buys vowel
					computersWallet -= 250;
				}
				
			}
			if(inputedLetter != ' ' && phraseInAList.contains(inputedLetter)) {
				if(usedLetters.contains(inputedLetter)) { //checking for duplicate guesses
					System.out.println("\nThis letter has already been guessed. Turn lost.");
					isPlayerTurn = !isPlayerTurn;
				}
				else {
					for(int i = 0; i < phrase.length; i++) {
						if(phrase[i] == inputedLetter) {
							knownPhrase[i] = inputedLetter;
							AddToWallet(isPlayerTurn, spinResult);
						}
					}
					usedLetters.add(inputedLetter);
				}
			}
			else {
				isPlayerTurn = !isPlayerTurn;
				System.out.println("\nIt didn't contain the letter: " + inputedLetter);
				if(usedLetters.contains(inputedLetter)) System.out.println("\nThis letter has also already been guessed. Turn lost.");
				if(inputedLetter != ' ') usedLetters.add(inputedLetter);
			}
			
		}
	}
}
