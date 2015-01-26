package basicThreadTests;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		doMore();
	}

//	public void go(){
//		doMore();
//	}
	
	public void doMore(){
		System.out.println("This is The Top of the Thread Job Stack");
	}
	
}
