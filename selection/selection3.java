/*
* [Selection3.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 13, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selection3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature:");
		double temp = input.nextDouble();
		
		if (temp > 30)
		{ System.out.println("hot");
		} else if ((temp >= 20) && (temp <=30)) {
			System.out.println("comfortable");
		} else if ((temp < 20) && (temp >= 10)) { 
			System.out.println("cool");
		} else if (temp <= 9) {
			System.out.println("cold");
	}
		input.close();
	}
}