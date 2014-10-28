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
		double interestYear;
		double mortgageYear;
		double outstandingMortgage;
		
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
	

	amortize = mortgage/maturity;
	
	for(int i=0;i<maturity;i++){
		
		
		interestYear = calcYearInterest(mortgage,r)
		MortageYear = calcYearMortgage(mortgage,r); 
		
		
		System.out.println(i /t);
		System.out.print("Amortize Cost: " + amortize /t);
		System.out.print("Mortgage interest: " + interestYear /t);
		System.out.print("Total Mortgage: " + MortgageYear /t);
		
		outstandingMortage = calcAmortMortgage(mortgage, amortize, i);
		System.out.print("Outstanding Mortgage: " + outstandingMortage);
		
		
		}  // end for loop		
	} // end main
	
	
	// Annual Interest Cost
	// -------------------
	public double calcYearInterest(double mortgage, double r ){	
		double innterestyear;
		interestYear = mortgage*(r/100); 
		return interestYear;	
	}
	
	public double calcAmortMortgage(double mortgage, double amortize, double time){
		mortgage -= amortize*time;
		return mortgage;
	}
	
	public double calcYearMortgage(double m, double r){
		double total;
		total = m + r; 
	}
	
	

} // end class
