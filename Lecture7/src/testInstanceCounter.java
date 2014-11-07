
public class testInstanceCounter {

	public static void main(String[] args) {
		// Initializations and Declarations
		// --------------------------------
		
		InstanceCounter spy1 = new InstanceCounter(10);
		InstanceCounter spy2 = new InstanceCounter(11);
		InstanceCounter spy3 = new InstanceCounter(12);
		
		spy3.dieSpy();
	}

}
