package qu1_Test;

import static org.junit.Assert.*;

import org.junit.Test;

import qu1.BookDatabase;

public class BookDatabaseTest {

	// Test addBook() method 
	@Test
	public void test1() {
		BookDatabase bd = new BookDatabase();
		assertEquals("Test BookDatase is Empty", 0,bd.size());
		bd.addBook("The Power of Now", "Tolle");
		assertEquals("Test BookDatase is now populated", 1,bd.size());
	}

}
