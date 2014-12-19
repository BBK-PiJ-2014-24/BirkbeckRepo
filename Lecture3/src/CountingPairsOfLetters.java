import java.util.Scanner;


public class CountingPairsOfLetters {

	public static void main(String[] args) {
		// Initializations and Declarations
		// --------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		String str;
		String phrase;
		
		int strLength;
		int phraseLength;
		
		int k = 0;
		int strCount = 0;
		
		Character c;
		Character p;
		
		boolean findStr = false;
		
		
		// input
		// -----
		
		System.out.println("Input String to Search: ");
		str = importConsole.nextLine();
		System.out.println("Input Phrase: ");
		phrase = importConsole.nextLine();
		
		// Calc
		// ----
		
		strLength = str.length();
		phraseLength = phrase.length();
		
		
		for(int i=0;i<phraseLength;i++){
			c = str.charAt(k);
			p=phrase.charAt(i);
			if(p.equals(c)){      //if findmatch
				findStr = true;   // flag on
				k++;              // add count 
				if(k==strLength){ // if k 
					strCount++;   // count string number 
					findStr = false; // reset flag
					k=0;             // reset k
				}
			} // end if
			else{
				findStr = false;
				k=0;
			}
		} // end for loop
		
		
		System.out.println("Number of Strings in Phrase: " + strCount);
		importConsole.close();
	} // end main
} // end class
