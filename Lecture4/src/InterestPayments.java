import java.util.Scanner;

public class InterestPayments {
	
	public static void main(String[] args){
		
		InterestPayments ip = new InterestPayments();
		
		// Initializations & Declarations
		// ------------------------------
		
		Scanner importConsole = new Scanner(System.in);
		double startMortgage;
		double mortgage;
		int maturity;
		double r;
		double amortize;
		double interestYearBill;
		double interestTotalBill = 0;
		double mortgageYearBill;
		double mortgageTotalBill=0;
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
	
	startMortgage = mortgage;
	amortize = mortgage/maturity;
	
	for(int i=0;i<maturity;i++){
		
		
		interestYearBill = ip.calcYearInterest(mortgage,r); 
		mortgageYearBill = ip.calcYearMortgageBill(amortize,interestYearBill); // amort+int
		interestTotalBill = calcTotalInterest(interestTotalBill,interestYearBill); // Note this is a static so no handle required
		mortgageTotalBill = calcTotalMortgage(mortgageTotalBill,mortgageYearBill); // Note this is a static so no handle required
		
		
		System.out.print("Year" + (i+1) + " ");  // N.b. use print
		System.out.print("Amortize Cost: " + amortize + "  ");
		System.out.print("Mortgage interest: " + interestYearBill + "  ");
		System.out.print("Ann. Mortgage Bill: " + mortgageYearBill + "  ");
		
		outstandingMortgage = ip.calcAmortMortgage(mortgage, amortize);
		System.out.println("Outstanding Mortgage: " + outstandingMortgage); // end line with println
		mortgage = outstandingMortgage; // new mortgage to calc int
		
		}  // end for loop	
	
		System.out.println("Total Interest Cost: " + interestTotalBill);
		System.out.println("All Interest Paid By Year: " + ip.calcPrincipalYear(startMortgage,amortize,interestTotalBill,r));
		
		
	} // end main
	
	
	// Annual Interest Cost
	// -------------------
	public double calcYearInterest(double mortgage, double r ){	
		double interestYear;
		interestYear = mortgage*(r/100); 
		return interestYear;	
	}
	
	public double calcAmortMortgage(double mortgage, double amortize){
		mortgage -= amortize;
		return mortgage;
	}
	
	public double calcYearMortgageBill(double a, double r){
		double total;
		total = a + r; 
		return total;
	}
	
	// Using a Static for Fun
	public static double calcTotalInterest(double totalI, double i){
		totalI+= i;
		return totalI;
	}
	
	public static double calcTotalMortgage(double totalM, double m){
		totalM+= m;
		return totalM;
	}	
	
	
	// method that calcs Year when Total Interest is paid and Principal is left
	// Note a static cannot be used here as calling another method in this class
	public int calcPrincipalYear(double mortgage, double amort, double iTotal, double r){
		int year = 0;
		double startMortgage = mortgage;
		double totalMortgageCost = mortgage + iTotal;  // Total Mortgage+Total Interest
		
		while(totalMortgageCost>=startMortgage){
			double interestYearBill = this.calcYearInterest(mortgage,r); 
			double mortgageYearBill = this.calcYearMortgageBill(amort,interestYearBill); // amort+int
			
			totalMortgageCost -= mortgageYearBill;   // using this to call other class method
			year++;
		}
		return year;	
	}
	
	

} // end class
