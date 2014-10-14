
import java.util.Scanner;

public class NumberPyramids {

	public static void main(String[] args) {
		
	// Initializations and Declarations
	// --------------------------------
	
		int rows = 0; 
		
	// Scanner Object
   //  --------------	
		Scanner importConsole = new Scanner(System.in);
		
		System.out.println("Input Number of Rows: ");
		rows = importConsole.nextInt();
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<i+1; j++){
				System.out.print(i+1);
			} // end j-loop
			System.out.println();
		} // end i-loop	
		
	} // end main

} // end class
