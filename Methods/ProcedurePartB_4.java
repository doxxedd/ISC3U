package Methods;
import java.util.Scanner;
public class ProcedurePartB_4 {
	
	public static void createTriangle(int height) {
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the height of the triangle: ");
	    int height = input.nextInt();

	    createTriangle(height);
	        
	    input.close();
	}
}