package Methods;
import java.util.Scanner;
public class MorePractice5 {
	
	public static int sumOdd(int value, int sum) {
		for (int i = 0; i < value; i++) {
			if (i % 2 != 0) {
				
			} else {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static double factorial(double num) {
		double fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return (fact);
	}
	
	public static boolean prime(int num) {
		int temp;
		
		for(int i=2; i <= num/2; i++)
		{
	       temp = num % i;
		   if(temp == 0)
		   {
		      return false;
		   }
		}
		return true;
	}
	
	public static boolean getInt(int low, int high, int i) {
		if (i < low || i > high) {
			return false;
		} 
			return true;
	}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which program do you want to use? 'sum', 'factorial' or 'prime'? ");
		String response = input.nextLine();
		
		if (response.equals("sum")) {
			int sum = 0;
			System.out.println("Enter a value: ");
			int value = input.nextInt();		
			
			
			int min = 0;
			int max = Integer.MAX_VALUE;
			if (getInt(min, max, value)) {
				System.out.println("The result is: " + sumOdd(value, sum));
			} else {
				System.out.println("Your response is not valid.");
			}
			
		} else if (response.equals("factorial")) {
			System.out.println("Enter the number to be factorialized: ");
			int num = input.nextInt();	
						
			int min = 0;
			int max = 100;
			if (getInt(min, max, num)) {
				System.out.println("The result is: " + factorial(num));
			} else {
				System.out.println("Your response is not valid.");
			}
		} else if (response.equals("prime")) {
			System.out.println("Enter any number:");
			int num = input.nextInt();
			
			int min = 0;
			int max = Integer.MAX_VALUE;
			
			if (getInt(min, max, num)) {
				if(prime(num)) { 
					System.out.println("It is a prime number"); 	   
				} else {
					System.out.println("Not a prime number");	
				}
			} else {
				 System.out.println("Your response is not valid.");
			}
		}

		input.close();
	}
}