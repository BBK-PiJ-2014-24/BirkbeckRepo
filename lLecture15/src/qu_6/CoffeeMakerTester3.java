package qu_6;
/*
 * THIS TEST1 CATCHES BOTH EXCEPTIONS WITH NO TRY/CATCH BLOCKS AND WITHIN LAUNCH(), but amends this launch 
 * declaration to throw TempException (i.e. propagate to upstairs to main())
 * Result:  checkedException method is thrown to main(), but cannot continue on in the launch() method 
 * , coz already up the stack main()
 */

public class CoffeeMakerTester3 {

	public static void main(String[] args){
		CoffeeMakerTester3 cofmak = new CoffeeMakerTester3();
		try{
		cofmak.lauch();
		}
		catch(TempException ex){
			System.out.println("Temp Exception Propagated upstack to main()");
			ex.printStackTrace();
		}
	} // end main
	
	
	public void lauch() throws TempException{
	
		// Initializations and Declarations
		// --------------------------------
		int temp = 0;
		boolean sweetTooth = false;
		int sugarLumps = 2;
		
		CupOfCoffee c = new CupOfCoffee();
		
		
		// Using Checked Exception Method
		// ------------------------------
	
			System.out.println("Start Making Coffee");
			  c.makeCoffee(temp);  // As Checked, it must be caught/try or propagated upstairs
			
		
		System.out.println("\nWe reach the end of making coffee - Part I");
		
		// Using Runtime  Exception Method with try/catch
		// ----------------------------------------------
	
			System.out.println("\nAdding sugar Wiht NO try/catch BLOCK");
			c.addSugar(sugarLumps, sweetTooth);
		
		
		System.out.println("\nI'm leaving the cafe");
		
	}
}
