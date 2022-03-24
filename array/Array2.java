/*
* [Array2.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Mar 6, 2020
* Description: <Array exercises>
*/

package array;
import java.util.Scanner;
public class Array2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] nums = new int [10];
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Enter a number: ");
			nums[i] = input.nextInt();
		}
		System.out.println("A: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("B: ");
		for (int i = nums.length -1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
		
		System.out.println("C: ");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0) {
				System.out.println(nums[i]);
			}
		}
		
		System.out.println("D: ");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				System.out.println(nums[i]);
			}
		}
		
		input.close();
	}
}