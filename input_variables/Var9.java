/*
* [Var9.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 11, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner; //importing scanner class

public class Var9 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		//declared and create scanner object 
		
		System.out.println("Enter your first name: "); //prompt for first name
		
		String firstName = scan.next();
				
		System.out.println("Enter your last name: "); //prompt for last name
		
		String lastName = scan.next();
				
		System.out.println("Hello " + (firstName) + " " + (lastName) + "! How are you?");
		
		scan.close();
		
	}

}