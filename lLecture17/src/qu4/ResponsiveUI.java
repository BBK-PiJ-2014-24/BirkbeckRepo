package qu4;

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
