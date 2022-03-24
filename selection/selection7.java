/*
* [Selection7.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 16, 2020
* Description: <Selection Exercises>
*/

package selection;

import java.util.Scanner;

public class selection7 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the password:");
        String password = input.next();
        
        if (password.equals("happy") ) {
            System.out.println("You have logged in."); 
        } else {
        	System.out.println("Incorrect password."); 
        }
            
        input.close();
	}
}