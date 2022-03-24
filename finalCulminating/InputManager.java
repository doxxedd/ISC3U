package finalCulminating;

import java.util.Scanner;

public class InputManager {
	
	static Scanner input = new Scanner(System.in);
	
	//instead of creating multiple scanners, we create one universal one which also checks for invalid enter key presses
	public static String playerInput() {
		while(true) {
			String temp = input.nextLine().toLowerCase();
			if(temp.toCharArray().length <= 0) {
				System.out.println("Invalid input. Enter a letter: ");
			} else {
				return temp;
			}
		}
	}
}