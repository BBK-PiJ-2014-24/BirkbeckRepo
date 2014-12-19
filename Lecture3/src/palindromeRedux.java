
import java.util.Scanner;

public class palindromeRedux {

	public static void main(String[] args) {
		
		// Initializtions & Declarations
		// -----------------------------
		
		Scanner importConsole = new Scanner(System.in);
		
		String phrase;
		int phraseLength;
		int phraseMiddle;
		int i=0;
		int j=0;
		
		boolean pdrome = true;
		
		// Input
		// -----
		
		System.out.println("Input Phrase1: ");
		phrase = importConsole.nextLine();
		phraseLength = phrase.length();
		phraseMiddle = phraseLength/2;
		
		// Calc
		// ----
		
		while(pdrome && i<phraseMiddle && j<phraseMiddle){
			// Check for punctuation and spaces
			Character s = phrase.charAt(i);
			while(!Character.isLetter(s)){  // Use Static Character method .isLetter(char)
				i++;
				s=phrase.charAt(i);
			}
			
			Character t = phrase.charAt(phraseLength - j -1);
			while(!Character.isLetter(t)){
				j++;
				t=phrase.charAt(phraseLength - j -1);
			}
			// strip out Case Sensitivity
			s = Character.toLowerCase(s);    // Use Static Character method .toLowerCase(char)
			t = Character.toLowerCase(t);
			
			// System.out.println("s=" + s+ ", t=" +t);
			
			// test for palindrome
			if(s.equals(t)){
				i++;
				j++;
			}
			else{
				pdrome=false;
				break;
			}
		}// end while
		
		if(pdrome)
			System.out.println("Your Phrase is a Relaxed Palindrome");
		else    
			System.out.println("Your Phrase is NOT a Relaxed Palindrome");
		
		importConsole.close();

	} //end main
} // end class
