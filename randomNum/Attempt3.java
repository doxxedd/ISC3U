package randomNum;
import java.util.Scanner;
import java.util.Random;
public class Attempt3 {

	public static void main(String[] args) {
		Random randGen = new Random();
        Scanner input = new Scanner(System.in);
 
        int rand1;
        int rand2;
        int correct = 0;
        int wrong = 0;
        int overallcorrect = 0;
        int overallincorrect = 0; {

        while(true) {
            rand1 = randGen.nextInt(10) + 1;
            rand2 = randGen.nextInt(10) + 1;

            System.out.println("Choose an operator: (*, /, +, -)");
            String choice = input.next();
            System.out.println("Whats " + rand1 + " " + choice + " " + rand2 + "?");

            while(true){

                int answer = input.nextInt();

                if (choice.equals("*")) {
                    if (answer == (rand1 * rand2)) {System.out.println("Correct!");correct ++; overallcorrect++; break;}
                    else{System.out.println("Incorrect! Try again:");wrong ++; overallincorrect++;}
                }
                else if (choice.equals("/")) {
                    if (answer == (rand1 / rand2)) {System.out.println("Correct!");correct ++; overallcorrect++; break;}
                    else{System.out.println("Incorrect! Try again:");wrong ++; overallincorrect++;}
                }
                else if (choice.equals("+")) {
                    if (answer == (rand1 + rand2)) {System.out.println("Correct!");correct ++; overallcorrect++; break;}
                    else{System.out.println("Incorrect! Try again:");wrong ++; overallincorrect++;}
                }
                else if (choice.equals("-")) {
                    if (answer == (rand1 - rand2)) {System.out.println("Correct!");correct ++; overallcorrect++; break;}
                    else{System.out.println("Incorrect! Try again:");wrong ++; overallincorrect++;}
                }
            }
            
            System.out.println("You got the right answer " + correct + " times " + "and the wrong answer " + wrong + " times.");    
            System.out.println("Wanna quit? type 'Y' if yes. 'N' if no");
            input.nextLine();
            String cont = input.nextLine();
            if (cont.equals("Y")) break;
          }
            System.out.println("You got the right answer " + overallcorrect + " times " + "and the wrong answer " + overallincorrect + " times.");
        }
        input.close();
	}
}