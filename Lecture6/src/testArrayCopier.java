/*
 *Qu. 2) Copying arrays
Create a new Java class called ArrayCopier with a method called copy that takes two arrays of integers 
as parameters. The method should copy the elements of the first array (you can call it src, from 
“source”) to the second one (dst, from “destination”) as much as possible.
If the second array is smaller, then only those elements that fit will be copied. If the second array 
is larger, it will be filled with zeroes.
Write a program that creates an object of this class and uses this method to copy some arrays in 
all three cases:
• Both arrays are of the same size.
• The source array is longer.
• The source array is shorter.
 */

import java.util.Scanner;

public class testArrayCopier {

	public static void main(String[] args) {
		// Initialization and Declarations
		// -------------------------------
		
	//	Scanner importConsole = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[10];
		int[] c = new int[3];
		
		
		// Calc When a > b
		// ---------------
		
		for(int i=0;i<a.length;i++){
			a[i] = i;
		}
		System.out.println("Example of Method Copying into a Larger Array");
		ArrayCopier.copyArray(a, b);
		 
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		// Calc When a < c
		// ---------------
		
		System.out.println("Example of Method Copying into a Smaller Array");
		
		ArrayCopier.copyArray(a, c);
		 
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
		
	
	} // end main
} // end class
