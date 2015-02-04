package myFirstPool;

public class TaskToDo implements Runnable{

	private int taskID;
	
	
	public TaskToDo(int id){
		taskID = id;
	}
	
	@Override
	public void run(){
		
		System.out.println("Task" + taskID + " is starting");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		System.out.println("Task" + taskID + " has ended");
	}
	
	
}
