/*
* [Array1.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 26, 2020
* Description: <Array exercises>
*/
package array;

public class Array1 {

	public static void main(String[] args) {
		
		int[] numArray = new int [20];
		
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = i + 1;
		}
		System.out.println("The numbers in the array are: ");
		for (int i=0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
	}
}