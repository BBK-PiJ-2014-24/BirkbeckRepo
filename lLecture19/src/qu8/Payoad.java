package qu8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Payoad {  // No Need to Use A Generic class declaration as we Have NO GENERIC FIELDS
	
	// Note that the Generic Declaration for the Method has <T,R>
	public static <T,R> List<R> transformedList(List<T> genList, Function<T,R> ir){	
		List<R> ansList = new ArrayList<R>(); 
		for(T t : genList){
			 ansList.add(ir.apply(t));
		}
		return ansList;
	}
	
}
