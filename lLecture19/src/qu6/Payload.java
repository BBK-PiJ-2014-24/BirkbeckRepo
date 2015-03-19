package qu6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;  // Predicate is a pre-defined Functional Interface


public class Payload<T> {
	public static <T>  List<T> allMatches(List<T> genList, Predicate<T> ir){
		
		List<T> ansList = new ArrayList<T>();
		
		for(T t : genList){
			if(ir.test(t) == true)
				ansList.add(t);
		}
		return ansList;
	}
}
