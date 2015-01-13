package mergeSort;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void test1(){
		int[] randArray = {6,5,3,1,8,7,2,4};
		int[][] atomicArray= new int[8][1];
		atomicArray[0][0] = 6;
		atomicArray[1][0] = 5;
		atomicArray[2][0] = 3;
		atomicArray[3][0] = 1;
		atomicArray[4][0] = 8;
		atomicArray[5][0] = 7;
		atomicArray[6][0] = 2;
		atomicArray[7][0] = 4;
		
		int[][] calcArray = MergeSort.atomizeArrayCalc(randArray);

		assertArrayEquals("Test atomicSplit of Random Array: ",atomicArray, calcArray);
		
	}
	
	
	@Test
	public void test2() {
		MergeSort m = new MergeSort();
		int[] randArray = {6,5,3,1,8,7,2,4};
		int[] sortArray = {1,2,3,4,5,6,7,8};
		
		int[][] mArray = m.sort(randArray);
		int[] mergeArray = mArray[0];
		assertArrayEquals("Test random Array = sort Array: ", sortArray, mergeArray);
	}

}
