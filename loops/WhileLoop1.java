/*
* [WhileLoop1.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 19, 2020
* Description: <While Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class WhileLoop1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		int counter = 0;
		while ( counter < 10) {
			counter ++;
			System.out.println(name);
		}
		
		input.close();
	}

}