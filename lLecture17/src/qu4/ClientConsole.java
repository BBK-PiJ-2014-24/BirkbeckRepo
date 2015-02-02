package qu4;

import java.util.Scanner;

public class ClientConsole{

	// Initializations/Declarations
	// ----------------------------
	
	Scanner importConsole = new Scanner(System.in);
	private int jobNum;
	private int sleepTime;

	
	// Constructor
	// -----------
	ClientConsole(int jobNum){
		this.jobNum = jobNum;
	}
	
	// gettter
	// -------	
	public int getSleepTime(){
		return sleepTime;
	}
	
	
	// askQuestion() from Console
	// --------------------------
	public synchronized void askQuestion() {
		System.out.println("Input Enter Duration of task " + jobNum +  " in mini seconds: ");
		sleepTime = importConsole.nextInt();
	}
	
}
