/*
* Author: Daniel Dinari
* Date: May 19, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;

public class OutFile5 {

	public static void main(String[] args) throws Exception{
		PrintWriter output = new PrintWriter("file5.txt"); //creating the file
		Scanner input = new Scanner(System.in);
		
		String[] array = new String [20]; //declaring array
		
		for (int i = 0; i < array.length; i++) { //filling array
			System.out.println("Enter a number: ");
			array[i] = input.nextLine();
			output.println(array[i]);
		}
		
		output.close();
		input.close();
	}
}