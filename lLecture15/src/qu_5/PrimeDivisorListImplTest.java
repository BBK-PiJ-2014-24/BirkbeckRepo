package qu_5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PrimeDivisorListImplTest {

	
	// Initializations and Declarations
	// --------------------------------
	private Integer x1;
	private Integer x2;
	private Integer x3; 
	private Integer x4;
	private Integer x5;
	private Integer x6;
	private Integer x7;
	
	PrimeDivisorList list;
	
	
	// Set UP
	// ------
	@Before 
	public void setUp(){
		
		list = new PrimeDivisorListImpl();
		
		x1 = 1;
		x2 = 2;
		x3 = 5; 
		x4 = 13;
		x5 = 10;
	    x6 = -3;
	    x7 = null;
	}
	
	@Rule
    public ExpectedException exception= ExpectedException.none();
	
	// Test testPrimeNumber()
	// ----------------------
		@Test
		public void test1(){		
		
			assertTrue("Test testPrimeNumber(): ", list.testPrimeNumber(x1));
			assertTrue("Test testPrimeNumber(): ", list.testPrimeNumber(x2));
			assertTrue("Test testPrimeNumber(): ", list.testPrimeNumber(x4));
			assertFalse("Test testPrimeNumber(): ", list.testPrimeNumber(x5));
		}
		
	// Test testPrimeNumber() Exceptions
	// ---------------------------------
		
		@Test
		public void test2(){
			exception.expect(IllegalArgumentException.class);
			exception.expectMessage("Number Must be Greater than 0.");
			list.testPrimeNumber(x6);
		}
			
		
		// Test AddList() / RemoveList()
		// -----------------------------
		@Test
		public void test3(){
			list.add(x1);
			list.add(x2);
			list.add(x3);
			list.add(x4);
			assertEquals("Count the Number of Primes in the list: ", 4,list.size());
			list.remove(x4);
			assertEquals("Test the Remove() method: ", 3,list.size());
			list.remove(x5);
			assertEquals("Test the Remove() method: ", 3,list.size());
		}
		
		// Test addList() Exceptions
		// --------------------------
			
			@Test
			public void test4(){
				exception.expect(NullPointerException.class);
				list.add(x7);
			}		
		
		

}
