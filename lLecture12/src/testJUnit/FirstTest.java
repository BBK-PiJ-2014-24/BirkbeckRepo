package testJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTest {

	@Test
	public void testMultiply() {
		TestMethods m = new TestMethods();
		int result = m.multiply(5, 6);
		assertEquals(30, result);
	}

}
