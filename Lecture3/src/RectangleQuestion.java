/*13 Rectangle
Write a program that reads the X and Y coordinates of two points and then outputs the area of a 
rectangle where both points are opposite corners. Use the following class to store the data for 
the points:

class Rectangle { 
Point upLeft; 
Point downRight;
}
Your program should calculate (and write on the screen) the perimeter and area of the rectangle.
 */


import java.util.Scanner;

public class RectangleQuestion {
	
	

	public static void main(String[] args) {
		
		// Initializations & Declarations
		// ------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		double x,y;
		double length,height, area, perimeter;
		
		Point p1 = new Point();
		Point p2 = new Point(); 
		Rectangle r = new Rectangle();
			
		
		
		// Input
		// -----
	
		System.out.println("Input UpperLeft Co-Ords: ");
		x = importConsole.nextDouble();
		y = importConsole.nextDouble();
		p1.setX(x);
		p1.setY(y);
		
		System.out.println("Input DownRight Co-Ords: ");
		x = importConsole.nextDouble();
		y = importConsole.nextDouble();
		p2.setX(x);
		p2.setY(y);
		
		r.setUpLeft(p1);
		r.setDownRight(p2);
		
		// Calc
		// ----
		
		length = r.getDownRight().getX() - r.getUpLeft().getX();
		height = r.getUpLeft().getY() - r.getDownRight().getY();
		
		area = length * height;
		perimeter = (2*length)+(2*height);
		
		System.out.println("area: " + area);
		System.out.println("perimeter: " + perimeter);
		
		importConsole.close();
		
	} // end Main
} // end Class
