package Methods;

import java.util.Scanner;

public class ProcedurePartA_3 {
	
	public static void printGraph(int length, String symbol) {

		for (int i = 0; i < length; i++) {
			System.out.print(symbol);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length: ");
		int length = input.nextInt();
		System.out.println("What is the letter: ");
		String symbol = input.next();
		
		printGraph(length, symbol);
		
		input.close();
	}
}
