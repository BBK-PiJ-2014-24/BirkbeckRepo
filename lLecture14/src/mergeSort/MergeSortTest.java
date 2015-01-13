package mergeSort;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void test() {
		int[] randArray = {6,5,3,1,8,7,2,4};
		int[] sortArray = {1,2,3,4,5,6,7,8};
		
		int[] mergeArray = MergeSort.sort(randArray);
		
		assertEquals("Test random Array = sort Array: ", sortArray, mergeArray);
	}

}
