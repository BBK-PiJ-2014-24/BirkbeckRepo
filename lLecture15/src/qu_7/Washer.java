package qu_7;

public class Washer {

	
	public Washer(){
		System.out.println("I am the Washer");
	}
	
	public void doWash(Clothes c) throws TShirtException{
		HandWasher hw = new HandWasher();
		hw.putInWashingMachine(c);
	}
	

	
}
