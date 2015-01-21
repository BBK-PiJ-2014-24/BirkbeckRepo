package qu_5;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeDivisorListImplTest {

	@Test
	public void test() {
		
		PrimeDivisorList list = new PrimeDivisorListImpl();
		
		Integer x1 = 1;
		Integer x2 = 2;
		Integer x3 = 5; 
		Integer x4 = 13;
		Integer x5 = 10;
		
		list.add(x1);
		list.add(x2);
		list.add(x3);
		list.add(x4);
		assertEquals("Count the Number of Primes in the list: ", 4,list.size());
		list.remove(x4);
		assertEquals("Test the Remove() method: ", 3,list.size());
		
		
		
		
		
		
		
		
	}

}
