package qu_6;

/*
 * THIS TEST1 CATCHES BOTH EXCEPTIONS WITH NO TRY/CATCH BLOCKS AND WITHIN LAUNCH()
 * Result: Can't even run checkedException method (Coz they are unhandled). And RunTime Exception 
 * just Breaks the code.
 */

public class CoffeeMakerTester2 {

	public static void main(String[] args){
		CoffeeMakerTester2 cofmak = new CoffeeMakerTester2();
		cofmak.lauch();
	} // end main
	
	
	public void lauch(){
	
		// Initializations and Declarations
		// --------------------------------
		int temp = 0;
		boolean sweetTooth = false;
		int sugarLumps = 2;
		
		CupOfCoffee c = new CupOfCoffee();
		
		
		// Using Checked Exception Method
		// ------------------------------
	
			System.out.println("Start Making Coffee");
			 // c.makeCoffee(temp);  // As Checked, it must be caught/try or propagated upstairs
			
		
		System.out.println("\nWe reach the end of making coffee - Part I");
		
		// Using Runtime  Exception Method with try/catch
		// ----------------------------------------------
		
	
			System.out.println("\nAdding sugar Wiht NO try/catch BLOCK");
			c.addSugar(sugarLumps, sweetTooth);
		

		
		
		System.out.println("\nI'm leaving the cafe");
		
		} // end launch

}
