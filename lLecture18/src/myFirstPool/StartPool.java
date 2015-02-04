package myFirstPool;


import java.util.concurrent.ExecutorService;   // An Interface
import java.util.concurrent.Executors;         // An Implementation of the Interface

public class StartPool {

	public static void main(String[] args) {
		StartPool pool = new StartPool();
		pool.launch();
	}
	
	public void launch(){
		
		ExecutorService exec = Executors.newFixedThreadPool(2);       // Instant ExecutorService
		
		for(int i=0;i<5;i++){
			
			Runnable Toji = new TaskToDo(i);  				// Instant Runnable
			exec.submit(Toji);								// submit on a runnable
			//exec.submit(new TaskToDo(i));					// Done in One Step
		}
		
		
	}

}
