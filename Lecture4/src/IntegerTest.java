/*
 * 7 Integer
Create your own version of boxed int! Create a class Integer2 with only one field (int value) 
and the following methods:
getValue(): returns the value of this number as an int, a getter. 
setValue(int): a setter.
isEven(): returns true if the number is even, false otherwise. isOdd(): the opposite.
prettyPrint(): prints the value of the integer on the screen. 
toString(): returns a String equivalent to the number.
 */

import java.util.Scanner;
public class IntegerTest {

	public static void main(String[] args) {
		// Initializations and Declarations
		// --------------------------------
		Scanner importConsole = new Scanner(System.in);
		int y;
		Integer2 i = new Integer2();
		
		// Input
		// -----
		System.out.println("Input Integer: ");
		y = importConsole.nextInt();
		
		i.setValue(y);
		System.out.println("Your Input: " + i.getValue());
		
		System.out.println("Test Print");
		i.prettyPrint();
		
		System.out.println("Test Even: " + i.isEven());
		
		System.out.println("Test String: " + i.toString());
		
		importConsole.close();
			
		
	} // end main
} // end class
