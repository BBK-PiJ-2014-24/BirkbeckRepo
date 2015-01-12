package binarySearch;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BinarySearchCalcTest {

	@Test
	public void test() {
		List<Integer> list = new ArrayList<Integer>(100);
		for(int i=0; i<100; i++) {
			list.add(i);
		}
		System.out.println(list.toString());
		
		int x = 15;
		int y = 102;
		boolean isX = BinarySearchCalc(x);
		boolean isY = BinarySearchCalc(y);
		
		assertEquals("Test Bin Search when number x is in Array", true, isX);
		assertEquals("Test Bin Search when number  y is NOT in Array", false, isY);
	}

}
