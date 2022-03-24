package randomNum;
import java.util.Scanner;

public class idkanymore {
	public static void main(final String[] args) {
		final Scanner scan = new Scanner(System.in);
 
		double answer;
		double input;
		int correct = 0;
		String repeatTask;
		String operator;

		do {
			System.out.println("Please choose an operator /, *, +, -");
			operator = scan.nextLine();

			final int num1 = (int) (Math.random() * 10) + 1;
			final int num2 = (int) (Math.random() * 10) + 1;
			
			
			if (operator == "/" ){
				answer = num1 / num2;
				System.out.println("What is the answer to " + num1 + "/ " + num1);
				input = scan.nextDouble();
				if(input != answer){
					System.out.println("Incorect");
					
				}
				else if (input== answer){
					System.out.println("Correct!");
					correct++;
				}
					
			} else if (operator == "*"){
				answer = num1 * num2;
				System.out.println("What is the answer to " + num1 + "* " + num1);
				input = scan.nextDouble();
				if(input != answer){
					System.out.println("Incorect");
					
				}
				else if (input== answer){
					System.out.println("Correct!");
					correct++;
				}
					
			} else if (operator == "+"){
				answer = num1 + num2;
				System.out.println("What is the answer to " + num1 + "+ " + num1);
				input = scan.nextDouble();
				if(input != answer){
					System.out.println("Incorect");
					
				}
				else if (input== answer){
					System.out.println("Correct!");
					correct++;
				}
					
			} else if (operator == "-"){
				answer = num1 - num2;
				System.out.println("What is the answer to " + num1 + "- " + num1);
				input = scan.nextDouble();
				if(input != answer){
					System.out.println("Incorect");
					
				}
				else if (input== answer){
					System.out.println("Correct!");
					correct++;
				}
					
			}
				
			
			System.out.println("Would you like to repeat the task?");
			repeatTask = scan.nextLine();
				
		}while(repeatTask != "no");
		System.out.println("You got " + correct + " answers correct");
		
		scan.close();
	}

}
