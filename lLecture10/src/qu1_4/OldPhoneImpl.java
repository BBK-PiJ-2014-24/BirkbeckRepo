package qu1_4;

public class OldPhoneImpl implements OldPhone {

	private String brand;
	
	public OldPhoneImpl(String brand) {
		this.brand = brand; 
	}	
	
	public void getBrand() { 
		// return brand;
		System.out.println("Phone Brand: " + brand);
	}
		
	
	@Override
	public void call(String number) {
		System.out.println("Calling: " + number);
	}

} // end class
