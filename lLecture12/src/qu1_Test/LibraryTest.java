package qu1_Test;

import static org.junit.Assert.*;

import org.junit.Test;

import qu1.Book;
import qu1.LibUserImpl;
import qu1.LibraryImpl;
import qu1.LibUser;

public class LibraryTest {

	// Test for MaxBook PerUser Field
	@Test 
	public void test1() {
		LibraryImpl l = new LibraryImpl("Croydon");
		l.setMaxBookPerUser(3);
		assertEquals("Max Book Test", 3, l.getMaxBookPerUser());
	}
	
	
	// Test for Library Class Registration Works With User Class and UserDatabase Class
	@Test
	public void test2(){
		LibraryImpl l = new LibraryImpl("Croydon");
		LibUser u = new LibUserImpl("Stewart");
		u.register(l);
		int id = u.getUserID();                                 
		assertEquals("Library UserDatabase Registry LibUser Check",true,l.getUserDatabase().containsKey(id));
		assertEquals("Libary UserDatabase Registry LibUser NameCheck", "Stewart",l.getUserDatabase().getLibUser(id).getUserName());
		
	}
	
	// Test for Library Class getID()
	@Test
	public void test3(){
		LibraryImpl l = new LibraryImpl("Croydon");
		LibUser u1 = new LibUserImpl("Stewart");
		LibUser u2 = new LibUserImpl("John");
		LibUser u3 = new LibUserImpl("Newnham");
		LibUser u4 = new LibUserImpl("Eric");
		
		u1.register(l);             // register u1
		int id1 = u1.getUserID();   // get u1 ID                 
		int findID1 = l.getID("Stewart"); // search for u1 ID in UserDatabase
		assertEquals("Library getID() test", id1, findID1);
		int findID4 = l.getID("Eric");   // search for Unregistered u4 ID in UserDatabase
		int id4 = u4.getUserID();		// Check that u4 has now been registered	
		assertEquals("Library getID() on Unregistered User", id4, findID4 );
	}
	
	// Test Library addBook()
	@Test
	public void test4(){
		LibraryImpl l = new LibraryImpl("Croydon");
		l.addBook("The Power of Now", "Tolle");
		l.addBook("AntiFragile", "Taleb");
		assertEquals("Test addBook()", 2, l.getBookDatabase().size());
	}
	
	// Test takeBook()
	@Test
	public void test5(){
		LibraryImpl l = new LibraryImpl("Croydon");
		l.addBook("The Power of Now", "Tolle");
		l.addBook("AntiFragile", "Taleb");
		Book b1 = l.takeBook("The Power of Now");
		Book b2 = l.takeBook("Gone With the Wind");
		assertEquals("Test takeBook() - Return Book","The Power of Now", b1.getTitle());
		assertTrue("Test Book isBorrowed()",b1.isBorrowed());
		assertNull("Test takeBook() - Return Null",b2);
	}

	// Test returnBook()
	@Test
	public void test6(){
		LibraryImpl l = new LibraryImpl("Croydon");
		l.addBook("The Power of Now", "Tolle");
		Book b1 = l.takeBook("The Power of Now");
		assertTrue("Test Book is Borrowed",b1.isBorrowed());
		l.returnBook(b1);
		assertEquals("Test returnBook is returned",false, b1.isBorrowed());
		l.returnBook(b1);
		assertEquals("Test returnBook is ALREADY returned Book ",false, b1.isBorrowed());	
	}
	
	
	
	
	
}
