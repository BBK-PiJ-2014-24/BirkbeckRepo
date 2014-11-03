/*14 Inside or outside
Write a program that reads the coordinates of the two points defining a rectangle and then the 
coordinates of a third point. 
The program must then determine whether the point falls inside or outside the rectangle.
*/

import java.util.Scanner;

public class InsideOutside {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		
		double x,y;
		double length,height, area, perimeter;
		
		Point pUL = new Point();
		Point pDR = new Point(); 
	
		boolean inRectangle = true;
		
		// Input
		// -----
	
		System.out.println("Input UpperLeft Co-Ords: ");
		x = importConsole.nextDouble();
		y = importConsole.nextDouble();
		pUL.setX(x);
		pUL.setY(y);
		
		System.out.println("Input DownRight Co-Ords: ");
		x = importConsole.nextDouble();
		y = importConsole.nextDouble();
		pDR.setX(x);
		pDR.setY(y);
		
		System.out.println("Input Test Co-Ord: ");
		x = importConsole.nextDouble();
		y = importConsole.nextDouble();

		// Calc
		// ----

		if(x<pUL.getX() || x>pDR.getX())
			inRectangle = false;
		if(y<pDR.getY() || y>pUL.getY())
			inRectangle = false;
		
		if(inRectangle)
			System.out.println("The co-ord, (" + x + "," + y + "), is in the Rectangle");
		else
			System.out.println("The co-ord, (" + x + "," + y + "), is NOT in the Rectangle");
		
		importConsole.close();
	} // end main
} // end class
