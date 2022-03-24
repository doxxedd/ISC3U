/*
* [Selection1.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 13, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selection1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int value;
    
    System.out.println("Enter a value between 1 and 10: ");
    value = input.nextInt();
    
    if (value >= 5) {
    	System.out.println("You won!");
    } else {
    	System.out.println("You lost!");
    }
    	System.out.println("Program ending...");
   
    
    input.close();
  }
}