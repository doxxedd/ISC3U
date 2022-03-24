package sorting;
import java.util.Scanner;
public class Sort7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] marks = new int[5];
		String [] names = new String[5];
		int temp;
		String temp2;
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter a name: ");
			names[i] = input.nextLine();
			
			System.out.println("Enter their mark: ");
			marks[i] = input.nextInt();
			input.nextLine();
		}
		
		int n = marks.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < (n-1)-i; j++) {
				if (marks[j] < marks[j+1]) {
					temp = marks[j+1];
					temp2 = names[j+1];
					
					marks[j+1] = marks[j];
					names[j+1] = names[j];
					
					marks[j] = temp;
					names[j] = temp2;
				}
			}
		}
		
		System.out.println("Marks in decending order are: ");
		int n2 = marks.length;
		for (int i = 0; i < n2; ++i) {
			System.out.println(names[i] + "'s mark is: " + marks[i]);
		}
		input.close();
	}
}