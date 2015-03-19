package qu7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Payload {
	public static List<String> transformedList(List<String> strList, Function<String,String> ir){
		
		
		List<String> ansList = new ArrayList<String>(); 
		for(String s : strList){
			 ansList.add(ir.apply(s));
		}
		return ansList;
		
	}
}
