package qu1_Test;

import static org.junit.Assert.*;

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
		LibUser u = new LibUserImpl("Stew");
		u.register(l);
		assertEquals("UserName Class Register Check", "Croydon",u.getLibrary().getLibraryName());
		// assertEquals("Library Class Register Check on UserDatabase", "Stew",)
	}
	
	
	

}
