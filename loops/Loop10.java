/*
* [Loop10.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 19, 2020
* Description: <For Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class Loop10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int high = 0;
		int num;
		
		for(int i=0; i<5; i++) {
			System.out.println("Enter a mark:");
			num = input.nextInt();
			if (num > high) {	
			high = num;
			}
		}
		
        System.out.println("The highest is: " + high);
		input.close();
	}
}