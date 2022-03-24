/*
* [Var4.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 11, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner; //importing scanner class

public class Var4 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		//declared and create scanner object 
		
		System.out.println("Enter the first number: "); //prompt for 1st number
		int FirstNum = scan.nextInt(); //reads the 1st value
		
		System.out.println("Enter the second number: "); //prompt for 2nd number
		int SecondNum = scan.nextInt(); //reads the 2nd value
				
		System.out.println("The sum = " + (FirstNum + SecondNum));
		
		scan.close();
		
	}

}