package qu3;

public class BankCustomer implements Runnable{
	
	private static BankAccount ba = new BankAccount();  // Instantiate A Single BankAccount
	
	
	public static void main(String[] args){	
		ba.deposit(100); // Add $100 to account
		
		BankCustomer thisMainObj = new BankCustomer(); // Self Instantiate this Class, which is 
													   // a MAIN() as well as a Runnanble
		Thread John = new Thread(thisMainObj); // Add this obj to the Thread Objects
		John.setName("John");
		Thread Jane = new Thread(thisMainObj);
		Jane.setName("Jane");
		
		John.start();
		Jane.start();
	}
	
	public void run(){
		
		for(int i=0; i < 10; i++){
			int bal = ba.getBalance();
			System.out.println(Thread.currentThread().getName() + ": Balance is: $" + bal );
			int cashOut = ba.retrieve(10);
			
			if(cashOut>0)
				System.out.println(Thread.currentThread().getName() + ": Cash Withdrawn: $" + cashOut + ". Cash Remaining: " + ba.getBalance());
			else
				System.out.println(Thread.currentThread().getName() + ": Not Enough Funds!" + ". Cash Remaining: " + ba.getBalance());
		}
	}
	
	


}
