package Methods;
import java.util.Scanner;
public class ProcedurePartA_2 {
	
	public static void interestBalance(double before, double rate, double years) {
		double interest = before * rate * years;
		System.out.println("Total interest earned is: " +  Math.round(interest));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the interest rate in decimal form: ");
		double rate = input.nextDouble();
		System.out.println("Enter the amount of money at the beginning of the year: ");
		double before = input.nextDouble();
		double years = 1;
		
		interestBalance(before, rate, years);
		
		input.close();
	}

}