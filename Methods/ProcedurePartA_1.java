package Methods;
import java.util.Scanner;
public class ProcedurePartA_1 {
	
	public static  void writeArea (double length, double width) {
		double area = length * width;
		System.out.println(Math.round(area));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		double length = input.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		double width = input.nextDouble();
		
		writeArea(length, width);
		
		input.close();
	}

}