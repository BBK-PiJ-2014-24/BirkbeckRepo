package qu3;

public class BankAccount { 
	
	private volatile int balance = 0;   // !!!!! BreakThrough: MUST Make Field Variable "volatile"
										// !!!!! It Guarantees The CORRECT Variable Visibility.
										// At the same time, The Methods MUST BE SYNCHRONIZED!!
	
	public int getBalance() {
		synchronized(this){	
			System.out.println(Thread.currentThread().getName() + " Checking Balance....");	
			return balance; 
		}  // end sync
	} // end method
	
	
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
			notifyAll();
			return result;
		}  // end sync
	} // end method
	
	
}
