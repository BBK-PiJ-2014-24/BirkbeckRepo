package personpackage;

public class AdultPerson implements Person{
	
	private int position;
	private String s = "Cognitas, ergo sum";

	// Constructor
	// -----------
	public AdultPerson(){
		position = 5;
	}
	
	/**
	 * Interface Methods That Must Be IMPLEMENTED
	 */
	public void move(int distance) {
		position += distance;
		}
	
	
	public void say(String s){
		System.out.println(s);
	}

}
