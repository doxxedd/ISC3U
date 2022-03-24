package array;
import java.util.Scanner;
import java.util.stream.*;
public class ArrayProcessing1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] array = new int [10];
		
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter a number: ");
				array[i] = input.nextInt();
			}
		
		int highest = array [0];
		for (int i = 1; i < array.length; i++) {
			if (highest < array [i]) {
				highest = array [i];
			}
		}
		System.out.println("The highest number entered is  is: " +  highest);
		
		int lowest = array [0];
		for (int i = 1; i < array.length; i++) {
			if (lowest > array [i]) {
				lowest = array [i];	
			}
		}
		System.out.println("The lowest number entered is : " + lowest);
		
		int sum = IntStream.of(array).sum();
		System.out.println("The sum is: " + sum);
		
		int temp = array [3];
		array[3] = array [4];
		array [4] = temp;
		
		System.out.println("The swapped 4th and 5th value list is :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		input.close();
	}
}