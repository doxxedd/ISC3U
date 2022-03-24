/*
* [VarPart2_2.java]
*Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 11, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner; //imported the scanner class

public class VarPart2_2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the amount of hours: ");
		
		int hours = scan.nextInt();
		
		System.out.println("Enter the amount of minutes: ");
		
		int minutes = scan.nextInt();
		
		System.out.println("Total number of minutes = " + ((hours * 60) + (minutes))); //times hours by 60 then adds the minutes
		
		scan.close();
	}

}