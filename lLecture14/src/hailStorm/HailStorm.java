package hailStorm;

import java.util.ArrayList;
import java.util.List;

public class HailStorm {
	
	// Field
	// -----
	
	private List<Integer> hailList = null; 
	
	// Methods
	// -------
	public List<Integer> hailStormCalc(int x){
		
		if(hailList == null){
			instantHailList();
			hailList.add(x);
		}
			
		if(x==1){
			return hailList;
		}
		else{
			if(x%2 == 0)  // is Even
				x=x/2;
			else
				x = 3*x + 1;
			hailList.add(x);
			return hailStormCalc(x);
		}	
	}
	
	public void instantHailList(){
		hailList = new ArrayList<Integer>(1000);
	}

}
