package qu2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class TextLoop implements Runnable { 
	
	// Fields
	// ------
	public static final int COUNT = 10;
	private final String name;
	
	
	// Constructor
	// -----------
	public TextLoop(String name) { 
		this.name = name;
	}
	
	
	// Thread run() method
	// -------------------
	@Override
	public void run() {
		for (int i = 0; i < COUNT; i++) {
			System.out.println("Loop:" + name + ", iteration:" + i + ".");
			}
	}
	

	// main()
	// ------
	public static void main(String args[]) {
		
		
		
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
			System.out.println("USAGE: java TextLoop <mode>"); 
			System.out.println(" mode 0: without threads"); 
			System.out.println(" mode 1: with threads");
		} 
		
	
		// Serial Thread
		// -------------
		
		else if (args[0].equals("0")) {
			for (int i=0; i<10; i++){ 
					Runnable r = new TextLoop("Thread.run() " + i); 
					r.run();  // Thread is NOT SPUN OFF into new Thread. Runs on Same Thread as main()
			}				  // As single thread, leads to deterministic/sequential output.
		} 
		
		// Parallel Thread
		// ---------------
		
		
		else {
			ExecutorService exec = Executors.newFixedThreadPool(2);  // Set Up Exec Service
			for (int i=0; i<10; i++){ 
				Runnable r = new TextLoop("Thread.start() " + i); 
				exec.submit(r);   // Submit
				  
			}				
		}	
	} 
}
