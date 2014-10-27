import java.util.Scanner;

public class InterestPayments {
	
	public static void main(String[] args){
		
		// Initializations & Declarations
		// ------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		double mortgage;
		int maturity;
		double r;
		double amortize;
		double totalr;
		double totalTotal;
		double totalYear;
		int countYears = 0;
		double rPayment;
		
		
		// Inputs
		// ------
		
	System.out.println("Enter Mortgage Requested: ");
	mortgage = importConsole.nextDouble();
	
	System.out.println("Enter Maturity: ");
	maturity = importConsole.nextInt();
	
	System.out.println("Enter r: ");
	r = importConsole.nextDouble();
	
	
	// Calculations
	// ------------
	
	totalTotal = Math.pow(mortgage*(1+(r/100)), maturity);
	amortize = mortgage/maturity;
	
	for(int i=0;i<maturity;i++){
		
		mortgage -= amortize;
		totalYear = mortgage*(1+(r/100));
		
		
	}
	totalYear = mortgage*(1+(r/100));
	totalr = Math.pow(mortgage*(r/100), maturity);
	
	rPayment = totalr;
	
	
	while(rPayment>=0){
		rPayment -= mortgage*(r/100);
		countYears++;
	}
	
	// Output
	// ------
	
	System.out.println("Total Mortgage Cost: " + totalTotal);
	
	
		
		
	} // end main
	
	public double(double t, double c, double r ){
		
		
		
	}

} // end class
