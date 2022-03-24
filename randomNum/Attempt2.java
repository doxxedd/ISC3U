package randomNum;
import java.util.Scanner;
import java.util.Random;
public class Attempt2 {
	public static void main(String[] args ) {
	Random randGen = new Random();
    Scanner input = new Scanner(System.in);

    int rand1;
    int rand2;
    int overallcorrect = 0;
    int overallincorrect = 0; {
    
    while(true) {
    	
        rand1 = randGen.nextInt(10) + 1;
        rand2 = randGen.nextInt(10) + 1;

        System.out.println("Choose an operator: (*, /, +, -)");
        String choice = input.nextLine();
        System.out.println("Whats " + rand1 + choice + rand2 + "?");

        int Cincorrects = 1;
        while(true){

            int answer = input.nextInt();
            
            if (choice.equals("*")) {
                if (answer == (rand1 * rand2)) {System.out.println("Correct!"); overallcorrect++; break;}
                else{System.out.println("Incorrect! Try again:"); overallincorrect++; Cincorrects++;}
            }
            else if (choice.equals("/")) {
                if (answer == (rand1 / rand2)) {System.out.println("Correct!"); overallcorrect++; break;}
                else{System.out.println("Incorrect! Try again:"); overallincorrect++; Cincorrects++;}
            }
            else if (choice.equals("+")) {
                if (answer == (rand1 + rand2)) {System.out.println("Correct!"); overallcorrect++; break;}
                else{System.out.println("Incorrect! Try again:"); overallincorrect++; Cincorrects++;}
            }
            else if (choice.equals("-")) {
                if (answer == (rand1 - rand2)) {System.out.println("Correct!"); overallcorrect++; break; }
                else{System.out.println("Incorrect! Try again:"); overallincorrect++; Cincorrects++;}
            }
        }
        
        System.out.println("It took " + Cincorrects + " trys to get the right answer.");
        System.out.println("Wanna quit?(Type \"Yes\" if yes. \"No\" if u don't)");
        input.nextLine();
        String s = input.nextLine();
    	if(s.contains("Yes")) break;
    }
    System.out.println("U had " + overallcorrect + " correct and " + overallincorrect + " icorrect answers.");
}
}
}
