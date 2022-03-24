/*
* Author: Daniel Dinari
* Date: May 20, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;
public class InFile6 {
	public static void main(String[] args) throws Exception { //throwing an exception
		File file = new File("file7.txt"); //creating a file instance
		Scanner fileInput = new Scanner(file); //create a scanner for reading the file
		
		String array[] = new String[20];
        while(fileInput.hasNext()) {
            for (int i = 0; i < array.length; i++) {
                array[i] = fileInput.nextLine();
            }
        }
        for (int i = 20; i < array.length; i--) {
            System.out.println(array[i]);
        }
        fileInput.close();
	}
}