/*
 * 2.2 b) Fibonacci
Write a small program with a method that calculates the nth element of the Fibonacci sequence 
as seen in the notes. Is it easy to do this both iteratively and recursively? Try both ways and 
see which is more natural for you. If
one takes too long, try the other way.
When doing it recursively, do it with and without memoization. Compare the time that 
is needed in each case to find F(40) or F(45).
 */

import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		Fibonacci f = new Fibonacci();
		Scanner importConsole = new Scanner(System.in);
		int x;
		
		
		// input
		// -----
		
		System.out.println("Input Number: ");
		x = importConsole.nextInt();
		
		// Calc
		// ----
		 
		int fI= f.iterativeFibo(x);
		int fR = f.recursiveFibo(x);
	
		System.out.println("Fib(" + x + ")=  " + fI + " (Iterative)");
		System.out.println("Fib(" + x + ")=  " + fI + " (Recursive)");
		
		importConsole.close();	
		
		
		
	} // end main

	// iterative Fibo
	//---------------
	public int  iterativeFibo(int x){
		int fib0 = 2;
		int fib1 = 1;
		int fib2 = 1;
		if(x<3)
			return fib1;
		else{
			for(int i=2;i<x;i++){
				fib0 = fib1 + fib2;
				fib2 = fib1;
				fib1= fib0;
			}// end loop
			return fib0;
		}// end else
	}// end iterativeFibo
	
	
	// recursive Fibo
	//---------------
		public int recursiveFibo(int n){
			
			if(n < 3)
				return 1;
			else{
				int result = recursiveFibo(n-1) + recursiveFibo(n-2);
				return result;
			} // end else
		} // end recursiveFibo
	
} // end class
