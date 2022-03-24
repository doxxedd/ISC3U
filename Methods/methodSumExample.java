package Methods;

public class methodSumExample {
	
	public static int sum (int a, int b) {
		a = 2 * a;
		b = 2 * b;
		
		return (a+b);
	}
	
	public static void main(String[] args) {
		System.out.println(sum(4,5));
		
		int num1 = 10;
		int num2 = 12;
		
		System.out.println("Num 1 = " + num1);
		System.out.println("Num 2 = " + num2);
		
		int mySum = sum(num1, num2);
		
		System.out.println("The total is: " + mySum);
	}
}