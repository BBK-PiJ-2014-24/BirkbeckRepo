package qu_7;

// THIS IS THE BASE OF THE HIERARCHY. IT THROWS UP TO HANDWASHER!

public class WashingMachine extends HandWasher{

	public WashingMachine(){
		System.out.println("I am the WashingMachine");;
	}
	
	
	public void doLaundry(Clothes c) throws TShirtException{
		String ClotheItem = c.getClotheType();
		if(ClotheItem.equals("Suit")){
			throw new TShirtException();
		}
		else{
			System.out.println("Washing " + ClotheItem);
		}
	}
}
