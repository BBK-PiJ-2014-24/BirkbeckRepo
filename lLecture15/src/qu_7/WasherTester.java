package qu_7;

// This Exception is Thrown All The Way Up to Main

public class WasherTester {

	public static void main(String[] args) {
		WasherTester w = new WasherTester();
		try {
			w.launch();
		} catch (TShirtException e) {
			System.out.println("This Exception is Thrown All The Way Up to Main");
			e.printStackTrace();
		}
	}
	
	public void launch() throws TShirtException{
		Washer w = new Washer();
		Clothes c = new Clothes("Suit");
		
		w.doWash(c);
	}

}
