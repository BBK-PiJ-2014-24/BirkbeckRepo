package qu4;

import qu4.Payload;

// Using a Generic Functional Interface

public class MyClass {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Java";
		
		String ans = Payload.betterEntry(str1, str2, (String s1,String s2)-> s1.length()>s2.length());
		System.out.println(ans);
		
		
		
		int x = 5;
		int y = 6;
		
		int ansNum = Payload.betterEntry(x, y, (n1, n2) -> n1>n2);
		System.out.println(ansNum);
	
	}

}
