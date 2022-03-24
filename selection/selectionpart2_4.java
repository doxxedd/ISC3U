/*
* [Selectionpart2_4.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 17, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selectionpart2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of human years:");
		double numHumanYears = input.nextDouble();
		
		input.close();
		
		if (numHumanYears < 0 ) {
			System.out.println("Error, invalid input.");
			return; }
		
		if (numHumanYears <= 2) {
			System.out.println(numHumanYears + " is: " + (5.25 * numHumanYears) + " dog years.");
		} else if (numHumanYears > 2) {
			double past2years = (numHumanYears - 2);
			System.out.println(numHumanYears + " human years is " + ((4 * past2years) + (10.5)) + " dog years.");
		}

	}
}