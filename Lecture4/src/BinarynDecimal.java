/* 4 Binary and decimal
 * Create a program in which you define the following methods:
 * 
binary2decimal(String): takes from the user a binary number (with digits 0 and 1) and returns the 
corresponding number in decimal (base-10, with digits between 0 and 9). Hint: in the same way that 
you know that 35 = 3 · 10 + 5 · 100, you can find that 100011 = 1 · 25 + 1 · 21 + 1 · 20.

decimal2binary(int): the opposite of the previous one: takes a decimal number and returns the 
corresponding binary number. Hint: instead of multiplying by 2, you will need to divide by two this 
time.

The program must offer a menu to the user with two options. The first one takes a binary number from 
the user and returns the corresponding decimal number. The second one does the opposite: takes a 
decimal number and returns a binary number. The program should use the methods defined.
 */

import java.util.Scanner;

public class BinarynDecimal {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		 BinarynDecimal bd = new BinarynDecimal();
		 Scanner importConsole = new Scanner(System.in);
		 int x;
		 int dec;
		 String str;
		 String strBinary;
		 
		 
		 // Input
		 // -----
		 System.out.println("Input decimal Number for Conversion to Binary: ");
		 x = importConsole.nextInt();
		 strBinary = bd.decimal2binary(x);
		 System.out.println("Binary Conversion of " + x + " is: " + strBinary);
		 
		 /* FROM STACKOVERFLOW
		  * Thats because the Scanner#nextInt method does not read the last newline character of your
		  *  input, and thus that newline is consumed in the next call to Scanner#nextLine
		  */
		 importConsole.nextLine(); // CLEAR SCANNER IN PREPARATION FOR NEW INPUT!!!
		 
		 System.out.println();
		 
		 System.out.println("Input Binary Number for Conversion to Decimal: ");
		 str = importConsole.nextLine();
		 dec = bd.binary2decimal(str);
		 System.out.println("Decimal Conversion of " + str + " is: " + dec);
		 
		 
		 
		 importConsole.close();
		
	} // end main
	
	// Decimal -> Binary METHOD
	// -----------------------
	public String decimal2binary(int decNum){
		
		int remainder;
		int binaryLength;
		String binaryDigit;
		String binaryRevChain="";
		String binaryChain="";
		
		
		while(decNum > 0){
			remainder = decNum %2;
			binaryDigit = Integer.toString(remainder);
			binaryRevChain+=binaryDigit;
			decNum = decNum/2;
		}
		
		binaryLength = binaryRevChain.length();
		
		for(int i=binaryLength-1;i>=0;i--){
			binaryChain+=binaryRevChain.charAt(i);
		}
		 return binaryChain;

	} // end binary2decimal
	
	// Binary-> Decimal METHOD
	// -----------------------
		
		public int binary2decimal(String str){
			
			int dec=0;
			int strLength = str.length();
			for(int i=strLength-1;i>=0;i--){
				double calc=0;
				Character d = str.charAt(i);
				int n = (int) (d-'0');  // Crafty way to convert char to int!!!
				if(n==1){
					int exp = strLength-i-1;
					calc = Math.pow(2.0, exp);
					dec += calc;
				}
			} // end loop
			return dec;
		} // end decimal2binary

} // end class
