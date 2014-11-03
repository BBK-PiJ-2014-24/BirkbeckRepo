/* POINT CLASS
distanceTo(Point): calculates the distance to another point.
distanceToOrigin(): calculates the distance to the origin. Implement it by calling the first method. 
moveTo(double x, double y): changes the coordinates of this point to be the given parameters x and y. 
moveTo(Point): changes the coordinates of this point to move where the given point is.
clone(): returns a copy of the current point with the same coordinates.
opposite(): returns a copy of the current point with the coordinates multiplied by −1.
 */

public class Point {
	
	// Instance Variables
	
	private double x;
	private double y;
	
	// Accessor Methods
	// ---------------
	
	public void setX(double X){
		x = X;
	}
	
	public double getX(){
		return x;
	}
	
	public void setY(double Y){
		y=Y;
	}
	
	
	public double getY(){
		return y;
	}
	
	// distanceTo(Point):
	// -----------------
	
	public double distanceTo(Point p){
		double length;
		double height;
		double mod;
		
		length = Math.abs(x - p.getX());
		height = Math.abs(y-p.getY());
		
		mod =Math.sqrt(Math.pow(length,2)+Math.pow(height, 2));
		return mod;
	}
	
	// distanceToOrigin():
	// ------------------
	
	public double distanceToOrigin(){
		double mod;
		Point p = new Point();
		p.setX(0);
		p.setY(0);
		
		mod = distanceTo(p);
		
		return mod;
	}
	
	// moveTo(double x, double y): Overloaded
	// --------------------------
	
	public void moveTo(double x1, double y1){
		 x = x1;
		 y = y1;
	}
	
	// moveTo(Point): Overloaded
	// -------------
	
	public void moveTo(Point p){
		x = p.getX();
		y = p.getY();
	}
	
	
	// clone()
	// -------
	
	public Point clone(){
		Point p = new Point();
		p.setX(x);
		p.setY(y);
		
		return p;
	}
	
	// opposite()
	// ----------
	
	public Point opposite(){
		Point p = new Point();
		p.setX(-x);
		p.setY(-y);
		return p;
	}
	
} // end Class
