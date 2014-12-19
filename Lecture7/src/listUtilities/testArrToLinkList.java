package listUtilities;

public class testArrToLinkList {
	
	public static void main(String[] args){
		
		// Initializations & Declarations
		// ------------------------------
		int a[] = {12,11,13,14,15};
		SingleLinkList s = new SingleLinkList();
		SingleLinkList t;
		Node n1 = new Node(5);
		Node n2 = new Node(3);
		s = ListUtilities.arrayToList(a);
		
		// Print Linked List
		// -----------------
		s.printList();
		
		// AddNode to Linked List
		// ----------------------
		System.out.println("\nAddNode to Linked List");
		s.addNode(n1);
		System.out.println();
		s.printList();
		System.out.println("Number of List: " + s.getNodeCount());
		
		// Insert
		// ------
		System.out.println("\nInsert n2 into Linked List");
		n2.setInt(3);
		s.insert(n2, 2);
		
		System.out.println();
		s.printList();
		
		// Test BubbleSort()
		// -----------------
		System.out.println("\nBubbleSort");
		t = ListUtilities.bubbleSort(s);
		t.printList();
		
		
	} // end main
} // end class
