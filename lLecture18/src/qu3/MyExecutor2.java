package qu3;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public class MyExecutor2 implements Executor{

	   // Fields
	   // ------
	
	   final Queue<Runnable> taskQ = new ArrayDeque<Runnable>();
	   final Executor exec;
	   Runnable active;

	   // Constructor
	   // -----------
	   
	   MyExecutor2(Executor executor) {
	     this.exec = executor;
	   } 
	   
	   // execute()
	   // ---------
	    public synchronized void execute(final Runnable r) {
	     taskQ.offer(new Runnable() {
	       public void run() {
	         try {
	           r.run();
	         } 
	         finally {
	           scheduleNext();
	         }
	       }
	     });
	     if (active == null) {
	       scheduleNext();
	     }
	   }// end execute()

	    
	   // Schedule Next
	   // ------------- 
	   protected synchronized void scheduleNext() {
	     if ((active = taskQ.poll()) != null) {
	       exec.execute(active);
	     }
	   } // end scheduleNext()
	   
} // end class
	
	

