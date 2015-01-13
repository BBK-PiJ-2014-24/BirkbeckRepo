package mergeSort;

public class test {

	public static void main(String[] args) {
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
		
//		int[][] calcArray = MergeSort.atomizeArrayCalc(randArray);
		
	/*	int[][] a = atomicArray;
		int[][] b = new int[a.length/2][5];
	
		
		int i=0;
		int m=0;
		int k=0;
		b[i/2][m]=a[i+1][k];
		*/
		
		MergeSort merge = new MergeSort();
		int[][] mArray = merge.sort(randArray);
		int[] mergeArray = mArray[0];

	}

}
