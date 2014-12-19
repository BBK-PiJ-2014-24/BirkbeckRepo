
import java.util.Scanner;

public class CountingLettersRedux {

	public static void main(String[] args) {
		// Initializations and Declarations
		// -------------------------------
		Scanner importConsole = new Scanner(System.in);
		String str;
		String phrase;
		String letterRepo = "";
		
		int strLength = 0;
		int phraseLength;
		int letterRepoLength = 0;	
		int countLetter = 0;
		
		boolean sameLetter = false;
		
		
		// Input
		// -----
		
		System.out.println("Input Phrase: ");
		phrase = importConsole.nextLine();
		phraseLength = phrase.length();
		
		
		// Calc 
		// ----
		while(!sameLetter){
			System.out.println("Which Letter to Count: ");
			str = importConsole.nextLine();
			Character c = str.charAt(0);  // sneaky way to convert str->char
			
			// check same letter
			letterRepoLength = letterRepo.length(); 
			if(letterRepoLength > 0){     
				for(int i=0;i<letterRepoLength;i++){
					Character r = letterRepo.charAt(i);
					if(c.equals(r)){
						sameLetter = true;
						System.out.println("Repeated character. Exiting the program...");
						break;
					} //end inner if
				} // end for loop
			} // end if
			letterRepo += c;  // add letter to trialrepository.
			
			// count letter in phrase
			for(int i=0;i<phraseLength;i++){
				Character p = phrase.charAt(i);
				if(p.equals(c))
					countLetter++;
			} // end loop
			
		if(!sameLetter){	// In If bracket to ensure no print when flag = true 
			System.out.println("The number of "+ c + ":"+ countLetter);
			System.out.println("Trial Letter Repository: " + letterRepo);
			System.out.println();
			countLetter = 0;
		} // end if
			
			
		}// end while
		importConsole.close();
	} // end main
} // end class
