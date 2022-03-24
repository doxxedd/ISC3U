/*
* [DoLoop4.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 25, 2020
* Description: <Do Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class DoLoop4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		input.close();
		int counter = 0;
		do {
			counter ++;
			System.out.println(counter + ". " + name);
		} while(counter < 10);
	}

}