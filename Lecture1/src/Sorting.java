// Question 7. Sorts order of 3 numbers.


import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		// Declarations & Initializations
		// ------------------------------
		
			Scanner importConsole = new Scanner(System.in);
			int x=0; int y=0; int z=0;
			int pos1, pos2, pos3;
			
		
		// Input Values
		// -------------	
		
			System.out.println("Input First Number: ");
			x = importConsole.nextInt();
			System.out.println("Input Second Number: ");
			y = importConsole.nextInt();
			System.out.println("Input Third Number: ");
			z = importConsole.nextInt();
			System.out.println();
			
			
		// Sort Routine
		// ------------
			
			if(x>=y){
				pos1 = x;
				pos2 = y;
				} 
			else{
				pos1 = y;
				pos2 = x;
			}
			
			
			if(pos1>=z){
				if(pos2>=z)
					pos3=z;
				else{
					pos3 = pos2;
					pos2=z;
					}
				}
			else{
				pos3 = pos2;
				pos2 = pos1;
				pos1=z;
			}
			
			System.out.println("");
			System.out.println("High: " + pos1);
			System.out.println("Med: " + pos2);
			System.out.println("Low: " + pos3);
	} // end main
				
} // end Class


