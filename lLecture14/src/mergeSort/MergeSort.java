package mergeSort;

public class MergeSort {

	// Field
	// -----
	
	public int [][] atomizeArray = null;
	private int arrayLength;
	
	// Methods
	// -------
	
	public int[][] sort(int[] randArray){
		
		if(atomizeArray == null){
			arrayLength = randArray.length;
			atomizeArray = atomizeArrayCalc(randArray); 
		}
		return sort(atomizeArray);	
	}
	
	
	public int[][] sort(int[][] a){
	
		int[][] b = new int[a.length/2][(a[1].length)*2];
		for(int i=0; i< a.length; i=i+2){
			int j = 0; 
			int k = 0;
			int m = 0;
			while( j < a[i].length && k < a[i+1].length){
				if(a[i][j] < a[i+1][k]){
					b[i/2][m]=a[i][j];
					j++;
					m++;
				}
				else{
					b[i/2][m]=a[i+1][k];
					k++;
					m++;
				}  // end if
			} // end while
			
			
			while(j<a[i].length){
				b[i/2][m]=a[i][j];
				j++;
				m++;
			} // end while
		
		
			while(k<a[i+1].length){
				b[i/2][m]=a[i+1][k];
				k++;
				m++;
			} // end while	
		
		} // end for..loop
		
		if(b[0].length == arrayLength)
			return b;
		else
			return sort(b);
	} // end sort()
	
	
	
	
	public static int[][] atomizeArrayCalc(int[] randArray){
		
		int[][] atomicArray = new int[randArray.length][1];
		for(int i=0; i<randArray.length; i++){
			atomicArray[i][0] = randArray[i];
		}
		return atomicArray;
			
		
	}
	
	

}
