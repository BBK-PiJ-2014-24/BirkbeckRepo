package qu_7;

// THIS CLASS CATCHES AND THEN IMMEDIATELY THOWS UP THE STACK TO WASHER
public class HandWasher extends Washer{

	public HandWasher(){
		System.out.println("I am the HandWasher");
	}
	
	public void putInWashingMachine(Clothes c) throws TShirtException{
		WashingMachine wm = new WashingMachine();
		wm.doLaundry(c);
	}
	
	
}
