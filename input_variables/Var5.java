/*
* [Var5.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 11, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner;

public class Var5 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		double firstNumber = scan.nextDouble();
		
		System.out.println("Double your number = " + (firstNumber * 2));
		
		scan.close();
		
	}

}
