package sorting;
import java.util.Scanner;
public class Sort5 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    String [] names = new String[5];
	    
	    for (int i = 0; i < names.length; i++) {
	      System.out.print("Please enter a name:");
	      names[i] = input.nextLine();
	    }
	    
	    for (int i = 0; i < names.length-1; i++) { // represents the number of passes
	    	for (int j = 0 ; j < names.length-1-i; j++) { // number of comparison
	    		if (names[j].compareTo(names[j+1])>0) {
	    			String temp = names[j];
	    			names[j] = names[j+1];
	    			names[j+1] = temp;
	    		}
	    	}
	    } 
	    
	    System.out.println("The names in alphabetical order are...");
	    for (int i = 0; i < names.length; i++) {
	      System.out.println(names[i]);
	    }
	    
	    input.close();
	}  
}