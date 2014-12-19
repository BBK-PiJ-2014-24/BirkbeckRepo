package personpackage;

public class KidPerson implements Person {

	private int distance;
	private String s;
	
	// Constructor
	public KidPerson(){
		distance = 1;
		s = "Ninja Turtles";
	}
			
			
	@Override
	public void move(int d) {
		distance += d/2;
		
	}

	@Override
	public void say(String message) {
		System.out.println(s);
		
	}

	
	
}
