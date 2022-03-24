/*
* Author: Daniel Dinari
* Date: May 21, 2020
* Description: <Exit Ticket FileIO>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;
public class ExitTicket {
	public static void main(String[] args) throws Exception { //throwing an exception
		
		int numOfItems = 0;
		
		File file = new File("exitticket.txt"); //creating a file instance

		Scanner fileInput = new Scanner(file); //create a scanner for reading the file
		while(fileInput.hasNext()) { //to find number of items in file
			fileInput.nextLine(); 	
			numOfItems++;
		}
		fileInput.close();
		
		String wordArray[] = new String[numOfItems]; //initializing array
		
		Scanner fileInput2 = new Scanner(file);
		for (int i = 0; i < wordArray.length; i++) {
			if (fileInput2.hasNext()) {
				wordArray[i] = fileInput2.nextLine(); // read the student name and store in array
			}
		}
		fileInput2.close();
				
		//bubble sorting alphabetical order
		for (int i = 0; i < wordArray.length-1; i++) { // represents the number of passes
			for (int j = 0 ; j < wordArray.length-1-i; j++) { // number of comparison
	    		if (wordArray[j].compareTo(wordArray[j+1])>0) {
	    			String temp = wordArray[j];
	    			wordArray[j] = wordArray[j+1];
	    			wordArray[j+1] = temp;
	    		}
	    	}
	    } 
  
	    System.out.println("The wordArray in alphabetical order are...");  //printing alphabetical list
	    for (int i = 0; i < wordArray.length; i++) {
	      System.out.println(wordArray[i]);
	    }
	    
		PrintWriter output = new PrintWriter("exitticket_output.txt"); //creating the new file with new order of items
		for (int i = 0; i < wordArray.length; i++) {
			output.println(wordArray[i]);
		}
		output.close();
	}
}