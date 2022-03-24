/*
* [Var3.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 10, 2020
* Description: <Variable assignments>
*/

package input_variables;

import java.util.Scanner; //importing scanner class

public class Var3 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		//declared and create scanner object 
		
		System.out.println("Enter your name: "); //prompt for name
		String name = scan.nextLine(); //reads the string value
		
		System.out.println("Enter your age: "); //prompt for age
		int age = scan.nextInt(); //reads the int value
				
		System.out.println("You have entered: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
		scan.close();
		
	}

}