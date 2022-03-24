/*
 * Write a program to determine the cost of an automobile insurance premium based on age number of accidents 
 * Basic insurance charge is $500
 * If driver is under 25 add additional $100 + 
 * accident 1 = 50
 * 2 = 125
 * 3 = 225
 * 4 = 375
 * 5 = 575
 * 6 or more = no insurance
 * repeat for multiple customers
 * at the end state how many customers have been quoted and the avg cost of insurance for all of them
 */

package UnitReviews;
import java.util.Scanner;
public class unit_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int totalPrice = 0;
		int customerNum = 0;
		
		do {
			
			int price = 500;
			
			System.out.println("What is your age?");
			int age = input.nextInt();
			
			System.out.println("How many accidents have you been in?");
			int accident = input.nextInt();
			input.nextLine();
			
			if (age >= 25 ) {
				totalPrice = 500;
			}
			if (age < 25) {
				price = price + 100;
			}
			
			if (accident == 1) {
				price = price + 50;
				totalPrice += price;
			} else if (accident == 2) {
				price = price + 125;
				totalPrice += price;
			} else if (accident == 3) {
				price = price + 225;
				totalPrice += price;
			} else if (accident == 4) {
				price = price + 375; 
				totalPrice += price;
			} else if (accident == 5) {
				price = price + 575;
				totalPrice += price;
			} else if (accident == 6) {
				price += 0;
				totalPrice = price;
				System.out.println("You dont get insurance.");
			}
			customerNum ++;
			
			System.out.println("Your price is $" + price);
			
			System.out.println("Are there any more niggas?");
			String answer = input.next();
			
			if (answer.equals("yes")) {
			} else if (answer.contentEquals("no")) { 
				break; 
			}
		}while (true);
		
		totalPrice = totalPrice / customerNum;
		System.out.println("Number of customers quoted are " + customerNum);
		System.out.println("Average of all insurance quotes are $" + totalPrice);
		input.close();
	}
}