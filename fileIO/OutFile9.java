/*
* Author: Daniel Dinari
* Date: May 19, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;

public class OutFile9 {

	public static void main(String[] args) throws Exception{
		PrintWriter output = new PrintWriter("file9.txt"); //creating the file
		Scanner input = new Scanner(System.in);
		
		int highest = 0;
		
		for (int i = 0; i < 3; i++) { //filling array
			System.out.println("Enter the mark: ");
			int response = input.nextInt();
			if ((response >= 0) && (response <= 100)) {
				if (response > highest) { //finding 
					highest = response;
				}
    		}
		}
		output.println("The person with the highest mark is has a mark of: " + highest);
		
		output.close();
		input.close();
	}
}