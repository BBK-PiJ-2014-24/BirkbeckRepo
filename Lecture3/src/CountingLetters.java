

import java.util.Scanner;


public class CountingLetters {
	

	public static void main(String[] args) {
		
		// Declarations & Initializations
		// ------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		String str;	
		int strLength;
		char letterE = 'e';
		int countE = 0;
		
		System.out.println("Input Phrase: ");
		str = importConsole.nextLine();
		
		strLength = str.length();
		
		for(int i = 0;i<strLength;i++){
			char c = str.charAt(i);
			if( Character.isLowerCase(letterE) || Character.isUpperCase(letterE))
				countE++;
		} // end loop
		
		System.out.println("The Number of \"e's\": " + countE);
		
	} // end main
} // end class