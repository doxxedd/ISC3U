package finalCulminating;

public class Game {
	private String playerName;
	
	private int playerWallet = 0;
	private int computerWallet = 0;

	
	public void Start() throws Exception {
		
		System.out.println("The previous scores:\n");
		FileManager.PrintAllTheScores();
		System.out.println("-------------------------\n");
		getPlayerName(); 
		
		for(int i = 1; i <= 3; i++) {
			Round r = new Round(i, playerWallet, computerWallet); //creating an instant r of the Round class
			System.out.println("\nRound " + i + " has began.\n");
			r.StartRound();
			if(r.playersWallet < 1000) playerWallet = 1000; //check if the player and computer have at least 1000 before starting the next round
			else playerWallet = r.playersWallet;
			if(r.computersWallet < 1000) computerWallet = 1000;
			else computerWallet = r.computersWallet;
		}
		
		//showing the result of the game
		System.out.println("\n The player collected: $" + playerWallet + "\nThe computer collected: $" + computerWallet); 
		if(playerWallet == computerWallet) System.out.println("\n You both suck. It is a draw.");
		else if (playerWallet < computerWallet) System.out.println("\n The computer has won! Sorry, maybe next time!");
		else { 
			System.out.println("\nCongratulations! You have won!");
			FileManager.AddScore(playerWallet, playerName);
			FileManager.SaveScoresToFile(); //outputting scores to file scoreboard.txt
		}
	}

	
	private void getPlayerName() {
		System.out.println("Enter your username:");
		playerName = InputManager.playerInput();
	}
}
