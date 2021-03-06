package qu1_Test;


import static org.junit.Assert.*;
import org.junit.Test;
import qu1.Book;

public class BookTest {

	@Test
	public void test1() {
		Book b = new Book("The Power of Now", "Tolle");
		String title = b.getTitle();
		String author = b.getAuthor();
		assertEquals("getTitle Check", "The Power of Now", title);
		assertEquals("getAuthor Check", "Tolle", author );
	}
	
	@Test
	public void test2(){
		Book b = new Book("The Power of Now", "Tolle");
		b.setBorrowed(true);
		assertTrue("Test BookBorrowing Methods",b.isBorrowed());
	}

}
