package qu1_4;

public class PhoneTest {

	public static void main(String[] args) {
		PhoneTest p = new PhoneTest();
		p.launch();
	}

	public void launch(){
		System.out.println("OldPhone Test");
		OldPhone o = new OldPhoneImpl("Nokia");
		o.call("111-1111");
		
		System.out.println("\nMobilePhone Test");
		MobilePhone m = new MobilePhone("Motorola");
		m.call("111-1111");
		m.ringAlarm();
		m.playGame("space invaders");
		
		System.out.println("\nSmartPhone Test");
		SmartPhone s = new SmartPhone("iPhone");
		s.getBrand();
		s.browseWeb("Amazon.com");
		s.findPoistion();
		s.call("222-2222");
		s.call("00-333-3333");
		}
	
}
