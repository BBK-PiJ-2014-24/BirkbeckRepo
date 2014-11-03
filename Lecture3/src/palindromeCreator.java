
import java.util.Scanner;

public class palindromeCreator {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		String str;
		
		int strLength;
		
		
		// Input
		// -----
		System.out.println("Input Phrase: ");
		str = importConsole.nextLine();
		strLength = str.length();
		System.out.print(str);
		
		for(int i=0;i<strLength;i++){
			char c = str.charAt(strLength - i - 1); // -1 as char count start at 0;
			System.out.print(c);
		}
		importConsole.close();
		
	} //end main
} // end Class
