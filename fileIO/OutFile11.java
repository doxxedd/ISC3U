/*
* Author: Daniel Dinari
* Date: May 19, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;

public class OutFile11 {

	public static void main(String[] args) throws Exception{
		PrintWriter output = new PrintWriter("file11.txt"); //creating the file
		Scanner input = new Scanner(System.in);
		
		String[] array = new String[5]; //declaring array
		
		for (int i = 0; i < array.length; i++) { //filling array
			System.out.println("Enter a name: ");
			array[i] = input.next();
			output.println(array[i]); //printing the names in file
		}
		
		output.close();
		input.close();
	}
}