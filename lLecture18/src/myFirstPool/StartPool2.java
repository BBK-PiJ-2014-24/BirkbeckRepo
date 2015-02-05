package myFirstPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StartPool2 {

	public static void main(String[] args) throws Exception {
		
		StartPool2 pool = new StartPool2();
		pool.launch();

	}

	public void launch() throws Exception{
		
		ExecutorService exec = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Callable myCall = new CallToDo(i);
			Future fut = exec.submit(myCall);   	// Set UP a FUTURE reference variable	
			System.out.println("future.get() = " + fut.get());	// To EXTRACT value from Return Object 
		}											// Must use .get()
	}  //end launch()
	
} // end class
