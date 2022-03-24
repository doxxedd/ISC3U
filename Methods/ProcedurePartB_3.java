package Methods;
import java.util.Scanner;
public class ProcedurePartB_3 {
	
	public static void lengthSticks(double one, double two, double three) {
        
		if (one + two <= three) {
            System.out.println("there would be no triangle");
        } else if (one + three <= two) {
            System.out.println("there would be no triangle");
        } else if (two + three <= one) {
            System.out.println("there would be no triangle");
        } else {
            System.out.println("there would be a triangle");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the length of stick one: ");
        double one = input.nextDouble();
        System.out.println("enter the length of stick two: ");
        double two = input.nextDouble();
        System.out.println("enter the length of stick three: ");
        double three = input.nextDouble();

        lengthSticks(one, two, three);
        
        input.close();
    }
}