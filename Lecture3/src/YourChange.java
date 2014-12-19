// Reads In Cost of an Item, Amount paid and Change Given

import java.util.Scanner;


public class YourChange {

	public static void main(String[] args) {

		// Initialization and Declarations
		// -------------------------------
		
		 Scanner importConsole = new Scanner(System.in);
		 double cost = 0;
		 double paid = 0;
		 double change = 0;
		 boolean enoughMon = false;
		 
		 int fifty = 0;		// Notes
		 int twenty = 0;
		 int tenner = 0;
		 int fiver = 0;
		 int twoPound = 0;	// Coins
		 int onePound = 0;
		 int fiftyPence = 0;
		 int twentyPence = 0;
		 int tenPence = 0;
		 int fivePence = 0;
		 int twoPence = 0;
		 int onePence = 0;
		 

		 
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
		
		 
		 fifty = (int)change/50;  // Need to recast for ints
		 change = change%50;	
		 
		 twenty = (int)change/20;
		 change = change%20;
		 
		 tenner = (int)change/10;
		 change = change%10;
		 
		 fiver = (int)change/5;
		 change = change%5;
		
		 twoPound = (int)change/2;
		 change = change%2;
		 
		 onePound = (int)change;
		 change = change%1;
		 
		 fiftyPence = (int)(change/0.5);  // must cast int around (double/double)
		 change = change%0.5;
		 
		 twentyPence = (int)(change/0.2);  // must cast int around (double/double)
		 change = change%0.2;

		 tenPence = (int)(change/0.1);  // must cast int around (double/double)
		 change = change%0.1;
		 
		 
		 fivePence = (int)(change/0.05);  // must cast int around (double/double)
		 System.out.println("5p Change: " + change);	 
		 onePence = (int)(change%0.05*100);
		 System.out.println("last Change: " + change);	 
		 
		 
		 // Output
		 // ------
		 
		 System.out.println(fifty + " fifties");
		 System.out.println(twenty + " Twenties");
		 System.out.println(tenner + " Tenners");
		 System.out.println(fiver + " fivers");
		 System.out.println(twoPound + " two-pound coins");
		 System.out.println(onePound + " one-pound coins");
		 System.out.println(fiftyPence + " fifty pence coins");
		 System.out.println(twentyPence + " twenty pence coins");
		 System.out.println(tenPence + " ten pence coins");
		 System.out.println(fivePence + " five pence coins");
		 System.out.println(onePence + " one pence coins");
		 importConsole.close();
	} // end main

} // end class
