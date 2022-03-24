/*
* [DoLoop9.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 20, 2020
* Description: <Selection Exercises>
*/

package loops;

import java.util.Scanner;

public class DoLoop6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = "dad";
        int counter = 1;

        System.out.println("Enter the word:");
        String guess = input.nextLine();

        do {
            if (guess.equals(word)){
                System.out.println("The word was " + word);
                System.out.println("You got it in " + counter + " guess(es).");
                break;
            }else if(guess != word) {
                counter ++;
                System.out.println("Wrong, guess again.");
                System.out.println("Enter the word:");
                guess = input.nextLine();
            }
        }while(true);
        input.close();
    }
}