/*
* [Selection10.java]
* Author: Daniel Dinari
* Teacher: Ms. Andreghetti 
* Date: Feb 16, 2020
* Description: <Selection Exercises>
*/

package selection;
import java.util.Scanner;
public class selection10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter how many times you want to the program to print hello?");
		String num = input.nextLine();
		int numHello = Integer.parseInt(num);
		for(int i=0; i < numHello; i++) {
			System.out.println("Hello");
		}
		input.close();
	}

}