package Methods;
import java.util.Scanner;
public class PartA_2 {

	public static double lb2kg (double lb) {
		return (lb / 2.2);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value in lb to convert to kg: ");
		double response = input.nextDouble();
		
		double result = lb2kg(response);
		System.out.println("Your value in kg is: " + result);
		
		input.close();
	}

}
