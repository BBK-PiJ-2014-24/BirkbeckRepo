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
		
		Library l = new LibraryImpl("Croydon");
		LibUser u = new LibUserImpl("Stew");
		u.register(l);
		l.setMaxBookPerUser(3);
	
		l.addBook("The Power of Now", "Tolle");
		l.addBook("Antifragile", "Taleb");
		l.addBook("GoldFinger", "Ian Fleming");
		l.addBook("MoonRaker", "Ian Fleming");	
		
		u.borrowBook("The Power of Now");  // user borrows two books
		u.borrowBook("Antifragile");
		u.returnBook("The Power of Now");
		u.returnBook("MoonRaker");
		u.returnBook("Gone With the Wind");
		
		
		
		
		
	/*	
		Book bz = l.takeBook("The Power of Now");
		x = l.getBorrowedBookCount();
		
		
	//  BookDatabase bd = new BookDatabase();
	//	bd.addBook("The Power of Now", "Tolle");
		
		Book b1 = l.takeBook("The Power of Now");
		System.out.println(b1.getTitle());
		
		//Book b2 = l.takeBook("Gone With the Wind");
		l.returnBook(b1);
		b1.isBorrowed();
		l.returnBook(b1);
		b1.isBorrowed();
		System.out.println(b1.isBorrowed());
		
		
		/*
		LibUser u1 = new LibUserImpl("Stewart");
		LibUser u2 = new LibUserImpl("John");
		LibUser u3 = new LibUserImpl("Newnham");
		
		u1.register(l);
		u2.register(l);
		u3.register(l);
		
		int findID = l.getID("Stewart");
		//System.out.println(findID);
		
		*/
		
		
		/*
		List<Book> database = new LinkedList<Book>();
		Book b = new Book("The Power of Now", "Tolle");
		database.add(b);
		
		//BookDatabase bd = new BookDatabase();
		//bd.addBook("The Power of Now", "Tolle");
		*/
		
		
	}
	
}
