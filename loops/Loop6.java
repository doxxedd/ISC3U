/*
* [Loop6.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 19, 2020
* Description: <For Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class Loop6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your a word:");
		String word = input.nextLine();
		
		System.out.println("Enter how many times you want to print it:");
		int num = input.nextInt();
		
		input.close();
		
		for(int i=0; i < num; i++) {
			System.out.println((i+1) + ". " + word);
		}
	}

}