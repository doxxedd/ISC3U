/*
* [Loop8.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 19, 2020
* Description: <For Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class Loop8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		for (int i=0; i<5; i++) {
			System.out.println("Enter the a number:");
			num = input.nextInt();
			sum = sum + num;
		}
		System.out.println(sum);
		input.close();
	}

}