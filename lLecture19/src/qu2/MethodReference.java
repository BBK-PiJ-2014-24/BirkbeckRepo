package qu2;

import java.util.Arrays;
import java.util.Comparator;

public class MethodReference {

	public static void main(String[] args) {
		
		String[] strArray = new String[8];
		strArray[0] = "The ";
		strArray[1] = "World ";
		strArray[2] = "is ";
		strArray[3] = "Flat ";
		strArray[4] = "in ";
		strArray[5] = "the ";
		strArray[6] = "Java";
		strArray[7] = "Universe";
		
		Arrays.sort(strArray, Payload::bombMethod);  // The Arrays.sort IS THE TransportMethod
													 // sort(String[], Comparator Interface c)
													 // SO JUST DROP MethRef Straight In.
		
		System.out.println("Method Reference Example");
		System.out.println(Arrays.asList(strArray));

	}	
}
