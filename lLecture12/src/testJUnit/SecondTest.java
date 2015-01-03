package testJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondTest {

	@Test
	public void test() {
		TestMethods m = new TestMethods();
		String result = m.concat("Hello", "World");
		assertEquals("Hello World", result);
	}

}
