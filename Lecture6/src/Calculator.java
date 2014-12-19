/*
 * 1 Dividing integers
 * ===================
 * Create a Java class called Calculator. The class should implement the following methods, 
 * each of them printing the result on the screen.

• add(int, int)
• subtract(int, int)
• multiply(int, int)
• divide(int, int)
• modulus(int, int)

Note that you will will need to cast the parameters into double to perform exact division.
 */
public class Calculator {

	// USING STATIC CLASSES!!!
	
	public static int add(int x, int y){
		int z = x + y;
		return z;
	}
	
	public static int subtract(int x, int y){
		int z = x - y;
		return z;
	}
	
	public static int multiply(int x, int y){
		int z = x * y;
		return z;
	}
	
	public static double divide(int x, int y){
		double z;
		z = (double)x /(double) y;
		
		return z;
	}
	
}
