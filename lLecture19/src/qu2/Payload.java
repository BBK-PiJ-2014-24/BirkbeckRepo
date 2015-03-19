package qu2;

import java.util.Arrays;

/*
 * In this Question, the payload is a comparator method. 
 * N.b. NO LEs are explicitly used in this particular payload when we are using a method reference
 */
public class Payload {
	
	public static int bombMethod(String s1, String s2){  
			if(s1.contains("e")==false && s2.contains("e")==true)
				return 1;
			if(s1.contains("e")==true && s2.contains("e")==true)
				return 0;
			return -1;
	}
}
