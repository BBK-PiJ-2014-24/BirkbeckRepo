/*
 * 6 Anti-aircraft aim (*)
Create an enumerated type Result in its own file. The enum must have 8 possible values: 
HIT, FAIL LEFT, FAIL RIGHT, FAIL HIGH, FAIL LOW, FAIL SHORT, FAIL LONG, OUT OF RANGE. 
Hint: the enum must be public.
Then create a Java class Target with the following methods:

• A constructor method Target(int) that creates a 3-D array of integers of the proposed size 
in all three dimensions. All elements must be set to zero.

• A method called init() that sets all the elements in the matrix to 0 except one —selected randomly— 
that will be set to 1. Hint: Remember that you can get a random integer between 0 and N 
(not including N) by using int numberToGuess = (int) Math.abs(N * Math.random()).

• fire(int,int,int) a method that checks whether the element determined by the indexes is 1 and returns 
a type Result according to the result: Result.HIT if the element is 1, Result.FAIL_LEFT if the element
of value one is “to the left” (you must decide what left and right are in your 3-D array), etc. If 
any of the indeces is too big (or negative), the method must return Result.OUT\_OF\_RANGE. Left–right 
information takes precedence over high–low, and this takes precendence over short–long. If the 1 is 
to the left and behind, the output should be Result.FAIL\_LEFT.
*/

public class Target {
	
	
	// Instance Variables
	// ------------------
	private int x;
	private int y;
	private int z;
	private int gridDim;
	private int[][][] mat;
	private int[] plane = new int[3];
	
	// Constructor
	// -----------
	public Target(int dim){
		
		mat = new int[dim][dim][dim];
		
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				for(int k=0;k<dim;k++){
					mat[i][j][k]=0;
				}
			}
		} // end loop
		gridDim = dim;
	} // end Constructor
		
	// Init()
	// ------
		public void init(){
			int randX = (int) Math.abs(10 * Math.random());
			int randY = (int) Math.abs(10 * Math.random());
			int randZ = (int) Math.abs(10 * Math.random());
			mat[randX][randY][randZ] = 1;
			plane[0] = randX;
			plane[1] = randY;
			plane[2] = randZ;
		} // end init
		
		/*

		 */
		public Result fire(int x, int y, int z){
			
			Result r = Result.OUT_OF_RANGE;  // local ENUM variable must be initialized with something.
			
			System.out.println("(" + x + "," + y + "," +z + ")");
			
			if(x>gridDim || y>gridDim || z>gridDim || x <0 || y<0 || z< 0)
				r = Result.OUT_OF_RANGE;
			else if(mat[x][y][z] == 1)
				r = Result.HIT;
			else if(x-plane[0]<0)
				r = Result.FAIL_RIGHT;
			else if(x-plane[0]>0)
				r = Result.FAIL_LEFT;
			else if(y-plane[1]>0)
				r = Result.FAIL_HIGH;
			else if(y-plane[1]<0)
				r = Result.FAIL_LOW;
			else if(z-plane[2]>0)
				r = Result.FAIL_LONG;
			else if(z-plane[2]<0)
				r = Result.FAIL_SHORT;
		
			return r;
			
		} // end fire
	// 	
				
		
public void revealPlane(){
	System.out.println("Plane: " + plane[0] + "," + plane[1] + "," + plane [2]);
}

} // end class
