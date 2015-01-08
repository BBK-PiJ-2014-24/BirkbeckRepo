package qu1_Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import qu1.LibraryImpl;
import qu1.LibUser;
import qu1.LibUserImpl;



public class LibraryUserTest {

	
	// Basic Getter/Setter Test
	@Test
	public void test1() {
		LibUser l = new LibUserImpl("Stew");
		l.setUserID(123);
		String name = l.getUserName();
		int id = l.getUserID();
		
		assertEquals("UserName Check","Stew", name);
		assertEquals("UserID Check",123, id);
		
		l.setUserName("John");
		name = l.getUserName();
		assertEquals("UserName 2nd Check","John", name);
	}
	
	@Test  // Register Checks On UserName and Library Classes 
	public void test2(){
		LibraryImpl l = new LibraryImpl("Croydon");
		l.setMaxBookPerUser(3);
		LibUser u = new LibUserImpl("Stew");
		u.register(l);
		assertEquals("UserName Class Register Check", "Croydon",u.getLibrary().getLibraryName());
		// assertEquals("Library Class Register Check on UserDatabase", "Stew",)
	}
	
	
	// getBorrowedBookTest()
	@Test
	public void test3(){
		LibraryImpl l = new LibraryImpl("Croydon");
		l.setMaxBookPerUser(3);
		LibUser u = new LibUserImpl("Stew");
		u.register(l);
		l.addBook("The Power of Now", "Tolle");  // populate Library with books
		l.addBook("AntiFragile", "Taleb");
		l.addBook("GoldFinger", "Ian Fleming");
		l.addBook("MoonRaker", "Ian Fleming");		
		
		List<String> testArray = new ArrayList<String>(); 
		List<String> z = u.getBorrowedBookList();
		assertEquals("Test user's BorrowedBook List is Empty Before populated: ", testArray, z);
		
		u.borrowBook("The Power of Now");  // user borrows two books
		u.borrowBook("AntiFragile");
		
		testArray.add("The Power of Now"); // populate Dummy List
		testArray.add("AntiFragile");
		
		z = u.getBorrowedBookList();
		assertEquals("Test user's BorrowedBook List populated with the two books: ", testArray, z);
		
		u.borrowBook("Gone With the Wind");
		z = u.getBorrowedBookList();
		assertEquals("Test user's BorrowedBook List After Invalid Book Request: ", testArray, z);
		
		u.borrowBook("GoldFinger");
		u.borrowBook("MoonRaker");
		testArray.add("GoldFinger"); // Further populate Dummy List
		z = u.getBorrowedBookList();
		assertEquals("Test user's BorrowedBook List After Attempt to Breach Max Book on Loan: ", testArray, z);
		
	}
	
	// test returnBook()
	@Test
	public void test4(){
		LibraryImpl l = new LibraryImpl("Croydon");
		l.setMaxBookPerUser(3);
		LibUser u = new LibUserImpl("Stew");
		u.register(l);
		l.addBook("The Power of Now", "Tolle");  // populate Library with books
		l.addBook("AntiFragile", "Taleb");
		l.addBook("GoldFinger", "Ian Fleming");
		l.addBook("MoonRaker", "Ian Fleming");
		
		u.borrowBook("The Power of Now");  // user borrows two books
		u.borrowBook("AntiFragile");
		
		u.returnBook("The Power of Now");
		
		List<String> testArray = new ArrayList<String>(); 
		testArray.add("AntiFragile"); // populate Dummy List
		List<String> z = u.getBorrowedBookList();
		assertEquals("Test user's returnBook by checking user's borrowed book list: ", testArray, z);
		
		
		u.returnBook("Gone with the Wind");
		u.returnBook("MoonRaker");
	}

}
