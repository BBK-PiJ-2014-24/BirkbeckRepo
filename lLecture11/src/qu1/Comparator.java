/*
 * Look at the following code. Is there anything you can do to make this code better? 
 * Hint: you may need to convert between types (e.g. casting).

 * public class Comparator {

	public int getMax(int n, int m) {
        if (n > m) {
            return n;
        } 
        else {
            return m;
        }
 } // end getMax
	
	
	public double getMax(double d1, double d2) { 
		if (d1 > d2) {
	          return d1;
	        } 
		else {
			return d2; 
		}
	}
}
 */


package qu1;

// Avoid repetition in overloading by reusing more general method, and convert parameter 
// arguments accprdingly.

public class Comparator {

	public int getMax(int n, int m) {
		
		double nd = n;         
		double md = m;
		int x = (int) getMax(nd,md);
		return x;
        
 } 
	
	
	public double getMax(double d1, double d2) { 
		if (d1 > d2) {
	          return d1;
	        } 
		else {
			return d2; 
		}
	}
}
