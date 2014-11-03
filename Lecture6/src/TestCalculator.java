import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		//Initializations & Declarations
		// -----------------------------
		
		TestCalculator tc = new TestCalculator();
		Scanner importConsole = new Scanner(System.in);
		int x,y;
		
		// Input
		// -----
		System.out.println("Input x and y: ");
		x = importConsole.nextInt();
		y = importConsole.nextInt();

		
		// Test Calculator
		// ---------------
		
		int plus = Calculator.add(x, y);
		System.out.println(x + "+" + y + "=" + plus);
		
		int minus = Calculator.subtract(x, y);
		System.out.println(x + "-" + y + "=" + minus);
		
		int multiply = Calculator.multiply(x, y);
		System.out.println(x + "*" + y + "=" + multiply);		
		
		double div = Calculator.divide(x, y);
		System.out.println(x + "/" + y + "=" + div);	
		
		
		importConsole.close();
	} // end Main
} // end Class
