/*
* [Array4.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Mar 6, 2020
* Description: <Array exercises>
*/

package array;
import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String [] word = new String [2];
		for (int i = 0; i < word.length; i++) {
			System.out.println("Enter a word: ");
			word [i] = input.nextLine();
		}

		for (int i = word.length-1; i >= 0; i--) {
			System.out.print(" " + word[i]);
		}
		System.out.println();
		input.close();
	}
}