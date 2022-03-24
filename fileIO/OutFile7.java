/*
* Author: Daniel Dinari
* Date: May 19, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;

public class OutFile7 {

	public static void main(String[] args) throws Exception{
		PrintWriter output = new PrintWriter("file7.txt"); //creating the file
		Scanner input = new Scanner(System.in);
		
		int[] array = new int [15]; //declaring array
		
		for (int i = 0; i < array.length; i++) { //filling array
			System.out.println("Enter a number between 1-20: ");
			array[i] = input.nextInt();
		}
		
		int n = array.length;
		for (int i = 0; i < n-1; i++) { // #passes
			for (int j = 0; j < (n-1)-i; j++) { //# of comparisons
				if (array[j] > array [j+1]) { // comparison
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		} 
		System.out.println("Numbers in acending order:");
	    int n2 = array.length; 
	    for (int i = 0; i < n2 ; ++i) {
	    	System.out.println(array[i]);
			output.println(array[i]);
	    }
		
		output.close();
		input.close();
	}
}