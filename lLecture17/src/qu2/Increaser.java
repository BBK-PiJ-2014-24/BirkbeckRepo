package qu2;

public class Increaser implements Runnable { 
	// Fields
	// ------
	private Counter c;  // Counting object
	
	// Constructor
	// -----------
	public Increaser(Counter counter) {    // Counter passed to Constructor
		this.c = counter;
	}
	
	// main()
	// ------
	public static void main(String args[]) { 
		Counter counter = new Counter();  // Create a Counter Object
		
		for (int i = 0; i < 100; i++) {
			Increaser increaserTask = new Increaser(counter);   //Self Create 5 increasers
			Thread t = new Thread(increaserTask); // pass increaser's job run() to a thread
			String s = "Thread" + Integer.toString(i);
			t.setName(s);
			System.out.println(t.getName());
			t.start();
		}
		
	}
	
	// Thread run()
	// ------------
	public void run() {
		System.out.println("Starting at " + c.getCount());  // Thread Prints Starting Count
		
		for (int i = 0; i < 1000; i++) {    
			c.increase();  // increaser loops 100 times;
	    }
		System.out.println("Stopping at " + c.getCount()); // Thread Prints End Count
		}
} // end Increaser class



