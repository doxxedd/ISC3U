/*
* Author: Daniel Dinari
* Date: May 19, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;

public class OutFile13 {

	public static void main(String[] args) throws Exception{
		PrintWriter output = new PrintWriter("file13.txt"); //creating the file
		Scanner input = new Scanner(System.in);
		
		String [] name = new String [1];
		int [] mark = new int [1];
		
		for (int i = 0; i < 1; i++) {
			System.out.println("Enter the name: (hit enter twice)");
			name[i] = input.nextLine();
			
			input.nextLine();
			System.out.println("Enter their mark:");
			mark[i] = input.nextInt();
		}
	    for (int i = 0; i < 1; i++) {
		      output.println(name[i] + " " + mark[i] +"%");
		}
		
		
		output.close();
		input.close();
	}
}