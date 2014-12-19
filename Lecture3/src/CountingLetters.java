

import java.util.Scanner;


public class CountingLetters {
	

	public static void main(String[] args) {
		
		// Declarations & Initializations
		// ------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		String str;	
		int strLength;
		char letterEsmall = 'e';
		char letterEbig = 'E';
		int countE = 0;
		
		System.out.println("Input Phrase: ");
		str = importConsole.nextLine();
		
		strLength = str.length();
		
		for(int i = 0;i<strLength;i++){
			Character c = str.charAt(i);
			if( c.equals(letterEsmall) || c.equals(letterEbig))
				countE++;
		} // end loop
		
		System.out.println("The Number of \"e's\": " + countE);
		
		importConsole.close();
		
	} // end main
} // end class