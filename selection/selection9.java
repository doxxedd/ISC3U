/*
* [Selection8.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 16, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selection9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first mark:");
		double mark1 = input.nextDouble();
		System.out.println("Enter the first mark:");
		double mark2 = input.nextDouble();
		
		if (mark1 > mark2) {
			System.out.println(mark2 + " is the lower mark.");
		} else if (mark2 > mark1) {
			System.out.println(mark1 + " is the lower mark.");
		}
		
		input.close();
	}

}
