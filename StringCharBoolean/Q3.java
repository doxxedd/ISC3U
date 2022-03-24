package StringCharBoolean;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input a word: ");
        String word = input.nextLine();

        int length = word.length();
        int counter = 0;
        char e = 'e';

        for (int i = 0; i < length; i++) {
            char response = word.charAt(i);
            if (response == e) {
                counter++;
            }
        }
        
        System.out.println("There is " + counter + " e in your word");
        input.close();
	}
}