
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// intitializations and Declarations
		// ---------------------------------
		Scanner importConsole = new Scanner(System.in);
		
		String word;
		
		int i=0;
		int wordLength = 0;
		int wordMiddle = 0;
		
		boolean pDrome = true;
		
		// Input
		// -----
		
		System.out.println("Input Word: ");
		word = importConsole.nextLine();
		wordLength = word.length();
		wordMiddle = wordLength/2;
		
		while(pDrome && i<wordMiddle){
			Character s = word.charAt(i);
			Character t = word.charAt(wordLength - i -1 ); // -1 as char count start at 0;
			// System.out.println("s= " + s + ", t= " + t);
			
			if(s.equals(t))
				i++;
			else{
				pDrome = false;
				break;
			} // end else
		} // end while
		if (pDrome)
			System.out.println("The word, " + word + ", is a Palindrome.");
		else
			System.out.println("The word, " + word + ", is NOT a Palindrome.");
		
		importConsole.close();
	} // end main
} // end class
