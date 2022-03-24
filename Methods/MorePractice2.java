package Methods;
import java.util.Scanner;
public class MorePractice2 {
	
	public static double factorial(double num) {
		double fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return (fact);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to be factorialed: ");
		double num = input.nextDouble();
		
		System.out.println(factorial(num));
		
		input.close();
	}

}