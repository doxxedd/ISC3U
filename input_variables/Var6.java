/*
* [Var6.java]
*Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 11, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner;

public class Var6 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Enter a number: ");
		
		int firstNumber = scan.nextInt();
		
		System.out.println("Enter another number: ");
		
		int secondNumber = scan.nextInt();
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
		
		System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
		
		System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
		
		System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
		
		System.out.println(firstNumber + " / " + secondNumber + " remainder is " + (firstNumber % secondNumber));
		
		scan.close();
		
	}

}