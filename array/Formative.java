/*
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: May 5th, 2020
* Description: Write a program that:
*Asks for students’ names and marks (out of 100). The program should store information for up to 100 students, however give the option to the user to stop entering data early
*2.Once all the students are entered, the program should:
*1.Display names and marks
*2.Highest
*3.Average
*4.Update mark
*5.Add Student
*6.Exit
*Bonus: Add another option: I – delete a student
*Add the following options to the menu choices in Part ONE
*Sort Names
*Sort the names in Alpha order 
*Sort Marks
*Sort the marks in ascending order
*/
package array;
import java.util.Scanner;
public class Formative {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] name = new String[2];
		int[] mark = new int[2];
		int counter = 0;
        int accu = 0;
        double avg = 0;
        
        for (int i = 0; i < mark.length; i++){
            System.out.println("Enter the name:");
            name[i] = input.nextLine();
            counter++;
            
            System.out.println("Enter the mark or stop inputting by typing a negative number");
            mark[i] = input.nextInt();
            int response = mark[i];
            input.nextLine();
            accu = accu + mark[i];
            if (response < 0) {
				break;
			}
        }
        
        System.out.println("Type '1' for displaying names and marks: ");
        System.out.println("Type '2' to list the student with the highest mark: ");
        System.out.println("Type '3' to find the average of all students: ");
        System.out.println("Type '4' to update a student's mark: ");
        System.out.println("Type '5' to add a student and their mark to the list: ");
        System.out.println("Type '6' to exit the program: ");
        System.out.println("Type '7' to delete a student: ");
        System.out.println("Type '8' to sort names in alphabetical order: ");
        System.out.println("Type '9' to sort marks in accending order: ");
        int menuAnswer = input.nextInt();
        
        if (menuAnswer == 1) {
        	System.out.println("The Students and their marks are: ");
        	
        	for (int i = 0; i < name.length; i++) {
    			if (mark[i] > 0) {
    				System.out.println("Name: " + name[i]);
        			System.out.println("Mark: "+ mark[i]);
    			}
    		}
        }
        
        if (menuAnswer == 2) {
        	int highest = 0;
    		for (int i = 1; i < mark.length; i++) {
    			if (mark [highest] < mark [i]) {
    				highest = i;
    			}
    		}
			System.out.println("The person with the highest mark is " + name[highest] + " with the mark of: " + mark[highest]);
        }
        
        if (menuAnswer == 3) {
        	avg = accu / counter;
            System.out.println("The class average is %" + avg);
        }
        
        if (menuAnswer == 4) {
        	System.out.println("Enter the students name:");
        	String response = input.nextLine();
        	System.out.println("Enter the mark that you want to change to:");
        	int response2 = input.nextInt();
        	
        	for (int i = 0; i < mark.length; i++) {
        		if (name[i] == response) {
        			mark[i] = response2;
        		}
        	}
        }
        
        if (menuAnswer == 5) {
        	System.out.println("Type the name you want to add: (Note: for this to work, the array must not be filled with 100 students)");
        	String response3 = input.nextLine();
        	for (int i = 0; i < name.length; i++) {
        		response3 = name[100];
        	}
        }
        
        if (menuAnswer == 6) {
        	System.out.println("Thanks for using this program!");
        }
        
        if (menuAnswer == 7) {
        	System.out.println("Enter the student you want to delete:");
        	String response4 = input.nextLine();
        	for (int i = 0; i < name.length; i++) {
        		response4 = name[i];
        		name[i] = null;
        	}
        }
        
        if (menuAnswer == 8) {
    	    for (int i = 0; i < name.length-1; i++) { // represents the number of passes
    	    	for (int j = 0 ; j < name.length-1-i; j++) { // number of comparison
    	    		if (name[j].compareTo(name[j+1])>0) {
    	    			String temp = name[j];
    	    			name[j] = name[j+1];
    	    			name[j+1] = temp;
    	    		}
    	    	}
    	    } 
        
    	    System.out.println("The name in alphabetical order are...");
    	    for (int i = 0; i < name.length; i++) {
    	      System.out.println(name[i]);
    	    }
        }
        
        if (menuAnswer == 9) {
        	int n = mark.length;
    		for (int i = 0; i < n-1; i++) { // #passes
    			for (int j = 0; j < (n-1)-i; j++) { //# of comparisons
    				if (mark[j] > mark [j+1]) { // comparison
    					int temp = mark[j];
    					mark[j] = mark[j+1];
    					mark[j+1] = temp;
    				}
    			}
    		} 
    		System.out.println("Marks in acending order: ");
    	    int n2 = mark.length; 
    	    for (int i = 0; i < n2 ; ++i) {
    	    	System.out.println(mark[i]); 
    	        }
        }
        
        input.close();
	}
}
