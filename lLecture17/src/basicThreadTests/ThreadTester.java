/*
 * THE THREAD SCHEDULER IS RANDOM AND SO IT MAY SOMETIMES COMPLETE THE myThread BEFORE THE main() THREAD. 
 * THIS PROGRAM SHOWS THIS.S
 */

package basicThreadTests;

public class ThreadTester {

	public static void main(String[] args) {
		
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);
		
		myThread.start();
		
		System.out.println("Back in Main");

	}

}
