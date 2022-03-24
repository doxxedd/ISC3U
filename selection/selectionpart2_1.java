/*
* [Selectionpart2_1.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 16, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selectionpart2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the numerator:");
		int numerator = input.nextInt();
		
		System.out.println("Enter the denominator:");
		int denominator = input.nextInt();
		
		input.close();
		if (denominator == 0){
			System.out.println("Division by zero is an illegal operation.");
			return;
		}
		System.out.println("The result is: " + (numerator / denominator));
	}	
}