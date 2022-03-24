/*
* [WhileLoop7.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 20, 2020
* Description: <While Loop Exercises>
*/

package loops;
public class WhileLoop7 {

	public static void main(String[] args) {
						
		int counter = 0;	
		int sum = 0;

		while(counter < 10) {
			counter ++;
			System.out.println(counter);
			sum += counter;
		}
		
		System.out.println("Sum is: " + sum);
	}

}