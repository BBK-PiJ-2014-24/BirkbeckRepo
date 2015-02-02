package qu4;

/**
 * Final design which includes a main(); then a separate Scanner Console Class, which is RUN on the 
 * Same Thread as main(); and a separate Thread class that calculates the sleep time.
 */

public class ResponsiveUI {

	
	public static void main(String[] args){
		
		ResponsiveUI rui = new ResponsiveUI();
		rui.launch();
			
	} // end main()
	
	
	
	public void launch(){
		
	
		
		for(int i=0; i<10;i++){
			ClientConsole consoleJob = new ClientConsole(i);  //Instant ConsoleJob 
			consoleJob.askQuestion(); // Ask Question.
			int sleepTime = consoleJob.getSleepTime();    // get SleepTime from Console Input
			
			Runnable sleepRun = new SleeperRunner(sleepTime); // Instant Sleep Runner
			Thread t1 = new Thread(sleepRun);   // Instant SleepRunner in Thread
			t1.start();
			
			
		}
		
		
 		

		
			

	
	} // end launch()  
	
	
	
	
} // end class
