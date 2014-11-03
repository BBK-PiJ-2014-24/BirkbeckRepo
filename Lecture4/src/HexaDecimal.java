/*
 * 5 Binary and hexadecimal (*)
Binary numbers can be quite long. A 32-bit memory address looks like 
1001 0101 0110 1010 1011 0010 1001 1010, 
which is difficult to handle. That is why memory addresses and other binary numbers are usually written 
as hexadecimal numbers. An hexadecimal number is a base-16 number, with digits between 0 and f 
(f is equivalent to decimal 15, e is equivalent to decimal 14, and so on). An hexadecimal number 
is equivalent to a four-digit binary number, which makes them quite compact. The former address 
reads 956ab29a, which is easier to read and write. To prevent confusion with decimal numbers, 
hexadecimal numbers are usually prefixed by “0x”, as in 0x95 (which is 149) or 0xff (which is 255).
Write a program that takes a String. The string can be a decimal or a hexadecimal number 
(starting by “0x”). Your program must recognise the number as what it is and convert 
it to the other base. Use two methods for conversion as in the former exercise.
 *
 */

import java.util.Scanner;

public class HexaDecimal {

	public static void main(String[] args) {
		// Initializations and Declarations
		// --------------------------------
		 
		HexaDecimal hd = new HexaDecimal();
		Scanner importConsole = new Scanner(System.in);
		String str;
		boolean checkInputDec;
		
		
		// Input
		// -----
		
		System.out.println("Input Number: ");
		str = importConsole.nextLine();
		checkInputDec = hd.checkHexOrDec(str); // Check Input is HEX or DEC
		// HEX -> DECIMAL
		// ==============
		if(!checkInputDec){
			double HexToDec;
			HexToDec = hd.CalcHexToDec(str);
			System.out.println("HexToDec Conversion = " + HexToDec);
		} // end if
		// DECIMAL -> HEX
		//================
		else{
	
			int dec = Integer.parseInt(str);    //Convert Input to Int
			String strBin = hd.decimal2binary(dec); // Convert to Binary String 
			String hexChain ="0x";
			
			while(strBin.length()>0){
				String subStr; 	
				if(strBin.length()>=4){
					subStr = strBin.substring(0, 4); //Take a 4Bit Binary
					strBin = strBin.substring(4); //Break off the 4Bit Binary
				}
				else{
					subStr = strBin.substring(0); //Take remainder Bit Binary
					strBin = null;
				}
				int d = hd.binary2decimal(subStr); // Convert 4Bit->Dec
				String h = hd.convertIntToHex(d); // Convert Dec->Hex digit
				hexChain += h; // add to hex to hexChain		
			} // end while
			
			System.out.println("DecToHex Conversion = " + hexChain);
				
		} // end else
		
		
		importConsole.close();
	} // end Main
	
	// Check Type for Conversion
	// -------------------------
	public boolean checkHexOrDec(String s){
		boolean isDec = true;
		String HexPrefix = "0x";
		
		if(s.substring(0,2).equals(HexPrefix))
			isDec = false;
		
		return isDec;
	}
	
	// Convert Hex-> Dec
	// =================
	public double CalcHexToDec(String str){
		str = str.substring(2);
		int stringLength = str.length();
		String s ="";
		String binaryChain = "";
		String addZero = "0";
		int decNum;
		
		for(int i=0;i<stringLength;i++){
			int dig = ConvertCharToDigit(str.charAt(i)); // Convert each char to a digit
			s = decimal2binary(dig); // Convert each digit to binary
			if(s.length()<4)
				s = addZero + s;    // Ensure a 4-bit binary
			binaryChain += s; // Concaternate 4bit binary to create  binary chain
		} // end loop
		
		decNum = binary2decimal(binaryChain);
		return decNum;
		
		
	} // end HexToDec
	
	
	// Convert chars to Actual Non-Hex Digits
	//----------------------------------------
	public int ConvertCharToDigit(char c){
		
		int i = 0;
		if(Character.isDigit(c))
			i= (int) (c -'0');
		else{
			switch (c){
				case 'a': 
					i= 10;
					break;
				case 'b':
					i=11;
					break;
				case 'c':
					i=12;
					break;
				case 'd':
					i=13;
					break;
				case 'e':
					i=14;
					break;
				case 'f':
					i=15;
					break;	
			} // end Switch
		} // end else	
		return i; 
	}// end  ConvertCharToDigit method	
	
	
	// convert
	public String convertIntToHex(int i){
		String stringHex = "";
		if (i<10)
			stringHex = Integer.toString(i);
		else{
			switch(i){
				case 10:
					stringHex = "a";
					break;
				case 11:
					stringHex = "b";
					break;
				case 12:
					stringHex = "c";
					break;
				case 13:
					stringHex = "d";
					break;
				case 14:
					stringHex = "e";
					break;
				case 15:
					stringHex = "f";
					break;		
			}// end switch
		}// end else
		return stringHex;
	} 	
	
	
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
