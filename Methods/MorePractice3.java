package Methods;
import java.util.Scanner;
public class MorePractice3 {
	
	public static boolean prime(int num) {
		int temp;
		
		for(int i=2; i <= num/2; i++)
		{
	       temp = num % i;
		   if(temp == 0)
		   {
		      return false;
		   }
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = input.nextInt();
		
		if(prime(num)) { 
			System.out.println("It is a prime number"); 	   
		} else {
			System.out.println("Not a prime number");	
		}
		
		input.close();
	}
}