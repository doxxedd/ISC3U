/*
* [Loop4.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 19, 2020
* Description: <For Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class Loop4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		input.close();
		
		for(int i=0; i < 10; i++) {
			System.out.println((i+1) + ". " + name);
		}
	}

}