// SCRIPT CLASS + RUNNNABLE JOB CLASS


package qu3;

import java.util.concurrent.Executor;

public class Script {
    
	// main()
	// ------
	
	public static void main(String args[]) {
	  try {
		Script script = new Script();
		script.launch();
	  } catch (InterruptedException ex) {
		System.out.println("The main thread was interrupted");
	  }
	  System.out.println("Main thread finished!");
    }
    
    // launch()
    // --------

    public void launch() throws InterruptedException {
	  SimpleExecutor executor = new SimpleExecutorImpl();  //Instantiate Excecutor
	  executor.execute(new MyTask(1, 1000));
	  executor.execute(new MyTask(2, 2000));
	  executor.execute(new MyTask(3, 3000));
	  executor.execute(new MyTask(4, 1000));
	  System.out.println("MAIN THREAD SLEEPING...");
	  Thread.sleep(10000);
	  System.out.println("MAIN THREAD AWAKE AGAIN...");
	  executor.execute(new MyTask(5, 1000));
	  executor.execute(new MyTask(6, 1000));
	  executor.execute(new MyTask(7, 1000));
	  executor.execute(new MyTask(8, 1000));
	  executor.execute(new MyTask(9, 1000));
	  executor.shutdown();
    }

    

 // NEW CLASS
 // ---------
    
    /**
     * A simple Runnable that has an ID and sleeps for a while
     */
private class MyTask implements Runnable {

	 // Fields
	 // ------
	
	  private int id;
	  private int timeToSleep;

	  
	  // Constructor
	  // -----------
	 
	  /**
	   * Creates a new task.
	   *
	   * @param id the ID of this task
	   * @param timeToSleep the amount of ms to sleep
	   */
	  public MyTask(int id, int timeToSleep) {
		this.id = id;
		this.timeToSleep = timeToSleep;
	  }

	  // run()
	  // -----
	  
	  /**
	   * Sleeps the amount of ms specified at creation time
	   */
	  public void run() {
		try {
		    System.out.println("Task " + id + " starting now.");
		    Thread.sleep(timeToSleep);
		    System.out.println("Task " + id + " finished.");
		} catch (InterruptedException ex) {
		    System.out.println("Task " + id + " was interrupted.");
		}
	  }

	  // toString()
	  // ----------
	  
	  /**
	   * Returns a string that contains this task's ID
	   */
	  public String toString() {
		return "(Task " + id + ")";
	  }
    }
}