package qu1_Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import qu1.LibUserDatabase;
import qu1.LibUserImpl;
import qu1.LibraryUser;

public class LibDatabaseTest1 {

	
	@Test // Testing that the ID Number is in bounds	
	public void test1() {
		LibUserDatabase l = new LibUserDatabase();
	
		int min = 100000;
		int max = 999999;
		
	
	for(int i=0;i<max;i++){
		int id = l.generateID();
		int maxID = Math.max(id, max);
		int minID = Math.min(id, min);
		assertEquals("Max ID Check", maxID, max);
		assertEquals("Min ID Check", minID, min);
		}
	}
	
	
	
	@Test(timeout = 1000)// Testing Database Entry
	public void test2(){
		LibUserDatabase l = new LibUserDatabase();
		LibraryUser u1 = new LibUserImpl("Stewart");
		LibraryUser u2 = new LibUserImpl("John");
		
		assertEquals("Dummy LibraryUser Working", "Stewart",u1.getUserName());
		assertEquals("Dummy LibraryUser ID Working", 0, u1.getUserID());
				
		l.put(u1);
		l.put(u2);
		
		Integer id1 = u1.getUserID();
		Integer id2 = u2.getUserID();
		int size = l.size();
		
		assertEquals ("DataBase correct Name Recall 1", true, l.containsKey(id1));
		assertEquals ("DataBase correct Name Recall 2", true, l.containsKey(id2));
		assertEquals("Database Test Size After First Put",2, size);
	}
	
	

}
