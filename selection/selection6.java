/*
* [Selection6.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 13, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selection6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a mark out of a 100:");
		double mark = input.nextDouble();
		
		if ((mark<=100) && (mark>=75)) {
			System.out.println("Great");
		} else if ((mark<75)&&(mark>=50)) {
			System.out.println("Pass");
		} else if ((mark<50)&&(mark>=0)) {
			System.out.println("Fail");
		} else if ((mark>=100) || (mark<=0)) {
			System.out.println("Invalid");
		}
	
		input.close();
	}

}
