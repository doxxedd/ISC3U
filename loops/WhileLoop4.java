/*
* [WhileLoop4.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 20, 2020
* Description: <While Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class WhileLoop4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		input.close();
		int counter = 0;
		
		while(counter < 10) {
			counter ++;
			System.out.println(counter + ". " + name);
		}
	}

}