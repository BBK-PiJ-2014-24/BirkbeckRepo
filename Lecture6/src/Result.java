/*
 *  * 6 Anti-aircraft aim (*)
Create an enumerated type Result in its own file. The enum must have 8 possible values: 
HIT, FAIL LEFT, FAIL RIGHT, FAIL HIGH, FAIL LOW, FAIL SHORT, FAIL LONG, OUT OF RANGE. 
Hint: the enum must be public.
 */
public enum Result {

	
	// ENUM List
	// ---------
	
	HIT(" Plane is Hit & Destroyed"), 
	
	FAIL_LEFT("The Target is to the Left"), 
	FAIL_RIGHT("The Target is to the Right"), 
	
	FAIL_HIGH("You're Shooting Too High"), 
	FAIL_LOW("You're Shooting Too Low"), 
	
	FAIL_SHORT("You Are too Short") , 
	FAIL_LONG("You Are too Long"), 
	
	OUT_OF_RANGE("You Are Out of Range");
	
	// Fields
	// ------
	private final String d;
	
	// Constructor
	// -----------
	
	Result(String desc){
		d = desc;		
	}
	
	// Getter
	// ------
	
	public String getFeedback(){
		return d;
	}

}
