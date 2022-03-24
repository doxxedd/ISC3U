/*
* Author: Daniel Dinari
* Date: May 19, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;

public class OutFile10 {

	public static void main(String[] args) throws Exception{
		PrintWriter output = new PrintWriter("file10.txt"); //creating the file
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println("Username:");
			String user = input.next();
			System.out.println("Password:");
			String pass = input.next();
			if (pass.equals("happy")); { //check for pw
				output.println(user);
			}
			if (user.equals("quit")) {
				break;
			}
			if (pass.equals("quit")) {
				break;
			}
		}

		output.close();
		input.close();
	}
}