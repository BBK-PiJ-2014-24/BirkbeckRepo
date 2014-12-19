package map;

import singleLinkedList2.SingleLinkList;
import singleLinkedList2.Node;

public class TestMyHash {

	public static void main(String[] args) {
		// Intializations and Declarations
		// -------------------------------
		
		HashInterface h = new MyHash(10);
		SingleLinkList[] s = new SingleLinkList[10];
		String[] strArr;

		// Test if Empty
		// -------------
		System.out.println("\nIs Map Empty: " + h.isEmpty() + "\n");
		
		// Load Data
		// ---------
		h.put(100, "Stewart");
		h.put(101, "Rob");
		h.put(102, "Mike");
		h.put(103, "Portia");
		h.put(104, "Pascale");
		h.put(105, "Jessica");
		h.put(106, "Mary");
		h.put(107, "Emma");
		
		// Get Name for key 100
		// --------------------
		System.out.println("Get Name for key 100:");
		strArr = h.get(100);
		System.out.println(strArr[0] + "\n");
		
		// Create a collision key for 100
		// ------------------------------
		System.out.println("Create a collision for key 100:");
		h.put(100, "John");
		h.put(100, "Newnham");
		strArr = h.get(100);
		System.out.println(strArr[0] + "\t" + strArr[1] + "\t" + strArr[2]);
		
		// Create a collision key for 102
		// ------------------------------
		System.out.println("\nCreate a collision for key 102:");
		h.put(102, "David");
		h.put(102, "Newnham");
		strArr = h.get(102);
		System.out.println(strArr[0] + "\t" + strArr[1] + "\t" + strArr[2]);
				
		

	}

}
