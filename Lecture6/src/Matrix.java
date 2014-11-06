/*
 * qu 3 AND 4) Creating matrices
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
are placed in the same column regardless of their size. You can think of a tabulator character as a 
move-to-the-next-column command when printing on the screen.

4) One-liners for matrices (*)
Extend your Matrix class with a method setMatrix(String) that takes a String representing the numbers 
to be put in the elements of the array separated by commas, separating rows by semicolons, 
e.g. 1,2,3;4,5,6;7,8,9.

 */
public class Matrix {
	 
	private int[][] mat;
	private int rows, cols;
	
	// Constructors I 
	// ---------------
	public Matrix(int y, int x){
		rows = y;
		cols = x;
		mat = new int[y][x];
		for(int i=0;i<y;i++){
			for(int j=0;j<x;j++){
				mat[i][j] = 1;
			}
		}
	} // end Constructor 
	
	
	// setElement
	// ----------
	
	public void setElement(int y, int x, int num){	
		if(y<rows && x < cols){
			mat[y][x] = num; 
		}
	} //end method
	
	// setRow Method
	// =============
	public void setRow(int y, String s){
		
		int[] strNum = stringToArray(s); // Count Numbers in string and put in array
		int k = strNum.length;
			
		if(y<rows && cols==k){ 
			for(int j=0;j<cols;j++){
				mat[y][j] = strNum[j];
			} // end loop
		} // end outer if
	} //end method
	
	// setColumn Method
	// ================
	public void setColumn(int x, String s){
		
		int[] strNum = stringToArray(s); // Count Numbers in string and put in array
		int k = strNum.length;
			
		if(x<cols && rows==k){ 
			for(int j=0;j<rows;j++){
				mat[j][x] = strNum[j];
			} // end loop
		} // end outer if
	} //end method
	
	// toString Method
	// ===============
	
	public void MatToString(){
		String strMat = "[";
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				String s = Integer.toString(mat[i][j]);
				if(j<cols-1)  // correct end punctuation , or ; or ]
					strMat += s + ",";
				else if (i< rows-1)
					strMat += s + ";";
				else
					strMat += s + "]";
			} // end inner  loop
		} // end outer loop
		System.out.println(strMat);	
		System.out.println();
	} // end method
	
	
	// Print Method
	// ============
	public void prettyPrint(){
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	} //end method
	

	// StringToArray Reader - Count Numbers in string and put in array
	// ====================
	
	private static int[] stringToArray(String s){
	
		int subStart=0;
		int k = 0;
		int[] strNum = new int[100];
		int[] returnArr;
		
		
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(!Character.isDigit(c)){  
				String sub= s.substring(subStart, i);    // find substring of number.
				strNum[k] = Integer.parseInt(sub);   // convert substring to Int and pass to int[]
				subStart = i+1;  					 // reset the start of substring
				k++;								// increase count of array
			}
		} // end loop
		String sub= s.substring(subStart);    // last number
		strNum[k] = Integer.parseInt(sub);   // convert substring to Int and pass to int[]
		k++;
		returnArr = new int[k];
		for(int i=0; i<k;i++){
			returnArr[i] = strNum[i];
		}
		return returnArr;
		
	} // end method
	
	// stringToMatrix
	// ==============
	public static Matrix stringToMatrix(String s){  
		
		int sLength = s.length();
		int subStart = 0;
		int k=0;
		String[] strArray = new String[100]; 
		int[] colArray;
		int colLength;
		Matrix returnMat;
		
		// Find each Row and splice off into separate elements in a string array
		for(int i=0;i<sLength;i++){
			char c = s.charAt(i);
			if(c == ';'|| c ==']'){
				strArray[k] = s.substring(subStart+1,i);
				subStart=i;
				k++;
			}
		} // end loop

		// Calculate Column Dimension of Matrix
		colArray = stringToArray(strArray[0]);
		colLength = colArray.length;
		
		// convert strArray into Matrix Object
		returnMat =  new Matrix(k,colLength);
		for(int i=0;i<k;i++)
			returnMat.setRow(i, strArray[i]);
		return returnMat;	
		
	} // end stringToMatrix
	
	// Convert Matrix Object to MultipleArray
	// ======================================
	
	public int[][] getMultiArray(){
		return mat;
	}
	
} // end class
