/*
* Author: Daniel Dinari
* Date: May 19, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
public class OutFile1 {

	public static void main(String[] args) throws Exception { //throwing an exception
		PrintWriter output = new PrintWriter("file1.txt"); //creating the file

		output.print("Daniel Dinari");
		
		output.close();
	}

}