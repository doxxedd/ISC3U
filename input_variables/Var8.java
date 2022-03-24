/*
* [Var8.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 11, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner;

public class Var8 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("How much money would you like to invest?");
		
		double invest = scan.nextDouble();
		
		System.out.println("How much interest rate is there in precent?");
		
		double rate = scan.nextDouble();
		
		System.out.println("For how many years?");
		
		double time = scan.nextDouble();
		
		System.out.println("The total intrest earned is: " + "$" + ((invest * rate * time) /100));
		
		System.out.println("The total money given back is: " + "$" + (invest + ((invest * rate * time) /100)));
		
		scan.close();
	}
}