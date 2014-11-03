/*11 Text2number
Write a program that reads a number with commas and decimal dots (such as “23,419.34”) and then prints a number that is half of it. Do not use Double.parseDouble().
If you were writing a simple spreadsheet, you could use this code to parse the input in the cells.
*/

import java.util.Scanner;

public class Text2number {

	public static void main(String[] args) {
		// initializations and DEclarations
		// ---------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		String str;
		int strLength;
		
		double num;
		
		// Input Number
		// ------------
		System.out.println("Input Number: ");
		str = importConsole.nextLine();
		strLength = str.length();
		
		for(int i=0;i<strLength;i++){
			char c = str.charAt(i);
			if (!Character.isDigit(c))
			
		} // end loop
		
		
		
		
		
		

	} // end main

}// end class
