/*
* [VarPart2_4.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 11, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner;

public class VarPart2_4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first angle: ");
		
		double num1 = scan.nextDouble();
		
		System.out.println("Enter the second angle: ");
		
		double num2 = scan.nextDouble();
		
		System.out.println((180 - (num1 + num2)) + " is the third angle");
		
		scan.close();
	}

}