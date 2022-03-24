package Methods;
import java.util.Scanner;
public class PartA_3 {
	
	public static double km2miles (double km) {
		return (km / 1.609);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value in KM that you want to convert to miles: ");
		double response = input.nextDouble();
		
		double result = km2miles(response);
		System.out.println("Your value converted is: " + result);
		
		input.close();
	}
}