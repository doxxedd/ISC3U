/*
* [Array3.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Mar 6, 2020
* Description: <Array exercises>
*/

package array;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int [10];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number: ");
			numbers[i] = input.nextInt();
		}
		
		System.out.println("Enter a limit: ");
		int limit = input.nextInt();
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= limit) {
				System.out.println(numbers[i]);
			}
		}
	
		input.close();
	}
}