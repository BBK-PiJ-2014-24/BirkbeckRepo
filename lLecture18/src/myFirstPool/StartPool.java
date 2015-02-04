package myFirstPool;


import java.util.concurrent.ExecutorService;   // An Interface
import java.util.concurrent.Executors;         // An Implementation of the Interface
import java.util.concurrent.Future;

public class StartPool {

	public static void main(String[] args) {
		StartPool pool = new StartPool();
		pool.launch();
	}
	
	
	
	
	public void launch(){
		
		ExecutorService exec = Executors.newFixedThreadPool(2);       // Instant ExecutorService
		
		for(int i=0;i<5;i++){
			
			Runnable Toji = new TaskToDo(i);  				// Instant Runnable
			// exec.submit(Toji);							// Simple submit()
			//exec.submit(new TaskToDo(i));					// Runnable() + Submit() Done in One Step
			
			Future fut = exec.submit(Toji);					// Return a Future on a submit
			System.out.println("Is Thread " + i + " done? " + fut.isDone()); // Simple use of a sumbit()
		}
		exec.shutdown();
	}

}
