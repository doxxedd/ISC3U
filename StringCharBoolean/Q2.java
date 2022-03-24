package StringCharBoolean;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a word: ");
		String word = input.nextLine();
        
		int length = word.length();
        String first = word.substring(0, 1);
        String last = word.substring(length - 1);
        
        System.out.println("The first character is: " + first);
        System.out.println("The last character is: " + last);

		
		input.close();
	}
}