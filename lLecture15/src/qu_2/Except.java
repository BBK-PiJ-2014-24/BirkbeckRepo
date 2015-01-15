package qu_2;

import java.util.ArrayList;
import java.util.List;

public class Except {

	public static void main(String[] args) {
		
		Except e = new Except();
		
		e.launch();

	}
	
	
	public void launch(){
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(101);
		list.add(102);
		list.add(103);
		
		try {
		// EXCEPTIONS MUST COME CORRECT ORDER. CHILD EXCEPTIONS BEFORE PARENT EXCEPTIONS
		} 
		
		catch (NullPointerException ex) { 
			ex.printStackTrace();
		}
		
		catch (Exception ex) { 
			ex.printStackTrace();
		} 

		
	}

}
