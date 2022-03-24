package array;
import java.util.Scanner;
import java.util.stream.*;
public class ArrayProcessing2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String [] name = new String [10];
		int [] math = new int [10];
		int [] science = new int [10];
		int counter = 0;
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("Enter the name: (Hit enter twice)");
			name[i] = input.nextLine();
			counter++;
			
			input.nextLine();
			System.out.println("Enter the math mark: ");
			math[i] = input.nextInt();

			System.out.println("Enter the science mark: ");
			science[i] = input.nextInt();
			
		}
		
		int sumMath = IntStream.of(math).sum();
		System.out.println("The math avg is: " + (sumMath / counter));
		
		int sumScience = IntStream.of(science).sum();
		System.out.println("The science avg is " + (sumScience / counter));
		
		input.close();
	}
}