/*
* Author: Daniel Dinari
* Date: May 19, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;

public class OutFile8 {

	public static void main(String[] args) throws Exception{
		PrintWriter output = new PrintWriter("file8.txt"); //creating the file
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) { //asking user
			System.out.println("Enter the mark: ");
			int response = input.nextInt();
			if ((response >= 0) && (response <= 100)) {
				output.println(response);
			}
		}
		
		output.close();
		input.close();
	}
}