/*
 * 2 Classics 2.1 a) Factorial
Write a small program with a method that calculates the factorial of an integer number as seen 
in the notes.
Is it easy to do this both iteratively and recursively? 
Try both ways and see which is more natural for you. If one takes too long, try the other way.
 */

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		Factorial f = new Factorial();
		Scanner importConsole = new Scanner(System.in);
		int x;
		
		
		// input
		// -----
		
		System.out.println("Input Number: ");
		x = importConsole.nextInt();
		
		// Calc
		// ----
		 
		int fI= f.iterativeFactorial(x);
		int fR = f.recursiveFactorial(x);
	
		System.out.println(x+"! = " + fI + " Iterative");
		System.out.println(x+"! = " + fR + " Recursive");
		
		importConsole.close();

	} // end main
	
	// Iterative
	// ---------
	public int iterativeFactorial(int x){
		int fact = 1;
		for(int i=x;i>0;i--){
			fact = fact *i;
		} // end loop
		return fact;
	} // end iterativeFactorial
	
	
	// Recursive
	// ---------
	public int recursiveFactorial(int n){
		if(n==1)
			return 1;
		else{
			int result = n * recursiveFactorial(n-1);
			return result;
		} // end else
	} // end recursiveFactorial

} // end class
