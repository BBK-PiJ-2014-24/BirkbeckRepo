/*
 * 5 Symmetry looks pretty
Make a class MatrixChecker with three methods:

• isSymmetrical(int[]) takes an array of int and returns true if the array is symmetrical and false
 otherwise. An array is symetrical if the element at [0] is the same as the element at [length-1], 
 the element at [1] is the same as the element at [length-2], etc.
 
• isSymmetrical(int[][]) takes an bidimensional array of int and returns true if the matrix is 
symmetrical and false otherwise. An matrix is symmetrical if m[i][j] == m[j][i] for any value of 
i and j.

• isTriangular(int[][]) takes an bidimensional array of int and returns true if the matrix is 
triangular1 and false otherwise. An matrix is triangular if m[i][j] == 0 for any value of i that 
is greater than j.

Add some methods to your Matrix class from the other exercise to perform tests on the matrices you
 create using the methods from MatrixChecker. (Hint: these methods will need to create objects of 
 type MatrixChecker).
 */
public class MatrixChecker {
	
	// check if array is Symmetrical
	// =============================
	public static boolean isSymmetrical(int[] x) {
		boolean isSym = true;
		int length = x.length;
		int i=0;
		while(isSym && i<length/2){
			if(x[i]!=x[length-1-i])
				isSym = false;
			i++;
		} // end while
		return isSym;
	}

	// check if Matrix is Symmetrical
	// ==============================	
	public static boolean isSymmetrical(int[][] m){
		boolean isSym = true;
		int length = m.length;
		
		for(int i=0;i<length;i++){
			for(int j=0;j<length;j++)
				if(m[i][j]!=m[j][i]){
					isSym = false;
					break;
				} // end j loop
		} // end i loop
		return isSym;
	}
	
	// Check if Matrix is Upper Triangular
	// ===================================
	
	public static boolean isTriangular(int[][] m){
	boolean isTrig = true;
	
	int length = m.length;
	
	for(int i=0;i<length;i++){
		for(int j=i+1;j<length;j++){
			if(m[i][j]!=0){
				isTrig = false;
				break;
				} // end if
			} // end j loop
	} // end i loop
	return isTrig;
	
		
	} // end method
	
}// end class
