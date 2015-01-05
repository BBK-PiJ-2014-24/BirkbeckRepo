package qu1_Test;

import qu1.LibUserDatabase;
import qu1.LibUserImpl;
import qu1.LibUser;
import qu1.Library;
import qu1.LibraryImpl;

public class Test {

	public static void main(String[] args){
		Library l = new LibraryImpl("Croydon");
		LibUser u1 = new LibUserImpl("Stewart");
		LibUser u2 = new LibUserImpl("John");
		LibUser u3 = new LibUserImpl("Newnham");
		
		u1.register(l);
		u2.register(l);
		u3.register(l);
		
		int findID = l.getID("Stewart");
		System.out.println(findID);
	}
	
}
