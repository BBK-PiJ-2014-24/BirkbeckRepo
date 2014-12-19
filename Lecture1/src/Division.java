// Qu.6) Division Without Using /

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// Initializations and Declarations
		// --------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		int x = 0; int y=0;
		int multiple = 0;
		int remainder = 0;
		int total = 0;
		
	// Input Numbers
	// -------------
		
		System.out.println("Input First Number: ");
		x = importConsole.nextInt();
		System.out.println("Input Second Number: ");
		y = importConsole.nextInt();
		
		System.out.println();
		
		
	// Multiple Routine
	// ----------------
		
		while(total<=x){
			multiple++;
			total = (multiple) * y;
		}
		multiple -=1;
		
	// Modulus Routine
	// ---------------
		
		remainder = x - (multiple*y);
		
	// Output
	// ------	
		System.out.println(x + "/" + y + " = " + multiple + " remainder " + remainder);
		
	// Close Scanner
	// -------------
		
		importConsole.close();
		
		
	}// end Main

} // end Class
