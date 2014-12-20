package qu1_4;

public class SmartPhone extends MobilePhone {
	
	public void browseWeb(String website){
		System.out.println("Surfing Web to Find: " + website);
	}
	
	public void findPoistion(){
		int x = (int )(Math.random() * 1000000);
		System.out.println("GPS: " + x);
	}
	
}
