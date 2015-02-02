package qu5;

import java.util.Random;

/**
 * A class that performs a costly computation
 */
public class Computation implements Runnable {
    
	// Fields
	// ------
	/**
     * The result of the computation.
     */
    private double result = 0;
    /**
     * True when the computation result is ready, false otherwise.
     */
    private boolean resultReady = false;
    /**
     * The number to perform the computation with
     */
    private double[] numbers = null;
    
    
    // Constructor
    // -----------
    /**
     * A new computation.
     *
     * @param data an array of doubles to perform the computation
     */
    public Computation(double[] data) {
          this.numbers = data;
    }
    
    // Thread run()
    // ------------
    /**
     * Runs the computation.
     */
    public void run() {
          synchronized (this) {
        	  double result = 0.0;
				// A new Random is created here because Math.random() is
				// synchronized, which leads to no improvement being seen
				Random r = new Random(-1);
				for (int i = 0; i < numbers.length; i++) {
				    result += Math.sqrt(numbers[i]);
				    result += Math.sqrt(r.nextDouble() * result);
				    result += Math.sqrt(r.nextDouble() * result);
				    result += Math.sqrt(r.nextDouble() * result);
				}
				this.result = result;  // Note this trick of how to get a return value to a
				this.resultReady = true; // Field from within a void run() function.
				notifyAll();			// HAVE A NOTIFY IN THE RUN AFTER THE RUN IS DONE.
          }
    }
    
    
/**
 * Returns the result of the computation if it is ready.
 * If it is not, it blocks until it is.
 *
 * @return the result of the computation.
 */
	public synchronized double getResult() {     //When this function is called and resultReady flag
	    while (!resultReady) {                  // not raised, then it will wait on this object
			try { 								// before returning the answer.
				wait();
			 } catch (InterruptedException ex) {
				// Nothing to do, just sleep less
			}
	    }
		resultReady = false;
		return result;
	}
	

}
