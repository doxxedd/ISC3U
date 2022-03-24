/*
* [Selectionpart2_2.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 17, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selectionpart2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the employee name:");
		String name = input.nextLine();
		
		System.out.println("Enter the number of hours worked:");
		double numHours = input.nextDouble();
		
		System.out.println("Enter the hourly wage:");
		double numWage = input.nextDouble();
		
		input.close();
		
		if (numHours <= 40) {
			System.out.println(name + " your regular pay is: " + (numHours * numWage));
			System.out.println("Your overtime pay is: 0");
			System.out.println("Your gross pay is: " + (numHours * numWage));
		} else if (numHours > 40) {
			double overtimeHours = (numHours - 40);
			System.out.println(name + " your regular pay is " + (40 * numWage));
			System.out.println("Your overtime pay is: " + (overtimeHours * numWage * 1.5));
			System.out.println("Your gross pay is: " + ((40 * numWage) + (overtimeHours * numWage * 1.5)));
		}
		
	}
}