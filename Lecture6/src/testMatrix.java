/*
 * qu3 AND qu4) Creating matrices
Create a class Matrix that has a 2-D array of integers as a field. The class should have methods for:

• a constructor method Matrix(int,int) setting the size of the array as two integers (not 
necessarily the same). All elements in the matrix should be initialised to 1.

• a method setElement(int,int,int) to modify one element of the array, given its position 
(the first two integers) and the new value to be put in that position (the third integer). 
The method must check that the indeces are valid before modifying the array to avoid an 
IndexOutOfBoundsException. If the indeces are invalid, the method will do nothing and the third 
argument will be ignored.

• a method setRow(int,String) that modifies one whole row of the array, given its position as an 
integer and the list of numbers as a String like “1,2,3”. The method must check that the index is 
valid and the numbers are correct (i.e. if the array has three columns, the String contains three 
numbers). If the index or the String is invalid, the method will do nothing.

• a method setColumn(int,String) that modifies one whole column of the array, given its position
 as an integer and the list of numbers as a String like “1,2,3”. The method must check that the 
 index is valid and the numbers are correct (i.e. if the array has four rows, the String contains 
 four numbers). If the index or the String is invalid, the method will do nothing.
 
• a method toString() that returns the values in the array as a String using square brackets,
 commas, and semicolons, e.g. “[1,2,3;4,5,6;3,2,1]”.
 
• A method prettyPrint() that prints the values of the matrix on screen in a legible format. 
Hint: you can use the special character ’\t’ (backslash-t) to mark a tabulator so that all numbers 
are placed in the same column regardless of their size. You can think of a tabulator character as 
a move-to-the-next-column command when printing on the screen.

4) One-liners for matrices (*)
Extend your Matrix class with a method setMatrix(String) that takes a String representing the numbers 
to be put in the elements of the array separated by commas, separating rows by semicolons, 
e.g. 1,2,3;4,5,6;7,8,9.
 *
 *
 */


public class testMatrix {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		String sRow = "2,2,2,2,2";
		String sCol = "0,1,2,3,4,5,6,7,8,9";
		String strMat = "[9,8,7;6,5,4;3,2,1]";
		
		Matrix m1 = new Matrix(y,x);  // constructor
		m1.prettyPrint();
		
		m1.setElement(4, 2, 5);  // change element
		m1.prettyPrint();
		
		m1.setRow(9, sRow);   // change row
		m1.prettyPrint();
		
		m1.setColumn(2, sCol); // change Col
		m1.prettyPrint();
		
		Matrix m2 = new Matrix(3,4);
		m2.prettyPrint();
		m2.setRow(0, "1,2,3,4");
		m2.setRow(1, "5,6,7,8");
		m2.setRow(2, "9,10,11,12");
		m2.prettyPrint();
		
		m2.MatToString();
		
	
		Matrix m3 = Matrix.stringToMatrix(strMat);
		m3.prettyPrint();
		
				

	} // end main
} // end class
