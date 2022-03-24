/*
* [Array6.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Mar 7, 2020
* Description: <Array exercises>
*/

package array;
import java.util.Scanner;
public class Array6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] lastnames = new String[2];
		String[] firstnames = new String[2];
		double[] marks = new double[2];
		double totMarks = 0;
		int numStudent = 2;
		
		for (int i = 0; i < marks.length; i++) { 
			System.out.println("Enter a lastname: ");
			lastnames[i] = input.nextLine();
			System.out.println("Enter a firstname: ");
			firstnames[i] = input.nextLine();
			System.out.println("Enter a mark: ");
			marks[i] = input.nextDouble();
			totMarks += marks[i];
			
			input.nextLine();
		}
		
		System.out.println("Do you want to see pass or fail marks?");
		String passfail = input.nextLine();
		
		if (passfail.equals("fail")) {
			System.out.println("The average of the Students who are failing the course: ");
			for (int i = 0; i < 1; i++) {
				if (marks[i] < 50) {
					System.out.println((totMarks / numStudent) + "%");
				}
			}
		} else if (passfail.contentEquals("pass")) {
			System.out.println("The average of the Students who are passing the course: ");
			for (int i = 0; i < 1; i++) {
				if (marks[i] >= 50) {
					System.out.println((totMarks / numStudent) + "%");
				}
			}
		}
		
	input.close();
	}
}