package qu_6;

public class CoffeeMakerTester1 {
	
	
	public static void main(String[] args){
		CoffeeMakerTester1 cofmak = new CoffeeMakerTester1();
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
			System.out.println("Aiya! in temp try/catch");
			 ex.printStackTrace(); // Prints the Excepion message and its place in the Stack
		}
		
		System.out.println("\nWe reach the end of making coffee - Part I");
		
		// Using Runtime  Exception Method with try/catch
		// ----------------------------------------------
		
		try{
			System.out.println("\nAdding sugar in try/catch");
			c.addSugar(sugarLumps, sweetTooth);
		}
		catch(SugarException e){
			System.out.println("eh! in sugar try/catch");
			 e.printStackTrace();
			 String s = e.getMessage();   // Just gets the Error Exception Message;
			 System.out.println(); 
			 System.out.println("getMessage:" + s); 
		}
		
		
		System.out.println("\nI'm leaving the cafe");
		
		} // end launch

} // end class 
