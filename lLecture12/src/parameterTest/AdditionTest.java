package parameterTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)  // Declare Parameter Class
public class AdditionTest {

	// Fields
	// ------
	int x;
	int expectedResult;
	
	// Constructor
	// -----------
	
	public AdditionTest(int x, int expectedResult){
		this.x = x;
		this.expectedResult = expectedResult;
	}
	
	// Parameters
	// ----------
	
	@Parameters
	public static Collection params(){   // Magazine = {x, expectedResult}
		
		Object[][] paramMagazine = new Object[][] { { 1, 2 }, { 5, 10 }, { 121, 242 } };
		return Arrays.asList(paramMagazine);
	}
	
	// The Test
	// --------
	
	@Test
	public void test() {
		
		MyAddition testObj = new MyAddition();  // Instantiate Addition Obj
		assertEquals("Test Parameter: ", expectedResult, testObj.calc(x,x)  );   //
	}

}
