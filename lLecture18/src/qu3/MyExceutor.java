package qu3;

import java.util.concurrent.Executor;

public class MyExceutor implements Executor{

	// Fields
	// ------
	private  Thread t;
	
	
	@Override
	public void execute(Runnable r) {
		t = new Thread(r);
		t.start();
	}

}
