/*
* Author: Daniel Dinari
* Date: May 20, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;
public class InFile1 {
	public static void main(String[] args) throws Exception { //throwing an exception
		File file = new File("file1.txt"); //creating a file instance
		Scanner fileInput = new Scanner(file); //create a scanner for reading the file
		
		while (fileInput.hasNext()) {
			String info = fileInput.nextLine(); //reading the line
			System.out.println(info);
		}
		fileInput.close();

	}
}