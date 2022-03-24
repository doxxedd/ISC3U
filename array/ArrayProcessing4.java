package array;
import java.util.Scanner;
public class ArrayProcessing4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] values = { "one", "two", "five", "four", "three", "six" };
		
		String temp = values[2];
		values[2] = values [4];
		values [4] = temp;
		
		for (int a = 0; a < values.length; a++) {
			System.out.println(values[a]);
		}
		
			System.out.println("Enter two values between 5-0: ");
			System.out.println("i = ");
			int i = input.nextInt();
			System.out.println("j = ");
			int j = input.nextInt();
		
		input.close();
	}
}