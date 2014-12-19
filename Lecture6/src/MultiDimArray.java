
public class MultiDimArray {

	public static void main(String[] args) {
		
		int[][] a = new int[3][3];
		int[] b = {1,2,3};
		a[1] = b;
		int length = 5;
	
	// Testing Partial Initialization a[3][] 	
		for(int i=0; i<3; i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j] + " ");
		} // end inner loop
		System.out.println();
	} // end outer loop
	
	System.out.println();	
	// Testing LOWER Triangular Matrix	
		for(int i=0;i<length;i++){
			for(int j=length-i-1;j<length;j++){
					System.out.print("1 ");
				} // end j loop
			System.out.println();
		} // end i loop	
	
	System.out.println();	
	
	// Testing UPPER Triangular Matrix	
		for(int i=0;i<length;i++){
			for(int j=i;j<length;j++){
					System.out.print("1 ");
				} // end j loop
			System.out.println();
		} // end i loop	
	
	
	}  // end main

} // end classs
