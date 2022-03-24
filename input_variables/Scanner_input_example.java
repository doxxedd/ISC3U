/*
* [Scanner_input_example.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 10, 2020
* Description: <warm-up with Scanner class>
*/

package input_variables;

import java.util.Scanner; //importing scanner class

public class Scanner_input_example {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		//declared and create scanner object 
		
		System.out.println("Enter your name: ");
		String name = scan.nextLine(); //reads the string value
		
		System.out.println("Enter your age");
		int age = scan.nextInt(); //reads the int value
				
		System.out.println("You have entered: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
		scan.close();
		
	}

}