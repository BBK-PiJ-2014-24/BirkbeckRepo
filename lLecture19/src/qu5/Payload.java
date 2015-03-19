package qu5;

// USING A PRE-DEFINED FUNCTIONAL INTERFACE

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;  // Predicate is a pre-defined Functional Interface

public class Payload{
	public static  List<String> allMatches(List<String> strList, Predicate<String> ir){
		
		List<String> ansList = new ArrayList<String>();
		for(String s : strList){
			if(ir.test(s)== true)
				ansList.add(s);
		}
		return ansList;
	}
	
}
