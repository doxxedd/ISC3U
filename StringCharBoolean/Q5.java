package StringCharBoolean;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.println("Input the sentence:");
	        String sentence = input.nextLine();
	        
	        int length = sentence.length();

	        int low;
	        while(true){
	            System.out.println("Input the lower number:");
	            low = input.nextInt();
	            if (low < 0 || low > length) {
	                System.out.println("Invalid number:");
	            } else {
	                break;
	            }
	        }
	        
	        int high;
	        while(true) {
	            System.out.println("Input the higher number:");
	            high = input.nextInt();
	            if (high > length) {
	                System.out.println("Invalid number:");
	            } else {
	                break;
	            }
	        }
	        
	        String range = sentence.substring(low, high);
	        System.out.println(range);
	        
	        input.close();
	}
}