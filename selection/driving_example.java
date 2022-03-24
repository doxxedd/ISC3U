package selection;

import java.util.Scanner;

public class driving_example {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		int age = input.nextInt();
		
		if ( age >= 16) {
			System.out.println("You can get your G1");
			
		} else if (age == 15) {
			System.out.println("You will be able to get your G1 next year.");
		}
		
		else { //otherwise
			System.out.println("You are too young to drive or get your G1.");
		}
		
		System.out.println("Thank you!");
		
		input.close();
	}

}