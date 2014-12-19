import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		// Initializations & Declarations
		Scanner importConsole = new Scanner(System.in);
		double x = 0; double y =0; double ans = 0;
		int operation;
		
		// Input
		// -----
		
		System.out.println("Input Number 1: ");
		x = importConsole.nextDouble();
		System.out.println("Input Number 2: ");
		y = importConsole.nextDouble();
		
		System.out.println();
		System.out.println("Select From Menu Below");
		
		System.out.println("Menu");
		System.out.println("1) Add");
		System.out.println("2) Subtract");
		System.out.println("3) Multiply");
		System.out.println("4) Divide");
		
		System.out.println();
		operation = importConsole.nextInt();
		// System.out.println("operation " + operation);
		
		// Calculation
		// ----------
		
		switch (operation){
			case 1:
				ans = x + y;
				System.out.println(x + "+" + y +"= " + ans);
				break;
			case 2:
				ans = x - y;
				System.out.println(x + "-" + y +"= " + ans);
				break;
			case 3:
				ans = x * y;
				System.out.println(x + "*" + y +"= " + ans);
				break;
			case 4:
				ans = x / y;
				System.out.println(x + "/" + y +"= " + ans);
				break;
		} // end case
		
	importConsole.close();	
	
	} // end main
} // end class
