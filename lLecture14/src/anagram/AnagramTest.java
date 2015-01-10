package anagram;

import java.util.List;

public class AnagramTest {

	public static void main(String[] args) {
		
		Anagram a = new Anagram();
		List<String> l = a.calcAnagram("1234");
		
		System.out.println(l.toString());

	}

}
