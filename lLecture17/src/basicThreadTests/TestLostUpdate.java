package basicThreadTests;

public class TestLostUpdate {

	public static void main(String[] args) {
	
		Runnable theRunJob = new LostUpdateProblem();  // Instantiate the Runnable Class wit the Job.
		
		Thread a = new Thread(theRunJob);
		Thread b = new Thread(theRunJob);
		
		a.start();
		b.start();
		
		

	}

}
