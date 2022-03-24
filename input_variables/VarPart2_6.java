/*
* [VarPart2_6.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 11, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner;

public class VarPart2_6 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Enter the first number: ");
		
		float firstNumber = scan.nextFloat();
		
		System.out.println("Enter the second number: ");
		
		float secondNumber = scan.nextFloat();
		
		System.out.println("Enter the third number: ");
		
		float thirdNumber = scan.nextFloat();
		
		System.out.println("Enter the forth number: ");
		
		float forthNumber = scan.nextFloat();
		
		System.out.println("The average is: " + ((firstNumber + secondNumber + thirdNumber + forthNumber) / 4));
		
		scan.close();
	}

}