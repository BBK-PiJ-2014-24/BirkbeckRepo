package qu1_4;

public class OldPhoneImpl implements OldPhone {

	@Override
	public void call(String number) {
		System.out.println("Calling: " + number);
	}

} // end class
