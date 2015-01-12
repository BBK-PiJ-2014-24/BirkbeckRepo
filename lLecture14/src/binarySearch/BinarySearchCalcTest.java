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
		int m = 50;
		int startArray = 0;
		int endArray = 99;
		
		boolean isX = BinarySearch.find(x, list);
		boolean isY = BinarySearch.find(y, list);
		boolean isM = BinarySearch.find(m, list);
		boolean isStartArray = BinarySearch.find(startArray, list);
		boolean isEndArray = BinarySearch.find(endArray, list);
		
		assertEquals("Test Bin Search when number x is in Array", true, isX);
		assertEquals("Test Bin Search when number y is NOT in Array", false, isY);
		assertEquals("Test Bin Search when Middle number m is in Array", true, isM);
		assertEquals("Test Bin Search when Start number is in Array", true, isStartArray);
		assertEquals("Test Bin Search when end number is in Array", true, isEndArray);
	}

}
