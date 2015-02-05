package myFirstPool;

import java.util.concurrent.Callable;

public class CallToDo implements Callable{

	public Double call(){     // RETURN VARIABLE MUST BE OBJECT +> Autoboxing. 
		
		double r = Math.random() *1000;
		
		System.out.println("I Sleep");
		
		try {
			Thread.sleep((long)r);
		} catch (InterruptedException e) {};
		
		System.out.println("I Awake");
		
		return r;
	}
	
}
