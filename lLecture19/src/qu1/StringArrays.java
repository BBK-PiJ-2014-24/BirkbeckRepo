package qu1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;  // NOW A FUNCTIONAL INTERFACE

public class StringArrays {

	public static void main(String[] args) {
		
		String[] strArray = new String[8];
		strArray[0] = "The ";
		strArray[1] = "World ";
		strArray[2] = "is ";
		strArray[3] = "Flat ";
		strArray[4] = "in ";
		strArray[5] = "the ";
		strArray[6] = "Java";
		strArray[7] = "Universe";
		
	
		// Lambda Block Ordering array short to Long
		Arrays.sort(strArray, (String s1, String s2) -> {
			if(s1.length() > s2.length())
				return 1;
			if(s1.length() == s2.length())
				return 0;
			return -1;
		});
		
		System.out.println(Arrays.asList(strArray));
		
		
		// Lambda Block Ordering Array long to short
		Arrays.sort(strArray, (String s1, String s2) -> {
			if(s1.length() > s2.length())
				return -1;
			if(s1.length() == s2.length())
				return 0;
			return 1;
		});
		
		System.out.println(Arrays.asList(strArray));
		
		
		// Lambda Block Ordering Array by First Character
		Arrays.sort(strArray, (String s1, String s2) -> {

			if(s1.toLowerCase().charAt(0) > s2.toLowerCase().charAt(0))
				return 1;
			if(s1.toLowerCase().charAt(0) == s2.toLowerCase().charAt(0))
				return 0;
			return -1;
		});
		
		System.out.println(Arrays.asList(strArray));
		
		//Lambda Block Ordering Array all words with e first
		Arrays.sort(strArray, (String s1, String s2) -> {
			if(s1.contains("e")==false && s2.contains("e")==true)
				return 1;
			if(s1.contains("e")==true && s2.contains("e")==true)
				return 0;
			return -1;
		});
		
		System.out.println(Arrays.asList(strArray));
	}

}
