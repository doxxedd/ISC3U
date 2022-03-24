/*
* [Array7.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Mar 7, 2020
* Description: <Array exercises>
*/

package array;
import java.util.Scanner;
public class Array7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int [10];
		
			for (int i = 0; i < nums.length; i++) {
				System.out.println("Enter a number: ");
				nums[i] = input.nextInt();
				int response = nums[i];
	            input.nextLine();
				if (response == 0) {
					break;
				}
			}
		
			System.out.println("Positive ");
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] >= 1) {
					System.out.println(nums[i]);
				}
			}
			
			System.out.println("Negative: ");
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] < 0) {
					System.out.println(nums[i]);
				}
			}
	
		input.close();
	}
}