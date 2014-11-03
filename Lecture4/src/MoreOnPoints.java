/*
 * 6 More on points
Write a program in which you create and use a class called Point, with two fields of type double 
(e.g. x, y) and the following methods:

distanceTo(Point): calculates the distance to another point.
distanceToOrigin(): calculates the distance to the origin. Implement it by calling the first method. 
moveTo(double x, double y): changes the coordinates of this point to be the given parameters x and y. 
moveTo(Point): changes the coordinates of this point to move where the given point is.
clone(): returns a copy of the current point with the same coordinates.
opposite(): returns a copy of the current point with the coordinates multiplied by −1.

Two methods in a class can have the same name (identifier) as long as their parameters are different. 
This is called method overloading and we will see more of that in the future.
 */

import java.util.Scanner;

public class MoreOnPoints {
	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		double x1, y1, x2, y2, x3, y3;
		double distance1, distance2;
		
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3, p4;
		
		// Input
		// -----
		
		System.out.println("Enter Your coordinate: ");
		x1 = importConsole.nextDouble();
		y1 = importConsole.nextDouble();
		
		p1.setX(x1);
		p1.setY(y1);
		
		System.out.println("Enter Alternate coordinate: ");
		x2 = importConsole.nextDouble();
		y2 = importConsole.nextDouble();
		
		p2.setX(x2);
		p2.setY(y2);
		
		
		// Utilize Methods
		// ---------------
		
		// distanceTo(Point)
		
		distance1 = p1.distanceTo(p2);
		System.out.println("Distance between Chosen Point and Alternate =  " + distance1);
		
		// distanceToOrigin():
		distance2 = p1.distanceToOrigin();
		System.out.println("Distance between Chosen Point and Origin =  " + distance2);
		
		// moveTo(double x, double y):
		System.out.println("Enter Co-ordinates of new Alternate =  " );
		x3 = importConsole.nextDouble();
		y3 = importConsole.nextDouble();
		p2.moveTo(x3, y3);
		System.out.println("New Altenate Point: " + p2.getX() +" "+ p2.getY());
		
		// moveTo(Point p)
		System.out.println("Move Alternate to Chosen Point  " );
		p2.moveTo(p1);
		System.out.println("Proof p2 = " + p2.getX() +" "+ p2.getY());
		
		// clone()
		// -------
		System.out.println("Clone of Chosen Point " );
		p3 = p1.clone();
		System.out.println("Proof p3 = " + p3.getX() +" "+ p3.getY());
		
		// opposite()
		// ----------
		System.out.println("Create Mirror of Chosen Point " );
		p4 = p1.opposite();
		System.out.println("Proof p4 = " + p4.getX() +" "+ p4.getY());
		
		importConsole.close();
		
	} // end main
} // end class
