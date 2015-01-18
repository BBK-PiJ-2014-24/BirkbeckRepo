package qu_6;
/*
 * 
 * As this class extends EXCEPTION (AND NOT RUNTIME EXCEPTION), it is a "CHECKED EXCEPTION"
 *
 */
public class TempException extends Exception {

	// Fields
	// ------
	
	private int temp;
	
	// Constructors
	// ------------
	public TempException(){
		
	}
	
	public TempException(String msg){
		super(msg);
	}
	
	public TempException(int temp){
		this.temp = temp;
	}
	
	// getter
	// ------
	public int getTemp(){
		return temp;
	}
	
	
}
