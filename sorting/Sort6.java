package sorting;
import java.util.Scanner;
public class Sort6 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    String[] names;
	    int numberOfNames;
	    
	    System.out.println("How many names do you want to enter?");
	    numberOfNames = input.nextInt();
	    input.nextLine();
	    
	    names = new String[numberOfNames];
	    
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
	    
	    System.out.println("The names in sorted order are...");
	    for (int i = 0; i < names.length; i++) {
	      System.out.println(names[i]);
	    }
	    
	    input.close();
	}  
}