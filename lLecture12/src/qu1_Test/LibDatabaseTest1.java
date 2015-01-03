package qu1_Test;

import static org.junit.Assert.*;

import org.junit.Test;

import qu1.LibDatabase;

public class LibDatabaseTest1 {

	@Test
	public void test() {
		LibDatabase l = new LibDatabase();
	
		int min = 100000;
		int max = 999999;
	// Testing that the ID Number is in bounds	
	for(int i=0;i<max;i++){
		int id = l.generateID();
		int maxID = Math.max(id, max);
		int minID = Math.min(id, min);
		assertEquals("Max ID Check", maxID, max);
		assertEquals("Min ID Check", minID, min);
		}
	}

}
