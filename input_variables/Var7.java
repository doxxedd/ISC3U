/*
* [Var7.java]
*Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 11, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner;

public class Var7 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Enter the length: ");
		
		int l = scan.nextInt();
		
		System.out.println("Enter the width: ");
		
		int w = scan.nextInt();
		
		System.out.println("The Area = " + (l * w));
		
		System.out.println("THe Perimeter = " + (l + l + w + w));
		
		scan.close();
		
	}

}