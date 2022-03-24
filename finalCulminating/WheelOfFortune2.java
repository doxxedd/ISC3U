/*
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: June 11th, 2020
* Description: Full fledged wheel of fortune in a java program. Includes the features below.
* Randomizing and choosing phrases in the theme of technology
* Spinning to determine a dollar value / losing a turn / or bankruptcy 
* Contestants are the computer and the user
* Contestant can buy a vowel
* Contestants have a wallet (prize won)
* Contestants who solve a round for less than $1,000 have their scores increased to that amount
* 3 rounds / game
* Option to play again
* Scoreboard shows up after each turn
* (NOTE: CONSONTANTS ARE SPELLED WRONG IN EVERYSINGLE METHOD AND CLASS. PLZ IGNORE)
*/

package finalCulminating;

public class WheelOfFortune2 {
	public static void main(String[] args) throws Exception{
		//startup
		FileManager.importingDataValueFromFile();

		boolean restart = true;
		while(restart) { //runs until game needs to be restarted 
			Game g = new Game(); //creating a g instance of the class Game
			g.Start(); //calls the start method of the instance
			
			System.out.println("Would you like to play the game again? (y/n)"); //prompt if they want to play again
			if (InputManager.playerInput().charAt(0) == 'n') {
				restart = false;
			}
		}
	}
}