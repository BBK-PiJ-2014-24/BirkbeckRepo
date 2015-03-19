package qu4;

public class Payload<T>{

	public static <T> T betterEntry(T t1, T t2, TwoElementPredicate<T> ir){
		if(ir.func(t1, t2) == true)
			return t1;
		else
			return t2;
	}	
}

