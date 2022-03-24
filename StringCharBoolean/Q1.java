package StringCharBoolean;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input a word: ");
		String response = input.nextLine();
		int length = response.length();
		System.out.println("There are " + length + " characters ers in your word and phrase");
		
		input.close();
	}
}