/*
 * Qu.2) Copying arrays
Create a new Java class called ArrayCopier with a method called copy that takes two arrays of integers 
as parameters. The method should copy the elements of the first array (you can call it src, from 
“source”) to the second one (dst, from “destination”) as much as possible.
If the second array is smaller, then only those elements that fit will be copied. If the second array 
is larger, it will be filled with zeroes.
Write a program that creates an object of this class and uses this method to copy some arrays in 
all three cases:
• Both arrays are of the same size.
• The source array is longer.
• The source array is shorter.
 */
public class ArrayCopier {

		public static int[] copyArray(int[] x, int[] y){
			
			int xLength = x.length;
			int yLength = y.length;
			int dLength = yLength - xLength;
			
			// if Copying into a Larger Arrray
			// -------------------------------
			
			if(dLength>0){
				for(int i=0;i<xLength;i++)
						y[i] = x[i];
			
				for(int i=xLength; i<yLength; i++)
					y[i] = 0;	 
			} // end if
			
			// if Copying into a Smaller Arrray
			// -------------------------------
			else{
				for(int i=0;i<yLength;i++)
					y[i] = x[i];
			} // end else
			return y;
		} // end CopyArray
	
		
} // end Class
