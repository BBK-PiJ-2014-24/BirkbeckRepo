// Using A Number of String Methods, including str.CharAt(), str.indexOf(), str.lastIndexOf

import java.util.Scanner;


public class LineToColumn {

	public static void main(String[] args) {
		
		// Declarations & Initializations
		// ------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		String word;
		String phrase;
		int wordLength =0;
		int phraseLength =0;
		int lastWordIndex = 0;
		
		// Word to Column
		// --------------
		
		System.out.println("Input Word: ");
		word = importConsole.nextLine();
		String space = " ";
		wordLength = word.length();
		
		
		for(int i=0;i<wordLength;i++){
			char c = word.charAt(i);
			System.out.println(c);
		}
		
		// Phrase to Column
		// ----------------
		
		System.out.println("Input Phrase");
		phrase = importConsole.nextLine();
		phraseLength = phrase.length();
		lastWordIndex = phrase.lastIndexOf(space);  // use .lastIndexOf
		
		
		int i = 0;
		int j = 0;
		while(j<lastWordIndex){
			j = phrase.indexOf(space, i);
			System.out.println(phrase.substring(i,j));
			i = j +1;
		}
		System.out.println(phrase.substring(lastWordIndex + 1));
		
    importConsole.close();
   
	} // end main
} // end class
