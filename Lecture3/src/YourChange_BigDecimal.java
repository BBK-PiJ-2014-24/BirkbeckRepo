import java.util.Scanner;
import java.math.*;


public class YourChange_BigDecimal {

	public static void main(String[] args) {

		// Initialization and Declarations
		// -------------------------------
		
		 Scanner importConsole = new Scanner(System.in);
		 double cost = 0;
		 double paid = 0;
		 double change = 0;
		 boolean enoughMon = false;
		 
		 BigDecimal bdP,bdC,bdChange,bdX; 
		 
		 BigDecimal bdFifty;	// Notes
		 BigDecimal bdTwenty;
		 BigDecimal bdTenner;
		 BigDecimal bdFiver;
		 BigDecimal bdTwoPound;	// Coins
		 BigDecimal bdOnePound;
		 BigDecimal bdFiftyPence;
		 BigDecimal bdTwentyPence;
		 BigDecimal bdTenPence;
		 BigDecimal bdFivePence;
		 BigDecimal bdTwoPence;
		 BigDecimal bdOnePence;
		 

		 
		 // Inputs 
		 // ------
		 
		 System.out.println("Cost of Item: ");
		 cost = importConsole.nextDouble();
		 while(!enoughMon){
			 System.out.println("Amount Paid: ");
			 paid = importConsole.nextDouble();
			 if(paid >= cost)
				 enoughMon = true;
		 } // end while
		 
		 
		 // Calc Change
		 // -----------
		 
		 change = Math.abs(paid - cost);
		 System.out.println("Total Change: " + change);	 
		
		 bdC = new BigDecimal(cost);
		 bdP = new BigDecimal(paid);
		 bdChange = bdP.subtract(bdC);
		 bdChange = bdChange.setScale(2, RoundingMode.FLOOR);
		 System.out.println("Remaining Change: " + bdChange);	 
		 
		 bdX = new BigDecimal("50");
		 bdFifty = bdChange.divideToIntegralValue(bdX);  
		 bdFifty = bdFifty.setScale(0, RoundingMode.FLOOR);
		 bdChange = bdChange.remainder(bdX);	
		 System.out.println("Remaining Change: " + bdChange);	
		 
		 bdX = new BigDecimal("20");
		 bdTwenty = bdChange.divide(bdX);  
		 bdTwenty = bdTwenty.setScale(0, RoundingMode.FLOOR);
		 bdChange = bdChange.remainder(bdX);	
		 System.out.println("Remaining Change: " + bdChange);	
		 
		 bdX = new BigDecimal("10");
		 bdTenner = bdChange.divide(bdX); 
		 bdTenner = bdTenner.setScale(0, RoundingMode.FLOOR);
		 bdChange = bdChange.remainder(bdX);	
		 System.out.println("Remaining Change: " + bdChange);	
		 
		 bdX = new BigDecimal("5");
		 bdFiver = bdChange.divide(bdX);
		 bdFiver = bdFiver.setScale(0, RoundingMode.FLOOR);
		 bdChange = bdChange.remainder(bdX);
		 System.out.println("Remaining Change: " + bdChange);	
		 
		 bdX = new BigDecimal("2");
		 bdTwoPound = bdChange.divide(bdX);
		 bdTwoPound = bdTwoPound.setScale(0, RoundingMode.FLOOR);
		 bdChange = bdChange.remainder(bdX);
		 System.out.println("Remaining Change: " + bdChange);	
		 
		 bdX = new BigDecimal("1");
		 bdOnePound = bdChange.divide(bdX); 
		 bdOnePound = bdOnePound.setScale(0, RoundingMode.FLOOR);
		 bdChange = bdChange.remainder(bdX);
		 System.out.println("Remaining Change: " + bdChange);	
		 
		 bdX = new BigDecimal("0.5");
		 bdFiftyPence = bdChange.divide(bdX); 
		 bdFiftyPence = bdFiftyPence.setScale(0, RoundingMode.FLOOR);
		 bdChange = bdChange.remainder(bdX);
		 System.out.println("Remaining Change: " + bdChange);	
		
		 bdX = new BigDecimal("0.2");
		 bdTwentyPence = bdChange.divide(bdX); 
		 bdTwentyPence = bdTwentyPence.setScale(0, RoundingMode.FLOOR);
		 bdChange = bdChange.remainder(bdX);
		 System.out.println("Remaining Change: " + bdChange);	
		
		 bdX = new BigDecimal("0.1");
		 bdTenPence = bdChange.divide(bdX);  
		 bdTenPence = bdTenPence.setScale(0, RoundingMode.FLOOR);
		 bdChange = bdChange.remainder(bdX);
		 System.out.println("Remaining Change: " + bdChange);	
		 
		 bdX = new BigDecimal("0.05");
		 bdFivePence = bdChange.divide(bdX);  
		 bdFivePence = bdFivePence.setScale(0, RoundingMode.FLOOR);
		 System.out.println("Remaining Change: " + bdChange);	
		 
		 bdX = new BigDecimal("0.01");
		 bdOnePence = bdChange.divide(bdX);
		 bdOnePence = bdOnePence.setScale(0, RoundingMode.FLOOR);
		 System.out.println("Remaining Change: " + bdChange);	
		 
		 // Output
		 // ------
		 
		 System.out.println(bdFifty + " fifties");
		 System.out.println(bdTwenty + " Twenties");
		 System.out.println(bdTenner + " Tenners");
		 System.out.println(bdFiver + " fivers");
		 System.out.println(bdTwoPound + " two-pound coins");
		 System.out.println(bdOnePound + " one-pound coins");
		 System.out.println(bdFiftyPence + " fifty pence coins");
		 System.out.println(bdTwentyPence + " twenty pence coins");
		 System.out.println(bdTenPence + " ten pence coins");
		 System.out.println(bdFivePence + " five pence coins");
		 System.out.println(bdOnePence + " one pence coins");
		 importConsole.close();
	} // end main

} // end class
