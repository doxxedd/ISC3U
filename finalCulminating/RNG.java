package finalCulminating;

import java.util.Random;

public class RNG {
	
	public static Random randGen = new Random(); //static randgen object
	public static int GetRandomNumber(int max) {
		return randGen.nextInt(max); //getting random number which will be the row # in files of spinner and phrases
	}
	public static int GetRandomNumber(int max, int min) {
		return randGen.nextInt(max) + min; //getting random number which will be the row # in files of spinner and phrases
	}
	
}
