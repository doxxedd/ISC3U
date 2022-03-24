/*
* [Selection1.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 13, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selection2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your average:");
		int avg = input.nextInt();
		
		if (avg >=50 ) {
			System.out.println("You have passed!");
		} else  {
			System.out.println("Sorry you have failed.");
		}
		
		input.close();
		
	}
}