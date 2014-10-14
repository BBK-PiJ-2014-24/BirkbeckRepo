
// Qu. 18) This Calc Pi with an infinite sum. The Question Asks How Many Iterations in the Sum To Get The 
// Pi to answer to 3.14159265358. The Secret to the Solution is that the series is an oscilating series around Pi,
// so divergences from pi fluctuate +/-/+/-etc. In order for the series to stabilize around estimate 3.14.
// The Divergences from estimate Must No Longer Fluctuate +/-/+ etc. So just loop until consecutive 
// differences are consecutively positive.

public class Pi1b {

	public static void main(String[] args) {
		
		
		// Initializations and Declarations
		double pi = 0;
		int terms = 800;
		double piProx = 3.14159265358;
		double piDiff = 0;
		double currentDiff = 0;
		double prevDiff = 0;
		boolean stablePi = false;
		int k=0;		
		
		// Pi Estimation
		// -------------
		
		while(!stablePi){
			
			pi = pi + 4*(Math.pow(-1,k))/(2*k+1);
			prevDiff = currentDiff;
			currentDiff = pi - piProx; 
			System.out.println(k + " pi = " + pi + " currentDiff: " + currentDiff + " prevDiff: " +prevDiff);
			k++;
			if (prevDiff>0 && currentDiff>0){
				stablePi = true;
			}
			
		}// end for loop
		
		
				

	}

}
