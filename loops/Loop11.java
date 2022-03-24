/*
* [Loop11.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 19, 2020
* Description: <For Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class Loop11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int low = 101;
		int num;
		
		for(int i=1; i<6; i++) {
			System.out.println("Enter a mark:");
			num = input.nextInt();
			if (num < low) {	
			low = num;
			}
		}
		
        System.out.println("The lowest is: " + low);
		input.close();
	}
}