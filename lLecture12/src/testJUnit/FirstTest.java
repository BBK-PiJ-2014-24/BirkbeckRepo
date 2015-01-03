package testJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FirstTest {

	@Before
	public void initiateClass(){
		System.out.println("Test Before");
	}
	
	@Test
	public void testMultiply() {
		TestMethods m = new TestMethods();
		int result1 = m.multiply(5, 6);
		int result2 = m.multiply(-1, 2);
		assertEquals("5x6", 30, result1);
		assertEquals("-1*2",-2,result2);
		
	}

}
