/*
* [Selection4.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 13, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selection4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = input.nextInt();
		
		if (number == 66) {
			System.out.println("You guessed it!");
			{ if (!(number == 66)) {
				System.out.println("Try again!");
			}
			}
	}
		input.close();
}
}
