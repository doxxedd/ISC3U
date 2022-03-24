/*
* [DoLoop1.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 25, 2020
* Description: <Do Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class DoLoop1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		int counter = 0;
		do {
			System.out.println(name);
			counter ++;
		} while ( counter < 10);
		
		input.close();
	}

}