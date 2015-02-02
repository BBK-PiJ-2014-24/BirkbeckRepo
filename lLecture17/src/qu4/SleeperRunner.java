package qu4;

public class SleeperRunner implements Runnable{

	private int sleepTime;
	private boolean wakeUp = false;
	private static String ThreadList = "";
	
	
	
	// Constructor
	// -----------
	
	public SleeperRunner(int sleepTime){
		this.sleepTime = sleepTime * 1000; // convert to miliSec
	}
	
	
	// getter
	// ------
	
	public String getThreadList(){
		return ThreadList;
	}
	
	// run()
	// -----
	public void run(){
		
		threadSleep(sleepTime);
	}
	
	// threadSleep
	// -----------
	 public void threadSleep(int sleepTime){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {}
		
		Thread t = Thread.currentThread();
		String name = t.getName();
		 
		//System.out.println(name + ": I sleep");
		try {
			Thread.sleep(sleepTime);
		} 
		catch (InterruptedException e) {}
		

		System.out.println(name + ": wake up");
		

		// ThreadList +=" " + name;
	 } 
	 
	
	 
	 
}  //end class
