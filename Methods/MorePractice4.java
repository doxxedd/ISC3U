package Methods;
import java.util.Scanner;
public class MorePractice4 {
	
	public static boolean getInt(int low, int high, int i) {
		if (i < low || i > high) {
			return false;
		} 
			return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in the max limit: ");
		int max = input.nextInt();
		System.out.println("Enter in the min limit: ");
		int min = input.nextInt();
		System.out.println("Enter your value: ");
		int response = input.nextInt();
		
		
		 if (getInt(min, max, response)) {
			 System.out.println("Your response is valid: " + response);
		 } else {
			 System.out.println("Your response is not valid.");
		 }
		
		input.close();
	}

}
