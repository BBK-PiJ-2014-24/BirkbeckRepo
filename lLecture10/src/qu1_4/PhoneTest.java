package qu1_4;

public class PhoneTest {

	public static void main(String[] args) {
		
		System.out.println("OldPhone Test");
		OldPhone o = new OldPhoneImpl();
		o.call("111-1111");
		
		System.out.println("\nMobilePhone Test");
		MobilePhone m = new MobilePhone();
		m.call("111-1111");
		m.ringAlarm();
		m.playGame("space invaders");

	}

}
