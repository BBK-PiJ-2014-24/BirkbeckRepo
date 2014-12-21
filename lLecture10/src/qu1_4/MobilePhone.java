package qu1_4;

public class MobilePhone extends OldPhoneImpl{

	public MobilePhone(String brand){
		super(brand);
	}
	
	
	public void ringAlarm(){
		System.out.println("Beep! Beep! Beep!");
	}
	
	
	public void playGame(String game){
		System.out.println("playing Game: " + game);
	}
}
