/*
* [Loop1.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 17, 2020
* Description: <For Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class Loop1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		input.close();
		
		for(int i=1; i < 10; i++) {
			System.out.println(name);
		}
	}

}