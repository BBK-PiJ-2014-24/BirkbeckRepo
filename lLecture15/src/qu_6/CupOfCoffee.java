package qu_6;

/* This class has a method that has a method that THROWS a CHECKED EXCEPTION and a RUNTIME EXCEPTION. 
 * 
 */

public class CupOfCoffee {
	
	// Fields
	// ------
	private int temp;
	
	// Method with Checked
	// -------------------
	public void makeCoffee(int temp) throws TempException{
		if(temp < 60){
			throw new TempException("This Coffee is cold!");
		}			
	}
	
	
	// Method with Unchecked/Runtime Exception
	// ---------------------------------------
	public void addSugar(int lumps, boolean sweetTooth){
		if(sweetTooth)
			System.out.println("\nNice Sweet Cup of Joe!");
		else{
			throw new SugarException("\nAh, I hate sugar in my coffee");
		}
	}
	

}
