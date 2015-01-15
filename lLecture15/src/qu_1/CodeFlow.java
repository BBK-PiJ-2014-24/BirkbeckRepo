package qu_1;

import java.util.ArrayList;
import java.util.List;


public class CodeFlow {
	
	
	public static void main(String[]  args){
		CodeFlow c = new CodeFlow();
		
		int x = 6;  
		// x = 0 faults on line 44 - intArrary is null;
		// x = 2 faults on line 39 - intArrary[2] creates index overflow;
		// x = 4 faults on line 36 - intArrary[4] creates index overflow;
		// x = 6 faults on line 35 - intArrary[6] creates index overflow;
		
		c.launch(x);
		
	}
	
	
	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		
		try {
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
		 } 
		catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		 }
	}
}



