/*
* Author: Daniel Dinari
* Date: May 19, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;

public class OutFile12 {

	public static void main(String[] args) throws Exception{
		PrintWriter output = new PrintWriter("file12.txt"); //creating the file
		Scanner input = new Scanner(System.in);
		
		String[] array = new String[5]; //declaring array
		
		for (int i = 0; i < array.length; i++) { //filling array
			System.out.println("Enter a name: ");
			array[i] = input.next();
		}
		
	    for (int i = 0; i < array.length-1; i++) { // represents the number of passes
	    	for (int j = 0 ; j < array.length-1-i; j++) { // number of comparison
	    		if (array[j].compareTo(array[j+1])>0) {
	    			String temp = array[j];
	    			array[j] = array[j+1];
	    			array[j+1] = temp;
	    		}
	    	}
	    } 
    
	    for (int i = 0; i < array.length; i++) {
	      output.println(array[i]);
	    }
		
		output.close();
		input.close();
	}
}