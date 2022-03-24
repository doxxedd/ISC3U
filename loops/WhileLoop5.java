/*
* [WhileLoop5.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 20, 2020
* Description: <While Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class WhileLoop5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your a word:");
		String word = input.nextLine();
		
		System.out.println("Enter how many times you want to print it:");
		int num = input.nextInt();
		
		input.close();
		
		int counter = 0;	
		while(counter < num) {
			counter ++;
			System.out.println(word);
		}
	}

}