/*
* [Array5.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Mar 7, 2020
* Description: <Array exercises>
*/

package array;
import java.util.Scanner;
public class Array5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] lastnames = new String[10];
		String[] firstnames = new String[10];
		double[] marks = new double[10];
		
		for (int i = 0; i < marks.length; i++) { 
			System.out.println("Enter a lastname: ");
			lastnames[i] = input.nextLine();
			System.out.println("Enter a firstname: ");
			firstnames[i] = input.nextLine();
			System.out.println("Enter a mark: ");
			marks[i] = input.nextDouble();
			
			input.nextLine();
		}
		
		System.out.println("Do you want to see pass or fail marks?");
		String passfail = input.nextLine();
		
		if (passfail.equals("fail")) {
			System.out.println("Students who are failing the course: ");
			for (int i = 0; i < marks.length; i++) {
				if (marks[i] < 50) {
					System.out.println(lastnames[i] + ", " + firstnames[i] + "mark: " + marks[i] + "%");
				}
			}
		} else if (passfail.contentEquals("pass")) {
			System.out.println("Students who are passing the course: ");
			for (int i = 0; i < marks.length; i++) {
				if (marks[i] >= 50) {
					System.out.println(lastnames[i] + " " + firstnames[i] + ", mark: " + marks[i] + "%");
				}
			}
		}
		
	input.close();
	}
}