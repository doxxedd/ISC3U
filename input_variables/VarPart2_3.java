/*
* [VarPart2_3.java]
*Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 11, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner; //imported the scanner class

public class VarPart2_3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the amount of minutes: ");
		
		int mins = scan.nextInt();
		
		System.out.println("Number of hours: " + (mins / 60));
		
		System.out.println("Number of minutes: " + (mins % 60));

		scan.close();
	}
}