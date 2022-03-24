/*
* Author: Daniel Dinari
* Date: May 19, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
public class OutFile3 {

	public static void main(String[] args) throws Exception{
		PrintWriter output = new PrintWriter("file3.txt"); //creating the file
		
		for (int i = 1; i < 11; i++) {
			output.print(i + " ");
		}
		
		output.close();
	}
}