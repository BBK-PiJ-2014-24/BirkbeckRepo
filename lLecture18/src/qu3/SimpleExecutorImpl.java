package qu3;

import java.util.concurrent.Executor;

/**
 * An implementation of {@see SimpleExecutor}.
 */
public class SimpleExecutorImpl implements SimpleExecutor {
    
	// Fields
	// ------
	private TaskManager manager;

	
	// Constructor
	// -----------
    /** 
     * Creates a new executor.
     */
    public SimpleExecutorImpl() {
	  this.manager = new TaskManager();
	  Thread t = new Thread(manager);
	  t.start();
    }

    // execute()
    // ---------
    @Override
    public void execute(Runnable task) {
	  this.manager.add(task);
    }

    
    // ShutDown()
    // ----------
    @Override
    public void shutdown() {
	  this.manager.shutdown();
    }
}