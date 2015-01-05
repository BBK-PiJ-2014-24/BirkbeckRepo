package qu1_Test;

import static org.junit.Assert.*;

import org.junit.Test;

import qu1.Library;
import qu1.LibraryUser;
import qu1.LibUserImpl;



public class LibraryUserTest {

	
	// Basic Getter/Setter Test
	@Test
	public void test1() {
		LibraryUser l = new LibUserImpl("Stew");
		l.setUserID(123);
		String name = l.getUserName();
		int id = l.getUserID();
		
		assertEquals("UserName Check","Stew", name);
		assertEquals("UserID Check",123, id);
		
		l.setUserName("John");
		name = l.getUserName();
		assertEquals("UserName 2nd Check","John", name);
	}
	
	@Test
	public void test2(){
		
		Library l = new Library("Croydon");
		LibraryUser u = new LibUserImpl("Stew");
		u.register(l);
		assertEquals("Library Name Register Check", "Croydon",u.getLibrary().getLibraryName());
		
	}
	
	
	

}
