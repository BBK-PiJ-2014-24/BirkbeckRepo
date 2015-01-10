package anagram;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
	
	// Field
	public List<String> anagramArray = null;

	// Recursion Method I
	public List<String> calcAnagram(String word){
		if(anagramArray == null){
			setUpArray(word);
		}
		return calcAnagram(word, "");	
	}
	
	// Recursion Method II
	public List<String> calcAnagram(String word, String chopLetters){
 
		if(word.length()>2){
			//chopLetters = chopLetters + word.charAt(0);
			//word = word.substring(1);
			for(char i : word.toCharArray()){
				char char0 = word.charAt(0);
				word = word.substring(1) + char0;
				chopLetters = chopLetters + word.charAt(0);
				calcAnagram(word.substring(1), chopLetters);
				chopLetters = chopLetters.substring(1);
			}	
		}
		
		else if(word.length()>1){	
			char c0 = word.charAt(0);
			char c1 = word.charAt(1);
			word = chopLetters + word;
			String word2 = chopLetters + c1 + c0;
			anagramArray.add(word);
			anagramArray.add(word2);
		}
		
		else{
			anagramArray.add(word);
		}
			
		
	 return anagramArray;
		
		
	}
	
	public List<String> setUpArray(String word){
		
		int strLength = word.length()*100; 
		anagramArray = new ArrayList<String>(strLength);
		
		return anagramArray;
	}
	
}
