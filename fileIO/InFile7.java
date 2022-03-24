/*
* Author: Daniel Dinari
* Date: May 20, 2020
* Description: <FileIO exercises>
*/

package fileIO;
import java.io.*; //importing the class required to write to a file
import java.util.Scanner;
public class InFile7 {
	public static void main(String[] args) throws Exception { //throwing an exception
		File file = new File("file4.txt"); //creating a file instance
		Scanner fileInput = new Scanner(file); //create a scanner for reading the file
		
		int array[] = new int[5];
        while(fileInput.hasNext()) {
            for (int i = 0; i < array.length; i++) {
                array[i] = fileInput.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
		
        int n = array.length;
		for (int i = 0; i < n-1; i++) { // #passes
			for (int j = 0; j < (n-1)-i; j++) { //# of comparisons
				if (array[j] > array [j+1]) { // comparison
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		} 
		System.out.println("Numbers in acending order:");
	    int n2 = array.length; 
	    for (int i = 0; i < n2 ; ++i) {
	    	System.out.println(array[i]);
	    }
		
        fileInput.close();
	}
}