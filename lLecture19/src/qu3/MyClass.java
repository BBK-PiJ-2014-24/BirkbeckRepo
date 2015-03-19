package qu3;

public class MyClass {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Java";
		
		String ans = Payload.betterString((s1,s2)-> s1.length()>s2.length(), str1, str2);
		System.out.println(ans);
		
		
		ans = Payload.betterString((s1,s2)-> true, str1, str2);
		System.out.println(ans);

	}

}
