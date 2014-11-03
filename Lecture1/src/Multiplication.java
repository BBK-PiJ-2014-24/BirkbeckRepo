// Qu.6) Multiplication But Without Using *

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
			Scanner importConsole = new Scanner(System.in);
			int x = 0; int y=0;
			int total = 0;
			
		// Input Numbers
		// -------------
			
			System.out.println("Input First Number: ");
			x = importConsole.nextInt();
			System.out.println("Input Second Number: ");
			y = importConsole.nextInt();
			
			System.out.println();
			System.out.println(x + y);
			
		// Multiplication Routine
		// ----------------------	
		
			for(int i=0;i<y;i++){
				total += x;
			}
		System.out.println();	
		System.out.println(x + " * "+ y + " = " + total );	
		
		importConsole.close();
			
	} // end Main 

}
