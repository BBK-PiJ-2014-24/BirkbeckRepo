import java.util.Scanner;

public class PokerScore {

	public static void main(String[] args) {
		
		// Initializations & Declarations
		// ------------------------------
		
		int[] card = new int[5];
		String[] suit = new String[5];
		int minCard = 100; 
		int maxCard = 0;
		boolean straight = false; // for Straights
		boolean flush = false;
		int flushCounter = 1; // Counts number of cards of same suit.
		
		
		// Scanner Object
		// --------------
		Scanner importConsole = new Scanner(System.in);
		
		
		// Read-In Cards and Determine min/max
		// ------------------------------------
		for(int i = 0; i<5;i++){
			System.out.print("Input Card "+ (i+1) + ": ");
			card[i] = importConsole.nextInt();
			suit[i] = importConsole.nextLine();
			while(card[i] < 1 || card[i] > 13 || suit[i].equals("h") || suit[i].equals("d")){ // Correction Loop
				System.out.print("Invalid Number Please Reinput Card[" + i + "]: ");
					card[i] = importConsole.nextInt();
					suit[i] = importConsole.nextLine();
			}// end while
			System.out.println("Card Selected: "+ card[i]+suit[i]);
				
			if (card[i]< minCard)
				minCard = card[i];
			if (card[i]>maxCard)
				maxCard = card[i];	
		}// end for
		
		// check Arrays
		// ------------
		
	//	for (int i =0;i<5;i++){
	//		System.out.println("Card[" +i+ "]" + card[i] + "+" +suit[i]);
	//	}
		
		// Check Consecutive Numbers for a Straight
		// ----------------------------------------
		
		for (int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(card[j] == minCard + 1)
					minCard = card[j];
			}
		}
		if(minCard == maxCard){ 
			straight = true;
		//	System.out.println("You Hold A Straight Hand");
		}
		
		
		// Check for Flush
		// ---------------
		
		for(int i=1;i<5;i++){
			if(suit[0].equals(suit[i]))
				flushCounter++;
			} // end for loop
		if (flushCounter == 5){
			flush = true;
		//	System.out.println("You Hold a Flush");
		}
		
		// Check for Pairing
		// -----------------
		
		int groupCount = 0;
		int groupCard= card[0];
		int firstGroupCount = 0;
		int firstGroupCard= 0;
		int secondGroupCount = 0;
		int secondGroupCard = 0;
		
		
		for (int i=0; i<5; i++){
			for (int j=i;j<5;j++){
				if(card[j]==card[i]){	
					groupCount++;
					groupCard = card[i];
				}
			} // end j-loop
			if (groupCount > 1){
				if(firstGroupCard == 0){
					firstGroupCard = groupCard;
					firstGroupCount = groupCount;
				} 
				else if(groupCard != firstGroupCard) {
					secondGroupCard = groupCard;
					secondGroupCount = groupCount;
				}			
			}
			groupCount = 0;
			groupCard = 0;
		} // end i-loop
		
		
		System.out.println();
		System.out.println("firstGroupCard: " + firstGroupCard);
		System.out.println("firstGroupCount: " + firstGroupCount);
		System.out.println("secondGroupCard: " + secondGroupCard);
		System.out.println("secondGroupCount: " + secondGroupCount);
		System.out.println();
		
		// Criterion Table
		// ---------------
		
		if (straight == true && flush == true)
			System.out.println("You Hold a Straight Flush");
		else if (straight == true)
			System.out.println("You Hold A Straight");
		else if (flush == true)
			System.out.println("You Hold a Flush");
		else if (firstGroupCount==4)
			System.out.println("Four of a Kind: " + firstGroupCard + "'s");
		else if (firstGroupCount == 3 && secondGroupCount == 2)
			System.out.println("Full House: Three of a kind of " + firstGroupCard + "'s and a pair of " + secondGroupCard + "'s");
		else if (firstGroupCount == 2 && secondGroupCount == 3)
			System.out.println("Full House: Three of a kind of" + secondGroupCard + "'s and a pair of " + firstGroupCard + "'s");
		else if (firstGroupCount == 3 && secondGroupCount == 0)
			System.out.println("Three of a kind of " + firstGroupCard + "'s");
		else if (firstGroupCount == 2 && secondGroupCount == 2)
			System.out.println("Two Pairs: pair of " + secondGroupCard + "'s and pair of " + firstGroupCard + "'s");
		else if (firstGroupCount == 2 && secondGroupCount == 0)
			System.out.println("A Pair of " + firstGroupCard + "'s");
		else
			System.out.println("No Groupings");
		
		importConsole.close();
		
	}// end main
	
	
	

}
