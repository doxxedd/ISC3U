package Methods;

import java.util.Scanner;

public class ProcedurePartB_1 {
	
	public static void printRectangle(int height, int width, String symbol) {
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}	
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the symbol: ");
		String symbol = input.next();
		System.out.println("Enter the height: ");
		int height = input.nextInt();
		System.out.println("Enter the width: ");
		int width = input.nextInt();
		
		printRectangle(height, width, symbol);
		
		input.close();
	}
}
