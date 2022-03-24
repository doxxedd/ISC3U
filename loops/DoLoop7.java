/*
* [DoLoop7.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 25, 2020
* Description: <Do Loop Exercises>
*/

package loops;
import java.util.Scanner;
public class DoLoop7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double counter = 0;
		do {
		System.out.println("How many bags of chips would you like to buy?");
		int bags = input.nextInt();
		double cost = 1.25;
		double totcost = (cost * bags);
		String Y = "yes";
		String N = "no";
		System.out.println("You bought " + bags + "bags which costs $" + (totcost) + " total.");
		counter = totcost + counter;
		System.out.println("Would you like to make another purchase? Enter 'yes' or 'no'");
		String response = input.next();

			if (response.equals(Y)) {
			} else if (response.equals(N)) {
			System.out.println("Thanks for shopping with us.");
			System.out.println("Total amount of money collected: $" + counter);
			break;
			}
	
		} while (true);
		input.close();
	}
}