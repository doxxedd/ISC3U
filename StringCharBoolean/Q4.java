package StringCharBoolean;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input a word: ");
        String word = input.nextLine();

        for(char counter : word.toCharArray())
        {
            System.out.println(counter);
        }
        
        input.close();
	}

}
