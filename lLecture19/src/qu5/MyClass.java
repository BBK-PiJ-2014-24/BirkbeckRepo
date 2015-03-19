package qu5;

import java.util.ArrayList;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {
		
		List strArray = new ArrayList<String>();
		strArray.add("The ");
		strArray.add("World ");
		strArray.add("is ");
		strArray.add("Flat ");
		strArray.add("in ");
		strArray.add("the ");
		strArray.add("Java");
		strArray.add("Universe");
		
		List<String> shortWords = Payload.allMatches(strArray, s-> s.length() < 4);
		System.out.println(shortWords.toString());
		
		List<String> wordsWithV = Payload.allMatches(strArray, s-> s.contains("v"));
		System.out.println(wordsWithV.toString());
		
		List<String> evenLengthWords = Payload.allMatches(strArray, s-> (s.length() %2) == 0);
		System.out.println(evenLengthWords.toString());

	}

}
