/*
* [VarPart2_8.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 12, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner;

import java.text.DecimalFormat;

public class VarPart2_8 {
	
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);		
	
		System.out.print("Enter your name:");
		
		String name = scan.next();
		
		System.out.print("Enter the price of gas per litre: ");
		
		double priceL = scan.nextDouble();
		
		System.out.print("Enter the total for fill-up: ");
		
		double priceTot = scan.nextDouble();
		
		double litersTot = (((priceTot / priceL) * 100) / 100.0);
		
		System.out.println(name + ", you needed " + df.format(litersTot) + " litres of gas to fill-up your car.");		
		
		scan.close();
	}
}