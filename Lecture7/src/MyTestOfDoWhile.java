
public class MyTestOfDoWhile {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		boolean check = true;
		
		System.out.println("Test While Loop");
		while(check == false){
			System.out.println("hello while Loop");   // No Output as condition fails before
		}											  // loop starts
		System.out.println("\nNo Outpu!");
		
		System.out.println("\nTest DO-While Loop");	
		do{												// Get first run in
			System.out.println("hello Do-While Loop!");	// BEFORE conditions is checked
		}while(check == false);       
		
		
		

	}

}
