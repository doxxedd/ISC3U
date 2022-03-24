package array;
import java.util.Scanner;
public class ArrayGrouptTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter the array size: ");
		int max = input.nextInt();
		
		int[] list = new int [max];
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("Enter a number: ");
			list[i] = input.nextInt();
		}
		
		System.out.println("Search a number in the array: ");
		int search = input.nextInt();
		
		int check =0;
		for (int i = 0; i <list.length; i++) {
			if (list[i] == search) {
				System.out.println("The position of your search in the array is: " + (i + 1));
				i += max;
				check = 1;
			}
		}
		
		if (check == 0) { 
			System.out.println("The number does not exist in the number.");
		}
		
		input.close();
	}
}