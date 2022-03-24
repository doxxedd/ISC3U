package finalCulminating;

import java.io.*;
import java.util.*;

public class FileManager {
	
	//the paths to all of the text files
	private static String pathToPhrases = "phrases.txt";
	private static String pathToPriceFiles[] = new String[] {"spinnerValue1.txt", "spinnerValue2.txt", "spinnerValue3.txt"};
	private static String pathToScores = "scoreboard.txt";

	public static char consenants[] = "bcdfghjklmnpqrstvwxyz".toCharArray();
	public static char vowels[] = "aeiou".toCharArray();
	public static char fullAlphabet[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public static String phrases[] = new String[25]; //phrases array and its path
	
	public static int roundPricesArrays[][] = new int[3][25]; //2D array that stores spinner price values and their paths. instead of creating 3 different arrays for each file
	
	private static ArrayList<Score> scoresInFile = new ArrayList<Score>(); //array list with scores
	
	
	public static void importingDataValueFromFile() throws Exception{	
		FillUpScoreBoardList();
		FillUpPhraseArray();
		FillUpRoundPricesArrays();		
	}
	
	public static void PrintAllTheScores() {
		for(Score element : scoresInFile) {
			System.out.println(element.playerName + " with the score of: " + element.score);
		}
	}
	
	public static void SaveScoresToFile() throws Exception {
		PrintWriter output = new PrintWriter(pathToScores); //writing the scores to the file
		for (Score element : scoresInFile) { //goes through all the elements in ArrayList scoresInFile (foreach)
			output.println(element.ToString()); //prints the score here (ToString from Score class)
		}
		output.close();
	}
	
	public static void AddScore(int score, String name) {
		scoresInFile.add(new Score(score, name));
		Collections.sort(scoresInFile, Comparator.comparing(Score::ToString)); //sorting with the built in ArrayList method <https://bezkoder.com/java-sort-arraylist-of-objects/>
	}
	
	private static void FillUpScoreBoardList() throws Exception {
		File file = new File(pathToScores);
		
		if(!file.exists()) file.createNewFile();
		
	    Scanner FileInput = new Scanner(file);
	    
	    //filling up the scoreboard
	    while (FileInput.hasNextLine()){ 
	    	String temp[] = FileInput.nextLine().split(":");
	        scoresInFile.add(new Score(Integer.parseInt(temp[0]), temp[1]));
	    }
	    FileInput.close();
	}
	
	private static void FillUpPhraseArray() throws Exception {
	//phrases array filling from file
		File spinnerFile = new File(pathToPhrases); //creating file instances
		Scanner fileInput = new Scanner(spinnerFile); //create scanners for reading the files
		
        while(fileInput.hasNextLine()) { //importing all the values into an array
            for (int j = 0; j < phrases.length; j++) {
            	phrases[j] = fileInput.nextLine();
            }
        }
       fileInput.close();
	}
	
	private static void FillUpRoundPricesArrays() throws Exception {
		 //round prices array filling from file
        for (int i = 0; i < 3; i++) {
    		File spinnerFile2 = new File(pathToPriceFiles[i]); //creating file instances
    		Scanner fileInput2 = new Scanner(spinnerFile2); //create scanners for reading the files
    		
            while(fileInput2.hasNextLine()) { //importing all the values into an array
                for (int j = 0; j < 25; j++) {
                	roundPricesArrays[i][j] = Integer.parseInt(fileInput2.nextLine());
                }
            }
            fileInput2.close(); 
        }
	}
	
}