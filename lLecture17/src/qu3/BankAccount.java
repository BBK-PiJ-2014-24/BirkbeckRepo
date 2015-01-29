package qu3;

public class BankAccount { 
	
	private int balance = 0; 
	
	
	public int getBalance() {
		synchronized(this){
			//try {
				//System.out.println(Thread.currentThread().getName() + " Checking Balance....");
				//wait();
			//} catch (InterruptedException e) {
			//	System.out.println("Wait Problem");
			}
			return balance;
		//} // end sync
	}
	
	
	public  void deposit(int money) { 
		synchronized(this){
			balance = balance + money;
		}
	}
	
	
	public int retrieve(int money) {
		synchronized(this){
			int result = 0;
			
			if (balance > money) {
				result = money;
			} 
			else {
				 result = 0;  // No Funds Withdrawn
			}
			
			balance = balance - result;
			// notifyAll();
			return result;
		}
	}
	
	
}
