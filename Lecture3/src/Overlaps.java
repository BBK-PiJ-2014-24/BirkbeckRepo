/*
15. Overlaps
Write a program that reads the coordinates of four point points, the former two defining 
one rectangle and the latter two defining another one. The program must read the coordinates
of a fifth point and say whether the point is inside both rectangles, inside one of them only, 
or out of both.
 */

import java.util.Scanner;

public class Overlaps {

	public static void main(String[] args) {
		// Initializations & Declarations
				// ------------------------------
				
				Scanner importConsole = new Scanner(System.in);
				double x,y;
				double length,height, area, perimeter;
				
				Point r1UL = new Point();
				Point r1DR = new Point(); 
				
				Point r2UL = new Point();
				Point r2DR = new Point(); 
				
				boolean inRectangle1 = true;
				boolean inRectangle2 = true;
					
				// Input
				// -----
			
				System.out.println("Rectangle1 - Input UpperLeft Co-Ords: ");
				x = importConsole.nextDouble();
				y = importConsole.nextDouble();
				r1UL.setX(x);
				r1UL.setY(y);
				
				System.out.println("Rectangle1 - Input DownRight Co-Ords: ");
				x = importConsole.nextDouble();
				y = importConsole.nextDouble();
				r1DR.setX(x);
				r1DR.setY(y);
				
				System.out.println("Rectangle2 - Input UpperLeft Co-Ords: ");
				x = importConsole.nextDouble();
				y = importConsole.nextDouble();
				r2UL.setX(x);
				r2UL.setY(y);
				
				System.out.println("Rectangle2 - Input DownRight Co-Ords: ");
				x = importConsole.nextDouble();
				y = importConsole.nextDouble();
				r2DR.setX(x);
				r2DR.setY(y);
				
				System.out.println("Input Test Co-Ord: ");
				x = importConsole.nextDouble();
				y = importConsole.nextDouble();
				
				// Calc
				// ----

				if(x<r1UL.getX() || x>r1DR.getX())
					inRectangle1 = false;
				if(y<r1DR.getY() || y>r1UL.getY())
					inRectangle1 = false;

				if(x<r2UL.getX() || x>r2DR.getX())
					inRectangle2 = false;
				if(y<r2DR.getY() || y>r2UL.getY())
					inRectangle2 = false;
				
				if(inRectangle1 && inRectangle2 )
					System.out.println("The co-ord, (" + x + "," + y + "), is in BOTH Rectangles");
				else if(inRectangle1 && !inRectangle2 )
					System.out.println("The co-ord, (" + x + "," + y + "), is in Rectangle 1, but NOT Retangle 2");
				else if(!inRectangle1 && inRectangle2 )
					System.out.println("The co-ord, (" + x + "," + y + "), is NOT in Rectangle 1, but is in Retangle 2");
				else if(!inRectangle1 && !inRectangle2 )
					System.out.println("The co-ord, (" + x + "," + y + "), is in NEITHER Retangle");
				
				
				importConsole.close();
				
	} // end main
} // end class
