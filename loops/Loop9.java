/*
* [Loop9.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 19, 2020
* Description: <For Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class Loop9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter your mark:");
			sum += input.nextInt();
		}
		
		System.out.println("Your average is: " + (sum / 3));
		input.close();
	}

}