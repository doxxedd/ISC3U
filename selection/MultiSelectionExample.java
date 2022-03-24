package selection;

import java.util.Scanner;

public class MultiSelectionExample {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your average:");
		int avg = input.nextInt();
		
		if (avg >=80 ) {
			System.out.println("A");
		} else if (avg >= 70 ) {
			System.out.println("B");
		} else if (avg >= 60) {
			System.out.println("C");
		} else if (avg >= 50) {
			System.out.println("D");
		} else {
			System.out.println("Fail");	
		}
		
		input.close();
		
	}
}
