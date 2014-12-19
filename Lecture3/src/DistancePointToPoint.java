/*12 Distance point–to–point
Write a program that reads the X and Y coordinates of three points and then outputs 
which of the three are closer - I ASSUME WHICH CLOSER TO ORIGIN. 

Use the following class to store the data for the points:
class Point { 
double x;
double y; 
}
*/
import java.util.Scanner;

public class DistancePointToPoint {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		DistancePointToPoint dpp = new DistancePointToPoint();
		
		Scanner importConsole = new Scanner(System.in);
		
		double x, y; 
		double h1, h2, h3;
		
		double min;
		String minPoint;

		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
	
		// Input
		// -----
		System.out.println("Input First Co-Ord Pair: ");
		
		x = importConsole.nextDouble();
		y = importConsole.nextDouble();
		p1.setX(x);
		p1.setY(y);
		
		System.out.println("Input Second Co-Ord Pair: ");
		x = importConsole.nextDouble();
		y = importConsole.nextDouble();
		p2.setX(x);
		p2.setY(y);
		
		System.out.println("Input Third Co-Ord Pair: ");
	
		x = importConsole.nextDouble();
		y = importConsole.nextDouble();
		p3.setX(x);
		p3.setY(y);
		
		// Calc
		// ----
		h1 = dpp.calcHypo(p1.getX(),p1.getY());
		h2 = dpp.calcHypo(p2.getX(),p2.getY());
		h3 = dpp.calcHypo(p3.getX(),p3.getY());
		
		if (h1 < h2){
			minPoint = "p1";
			min = h1;
		}
		else{
			minPoint = "p2";
			min = h2;
		}
		if (h3 < min)
			minPoint = "p3";
		
		switch (minPoint){
			case "p1":
				System.out.println("Point1, ("+p1.getX() +"," + p1.getY() + ") is the nearest Co-ordinate from the Origin");
				break;
			case "p2":
				System.out.println("Point2, ("+p2.getX() +"," + p2.getY() + ") is the nearest Co-ordinate from the Origin");
				break;
			case "p3":
				System.out.println("Point3, ("+p3.getX() +"," + p3.getY() + ") is the nearest Co-ordinate from the Origin");
				break;	
		} // end Switch
		
		importConsole.close();
	} //end main
	
	

	// Calc the Modulus From Pythaaaras
	public double calcHypo(double x,double y){
		double h = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return h;
	}
	
	
} // end class
