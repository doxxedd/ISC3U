package Methods;
import java.util.Scanner;
public class MorePractice1 {
	
	public static int sumOdd(int value, int sum) {
		for (int i = 0; i < value; i++) {
			if (i % 2 != 0) {
				
			} else {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter a value: ");
		int value = input.nextInt();
				
		System.out.println("The result is: " + sumOdd(value, sum));
		
		input.close();
	}

}