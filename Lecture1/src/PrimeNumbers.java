
public class PrimeNumbers {
// Prints All Primes < 1000
	
	
	public static void main(String[] args) {
		
		// Initializations and Declarations
		// --------------------------------
		int max = 1000;
		double Num = 2; // Candidate Number (double for sqrt()) 
		int sqNum = 0; 
		int countPrime=1;
		boolean Prime = true;
		
		
		// First Prime Number
		// -------------------
		System.out.println("2");
		
		
		
		for(int i=0;i<max;i++){
			Num++;
			sqNum = (int) Math.sqrt(Num);   // Cast to int
			int j = 2;
			while(j <= sqNum){
				int mod = 0;
				mod = (int) Num % j;
				if (mod == 0){
					Prime = false;
					break;
				}
				j++;
			} // end while
			if(Prime){
				System.out.println((int)Num);
				countPrime++;
			}
			else 
				Prime = true;		
		} // end for loop
		
		System.out.println("CountPrime = " + countPrime);
		
	} // end main

} // end class
