package sorting;
import java.util.Scanner;
public class Sort1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter a number: ");
			array[i] = input.nextInt();
		}
		System.out.println("Numbers in the order entered:");
		for (int i = 0; i < array.length; i++ ) {
			System.out.println(array[i]);
		}
		
		
		int n = array.length;
		for (int i = 0; i < n-1; i++) { // #passes
			for (int j = 0; j < (n-1)-i; j++) { //# of comparisons
				if (array[j] > array [j+1]) { // comparison
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		} 
		System.out.println("Numbers in acending order:");
	    int n2 = array.length; 
	    for (int i = 0; i < n2 ; ++i) {
	    	System.out.println(array[i]); 
	        }
	input.close();
	}
}