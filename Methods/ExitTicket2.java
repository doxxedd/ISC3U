package Methods;
import java.util.Scanner;
public class ExitTicket2 {

	public static void printTime (int hours, int mins) {
		
		if (hours > 12) {
			if (mins < 10) {
				int AMhr =  (hours - 12);
				System.out.println("Time in AM/PM form: " + AMhr + ":0" + mins + " PM");
			} else {
				int AMhr =  (hours - 12);
				System.out.println("Time in AM/PM form: " + AMhr + ":" + mins + " PM");
			}
			
		} else {
			if ((mins < 10) && (hours != 12)) {
				System.out.println("Time in AM/PM form: " + hours + ":0" + mins + " AM");
			} else if (hours != 12){
				System.out.println("Time in AM/PM form: " + hours + ":" + mins + " AM");
			}
		}
		
		if (hours == 12) {
			if (mins < 10) {
				System.out.println("Time in AM/PM form: " + hours + ":0" + mins + " PM");
			} else {
				System.out.println("Time in AM/PM form: " + hours + ":" + mins + " PM");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time using 24h format, hours: ");
		int hours = input.nextInt();
		System.out.println("Enter the time, minutes: ");
		int minutes = input.nextInt();
		
		printTime(hours, minutes);
		
		input.close();
	}

}