package Methods;
import java.util.Scanner;
public class PartA_1 {

	public static double cm2inch (double cm) {
		return (cm / 2.54);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value in cm to convert to inche(s): ");
		double response = input.nextDouble();
		
		double result = cm2inch(response);
		System.out.println("Your value converted to inche(s) is: " + result);
		
		input.close();
	}

}