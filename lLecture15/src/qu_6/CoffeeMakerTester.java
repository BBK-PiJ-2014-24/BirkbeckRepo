package qu_6;

public class CoffeeMakerTester {
	
	
	public static void main(String[] args){
		CoffeeMakerTester cofmak = new CoffeeMakerTester();
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
		try{
			System.out.println("Start Making Coffee");
			c.makeCoffee(temp);
			System.out.println("Coffee temp ok");// As makeCoffee() method throws a CHECKED EXCEPTION. This 
		}							// method has a choice of catch/try or "propgating throw up 
		catch (TempException ex){   // the stack (i.e. to main)
			System.out.println("Aiya!");
			ex.getMessage();
			ex.printStackTrace();
		}
		
		System.out.println("\nWe reach the end of making coffee");
		
		// Using Runtime  Exception Method
		// -------------------------------
		
		try{
			System.out.println("\nAdding sugar");
			c.addSugar(sugarLumps, sweetTooth);
		}
		catch(SugarException e){
			System.out.println("\neh!");
			e.getStackTrace();
			e.getMessage();
		}
		
		System.out.println("\nI'm leaving the cafe");
		
		} // end launch

} // end class 
