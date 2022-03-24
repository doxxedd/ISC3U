package Methods;
import java.util.Scanner;
public class ProcedurePartB_2 {
	
	public static void sort(int one, int two, int three) {
		Scanner input = new Scanner(System.in);
		int [] array = new int [3];
		
		array [0] = one;
		array [1] = two;
		array [2] = three;
		
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
		input.close();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int one = input.nextInt();
		System.out.println("Enter numbers: ");
		int two = input.nextInt();
		System.out.println("Enter numbers: ");
		int three = input.nextInt();
		
		sort (one, two, three);
		
		input.close();
	}
	
}