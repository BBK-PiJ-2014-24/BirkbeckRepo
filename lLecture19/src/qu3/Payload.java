package qu3;

public class Payload {

	
	// As we are NOT Using a Meth Ref, we will have to drop a LE into this Payload Argument
	public static String betterString(TwoStringPredicate ir, String s1, String s2){
		if(ir.func(s1, s2) == true)
			return s1;
		else
			return s2;
	}
 }
