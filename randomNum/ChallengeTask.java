/*
* [ChallengeTask.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 26, 2020
* Description: <Challange that was supposed to be done in class, asking the user for an operator, the program will ask the result
* of 2 numbers between 1 and 10. If correct it will say correct. It has some extra features like asking again etc...>
*/

package randomNum;
import java.util.Random;
import java.util.Scanner;
public class ChallengeTask {

	public static void main(String[] args) {
		Random randGen = new Random();
		Scanner input = new Scanner(System.in);
		
		while (true) {
		int min1 = randGen.nextInt(10) + 1;
		int max1 = randGen.nextInt(10) + 1;
		
		String operation = "*";
		String operation1 = "/";
		String operation2 = "+";
		String operation3 = "-";
		
		System.out.println("Choose an operator: (*, /, +, -)");
		String choice = input.next();
		
			if (choice.equals(operation)) {
				System.out.println("Whats " + max1 + " * " + min1 + "?");
				int answer1 = input.nextInt();
				int answer = randGen.nextInt((max1 * min1));
				if (answer1==answer) {
					System.out.println("Correct!");
				} else if (answer1 != answer) {
					System.out.println("Wrong");
				}
			}
		}
	}

}
