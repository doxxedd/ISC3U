package Methods;
import java.util.Scanner;
public class ExitTicket {
	
	public static double milesToKM (double miles) {
		return (miles * 1.61);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double [] array = new double [10];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Enter the value in KM that you want to convert to miles: ");
			array [i] = input.nextDouble();
		}
		
		for (int i = 0; i < array.length; i++) {
			double result = milesToKM(array[i]);
			System.out.println("Your value converted is: " + result);	
		}		
		input.close();
	}
}