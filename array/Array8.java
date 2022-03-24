package array;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        String[] firstName = new String[10];
        String[] lastName = new String[10];
        int[] mark = new int[10];
        int counter = 0;
        int accu = 0;
        double avg;

        for (int i = 0; i < mark.length; i++){
            System.out.println("Enter the last name:");
            lastName[i] = input.nextLine();

            
            System.out.println("Enter the first name:");
            firstName[i] = input.nextLine();

            
            System.out.println("Enter the mark or end the program by inputing a negative number. ");
            mark[i] = input.nextInt();
            int response = mark[i];
            input.nextLine();
            if (response < 0) {
				break;
			}
        }
        
        System.out.println("Would you like to see the pass or fail?");
        String answer = input.nextLine();
       
        if (answer.equals("pass")) {
        	for (int i = 0; i < mark.length; i++){
        		if (mark[i] >= 50){
        			counter++;
        			accu = accu + mark[i];
        			System.out.println(lastName[i] + " " + firstName[i] + "'s mark is " + mark[i]);
                }
            }
        }
        
        if (answer.equals("fail")) {
        	for (int i = 0; i < mark.length; i++){
        		if (mark[i] < 50){
        			counter++;
        			accu = accu + mark[i];
        			System.out.println(lastName[i] + " " + firstName[i] + "'s mark is " + mark[i]);
        		}
        	}
        }
        
        if (counter > 0 ) {
        	avg = accu / counter;
            System.out.println("The class average is %" + avg);
        } else {
        	System.out.println("Invalid inputs");
        }
        
        input.close();
    } 
}