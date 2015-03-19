package qu7;

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
		
		List<String> excitingWords = Payload.transformedList(strArray, s-> s + "!!");
		System.out.println(excitingWords.toString());
		
		List<String> eyeWords = Payload.transformedList(strArray, s-> s.replace("i", "-EYE-"));
		System.out.println(eyeWords.toString());
		
		List<String> upperCaseWords = Payload.transformedList(strArray, String::toUpperCase);
		System.out.println(upperCaseWords.toString());		
	}
}
