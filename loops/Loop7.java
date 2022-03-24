/*
* [Loop7.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 19, 2020
* Description: <For Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class Loop7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to start counting from:");
		int numStart = input.nextInt();
		
		System.out.println("Enter a number to stop counting to:");
		int numEnd = input.nextInt();
		
		input.close();
		
		for(int i=numStart; i < numEnd + 1; i++) {
			System.out.println(i);
		}
	}

}