/// Qu. 17) Outputs Prime Number Closest to Input Number. If two primes with same distance,
// Print Both.

import java.util.Scanner;

public class Primes1c {
	
// Prints first 1000 Primes
	
	
	public static void main(String[] args) {
		
		// Initializations and Declarations
		// --------------------------------
		int max = 1000;
		double Num = 2; // Candidate Number (double for sqrt()) 
		int sqNum = 0; 
		int countPrime=1;
		boolean Prime = true;
		boolean aboveNum = false;
		int inputNum = 0; 
		int prevPrime = 2;
		int currentPrime = 0;
		int closePrime;
		int upDiff = 0;
		int lowDiff = 0;
		int Diff = 0;
		
		Scanner importConsole = new Scanner(System.in);
	
		
		// Console Input
		// -------------
		
		System.out.println("Input Number: ");
		inputNum = importConsole.nextInt();
		
		
		// Calc Primes
		// -----------
		
		while(!aboveNum){
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
				prevPrime = currentPrime;
				currentPrime = (int) Num;
				countPrime++;
			}
			else 
				Prime = true;
			
			if(currentPrime > inputNum)
				aboveNum = true;
		} // end outside while loop
		
		// Calculate Closest Prime
		// -----------------------
		
		upDiff = currentPrime - inputNum;
		lowDiff = inputNum - prevPrime;
		
		if(upDiff <= lowDiff){
			closePrime = currentPrime;
			Diff = upDiff;
			}
		else{ 
			closePrime = prevPrime;
			Diff = lowDiff;
			}
		
		// Output
		// ------
		System.out.println();
		System.out.println("CountPrime = " + countPrime);
		System.out.println();
		System.out.println("Lower Prime: " + prevPrime);
		System.out.println("Your Number: " + inputNum);
		System.out.println("Upper Prime: " + currentPrime);
		System.out.println();
		if (upDiff == lowDiff){
			System.out.println("Closest Primes: " + prevPrime + " and " + currentPrime);
			System.out.println("Divergence: " + Diff);
		}
		else{	
			System.out.println("Closest Prime: " + closePrime);
			System.out.println("Divergence: " + Diff);
		}
		
		
		importConsole.close();
	} // end main

} // end class

