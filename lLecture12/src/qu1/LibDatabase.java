package qu1;

import java.util.HashMap;

public class LibDatabase {
	
	HashMap<Integer,String> m  = new HashMap<Integer,String>();
	
	public static int generateID(){
		int x = 0;
		int min = 100000;
		while(x<min){
			x = (int) (Math.random()*1000000);
		}
		return x;
	}
	

}
