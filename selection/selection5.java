/*
* [Selection5.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 13, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selection5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the secret number:");
		int num1 = input.nextInt();
		
		System.out.println("Enter the secret number:");
		int num2 = input.nextInt();
		
		if (num1 == num2) {
			System.out.println("You got it!");
		} else System.out.println("Guess again.");
		
		input.close();
	}	
}