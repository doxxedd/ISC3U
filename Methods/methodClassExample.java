package Methods;
import java.util.Scanner;
public class methodClassExample {

	public static int square(int number) {
		int result = number * number;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number you want to square:");
		int response = input.nextInt();
		
		int myResult = square(response);
		System.out.println("The square of the number you entered is: " + myResult);
		
		input.close();
	}

}
