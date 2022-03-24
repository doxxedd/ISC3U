package Methods;
import java.util.Scanner;
public class PartB_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the x value of point A:");
		int x1 = input.nextInt();
		System.out.println("Enter the y value of point A:");
		int y1 = input.nextInt();
		System.out.println("Enter the x value of point B:");
		int x2 = input.nextInt();
		System.out.println("Enter the y value of point B:");
		int y2 = input.nextInt();
		System.out.println("The coordinates are (" + x1 + "," + y1 + ") , (" + x2 + "," + y2 +")");

		double TotalDistance = distance (x1,y1,x2,y2);
	    System.out.println("The total distance is: " + TotalDistance);
	    
	    double Slope = slope (x1,y1,x2,y2);
	    System.out.println("The slope is: " + Slope);
	    
//	    double Midpoint = midpoint (a1, a2);
//	    System.out.println("The midpoint is: " + midpoint);
//	    
//	    double Midpoint2 = midpoint (b1, b2);
//	    System.out.println("The midpoint is: " + midpoint2);
		
	    input.close();
	}
	
	public static double distance (int a1, int b1, int a2, int b2) {
		double totDistance = Math.sqrt((a2-a1)^2 + (b2-b1)^2);
		return totDistance;
	}
	
	public static double slope (int a1, int b1, int a2, int b2) {
		double slope = (b2 - b1) / (a2 - a1);
		return slope;
	}
	
	public static double midpoint (int a1, int a2) {
		double midpoint = ((a1 + a2) / 2);
		return midpoint;
	}
	
	public static double midpoint2 (int b1, int b2) {
		double midpoint2 = ((b1 + b2) / 2);
		return midpoint2;
	}
}