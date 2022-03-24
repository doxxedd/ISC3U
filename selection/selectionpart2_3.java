/*
* [Selectionpart2_3.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 17, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selectionpart2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the current temperature in Celcius:");
		double temp = input.nextDouble();
		
		if (temp >= 30)
		{ System.out.println("go for a swim.");
		} else if ((temp >= 10) && (temp < 30)) {
			System.out.println("go for a walk.");
		} else {
			System.out.println("Curl up with a good book.");
		}
			
		input.close();
	}
}