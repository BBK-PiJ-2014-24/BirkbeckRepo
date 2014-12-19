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


public class testMatrixChecker {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		int[] x = {1,2,3,2,1};
		int[] y  = {1,2,2,1};
		int[] a = { 1,2,3,3,1};
		int[] b = {1,2,3,1};
		Matrix m, mTrig;
		String matArr = "{1,0,0;0,1,0;0,0,1}";
		String matTrig = "{1,0,0,0;1,1,0,0;1,1,1,0;1,1,1,1}";
		int[][] mda1, mda2;
		
		boolean checkX, checkY,checkA, checkB, checkM, checkTrig;
		
		checkX = MatrixChecker.isSymmetrical(x);
		System.out.println("checkX: " + checkX);

		checkY = MatrixChecker.isSymmetrical(y);
		System.out.println("checkY: " + checkY);
		
		checkA = MatrixChecker.isSymmetrical(a);
		System.out.println("checkA: " + checkA);
		
		checkB = MatrixChecker.isSymmetrical(b);
		System.out.println("checkB: " + checkB);
		
		m = Matrix.stringToMatrix(matArr); // Create Matrix Object from String
		mda1 = m.getMultiArray();  // Convert Matrix to int[][]
		checkM = MatrixChecker.isSymmetrical(mda1);
		System.out.println("checkM: " + checkM);
		
		mTrig = Matrix.stringToMatrix(matTrig); // Create Triangular Matrix Object from String
		mda2 = mTrig.getMultiArray(); // Convert Matrix to int[][]
		checkTrig = MatrixChecker.isTriangular(mda2);
		System.out.println("checkTrig: " + checkTrig);
		
	} // end main
} // end class
