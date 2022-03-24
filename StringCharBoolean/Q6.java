package StringCharBoolean;
import java.util.Random;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 Random random = new Random();

	     System.out.println("Input the sentence:");
	     String response = input.nextLine();
	     int length = response.length();
	     
	     int rand = random.nextInt((length-0) + 1) + 0;
	     char letter = response.charAt(rand);
	     
	     System.out.println("Random character is: " + letter);
	
	     input.close();
	}
}