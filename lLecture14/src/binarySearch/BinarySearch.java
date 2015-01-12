package binarySearch;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
	
	public static boolean find(int x, List<Integer> list){
		int midIndex = list.size()/2;
		int midNumber = list.get(midIndex);
		
		int minNumber = list.get(0);
		int maxNumber = list.get(list.size()-1);
		
		if( x < minNumber || x > maxNumber ){
			return false;
		}
		else if(list.size() == 0){
			return false;
		} 
		else if(x==midNumber) {
			return true;
		} 
		else if (x<midNumber) {		
			List<Integer> subList = list.subList(0,midIndex);
			return find(x, subList);
		} 
		else {		
			List<Integer> subList = list.subList(midIndex, list.size()); 
			return find(x, subList);
		}
	}

}
