/*
* [DoLoop3.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 25, 2020
* Description: <Do Loop Exercises>
*/

package loops;
public class DoLoop3 {

	public static void main(String[] args) {
		int counter = -1;
		do {
			counter ++;
			System.out.println(counter);
		} while (counter < 100);
		
		int counter2 = 100;
		do {
			counter2 --;
			System.out.println(counter2);
		} while (counter2 > 0 );		
	}

}