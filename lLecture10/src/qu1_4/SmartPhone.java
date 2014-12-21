package qu1_4;

public class SmartPhone extends MobilePhone {
	
	public SmartPhone(String brand){
		super(brand);
	}
	
	
	
	@Override
	public void call(String number){
		String start = number.substring(0,2);
		if(start.equals("00"))
			System.out.println("Calling " + number + " through the internet to save money");
		else
			super.call(number);
	}
	
	
	public void browseWeb(String website){
		System.out.println("Surfing Web to Find: " + website);
	}
	
	public void findPoistion(){
		int x = (int )(Math.random() * 1000000);
		System.out.println("GPS: " + x);
	}
	
}
