// Calculator that takes numbers and operator direct from the console

import java.util.Scanner;

public class Calculator_CommandLine {

	public static void main(String[] args){
		
		// Initializations & Declarations
		Scanner importConsole = new Scanner(System.in);
		String str = "";
		int strLength = 0;
		double x = 0; double y =0; double ans = 0;
		int operatorNum = 0;
		boolean hitOperator = false;
		
		// Input
		System.out.println("Input Calc: ");
		str = importConsole.nextLine();
		strLength = str.length();
		
		// Find Operator Sign and its Position in String (var i)
		// -----------------------------------------------------
		
		int i = 0;
		while(!hitOperator && i<strLength){
			char c = str.charAt(i);
			switch (c) {
				case '+':
					System.out.println("+");
					operatorNum = 1;
					hitOperator = true;
					break;
				case '-':
					System.out.println("-");
					operatorNum = 2;
					hitOperator = true;
					break;				
				case '*':
					System.out.println("*");
					operatorNum = 3;
					hitOperator = true;
					break;	
				case '/':
					System.out.println("/");
					operatorNum = 4;
					hitOperator = true;
					break;	
				default:
					i++;		
					break;
			} // end Switch		
			// if(c.toString(c).equals("+") ){
			//		operation
			} // end while
		
		System.out.println("i=" + i);
		
		// Find x and y
		// ------------
		
		String strX = str.substring(0,i);
		x = Double.parseDouble(strX);
	
		String strY = str.substring(i+1);
		y = Double.parseDouble(strY);
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		// Calculation
		// ----------
		
		switch (operatorNum){
			case 1:
				ans = x + y;
				System.out.println(x + "+" + y +" = " + ans);
				break;
			case 2:
				ans = x - y;
				System.out.println(x + "-" + y +" = " + ans);
				break;
			case 3:
				ans = x * y;
				System.out.println(x + "*" + y +" = " + ans);
				break;
			case 4:
				ans = x / y;
				System.out.println(x + "/" + y +" = " + ans);
				break;
		} // end case
		
		
		
		importConsole.close();	
		} // end main
	}// end class
	
	
