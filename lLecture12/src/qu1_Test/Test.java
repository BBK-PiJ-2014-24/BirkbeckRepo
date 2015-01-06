package qu1_Test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import qu1.BookDatabase;
import qu1.LibUserDatabase;
import qu1.LibUserImpl;
import qu1.LibUser;
import qu1.Library;
import qu1.LibraryImpl;
import qu1.Book;

public class Test {

	public static void main(String[] args){
		/*
		Library l = new LibraryImpl("Croydon");
		LibUser u1 = new LibUserImpl("Stewart");
		LibUser u2 = new LibUserImpl("John");
		LibUser u3 = new LibUserImpl("Newnham");
		
		u1.register(l);
		u2.register(l);
		u3.register(l);
		
		int findID = l.getID("Stewart");
		//System.out.println(findID);
		
		*/
		
		
		
		List<Book> database = new LinkedList<Book>();
		Book b = new Book("The Power of Now", "Tolle");
		database.add(b);
		
		//BookDatabase bd = new BookDatabase();
		//bd.addBook("The Power of Now", "Tolle");
		
		
		
	}
	
}
