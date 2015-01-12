package binarySearch;

import java.util.ArrayList;
import java.util.List;

public class testArray {

	public static void main(String[] args) {
		
		
		List<Integer> listM = new ArrayList<Integer>(100);
		for(int i=0; i<100; i++) {
			listM.add(i);
		}
		
		System.out.println(listM.toString());
		System.out.println();
		
		//int m = 10;
		//list.subList(0, m).clear();   // Odd Method to reduce list range
		int x = 102;
		//List<Integer> subL = list.subList(25, 75);
		//System.out.println(subL.toString());
		boolean ans = BinarySearch.find(x, listM);
		System.out.println(ans);
		System.out.println(listM.toString());
		
		
	}

}
