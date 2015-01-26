package basicThreadTests;

// The class that holds the job for the thread

public class LostUpdateProblem implements Runnable{

	
	private int balance;
	
	
	// The run method specifies the job.
	@Override
	public void run() {  
		for(int i=0; i<50; i++){
			increment();
			System.out.println("balance is = " + balance);
		}
	}
	
	
	// if increment was not synchronized then the thread count would be screwed up.
	// thread A may not finish increment() before thread B runs, which messes up the 
	// count
	
	public synchronized void increment(){
		int i = balance;
		balance = 1 + i;
	}

}
