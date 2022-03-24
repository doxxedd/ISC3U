/*
* Author: Daniel Dinari
* Date: May 19, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;

public class OutFile14 {

	public static void createTriangle(int height) throws FileNotFoundException {
		PrintWriter output = new PrintWriter("file14.txt");
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j < i; j++) {
				output.print("*");
	            }
				output.println();
	    }
		output.close();
	}
	
	public static void main(String[] args) throws Exception{
		PrintWriter output = new PrintWriter("file14.txt"); //creating the file
		Scanner input = new Scanner(System.in);
	   
		System.out.println("Enter the height of the triangle: ");
		int height = input.nextInt();
        createTriangle(height);
		
		output.close();
		input.close();
	}
}