// BubbleSort Tests: Applies Two Bubble Tests. One used with the Bubble Sort Class Object. 
// The other done from a static call to the ListUtilitiesMethod.  


package listUtilities;

public class BubbleSortTest {

	public static void main(String[] args) {
		// Initializations and Declarations
		// --------------------------------
		 BubbleSortList b = new BubbleSortList();
		 SingleLinkList s = new SingleLinkList();
		 SingleLinkList sb;
		 
		 // Node Data
		 // ---------
		 Node n1 = new Node(1); Node n11 = new Node(11);
		 Node n2 = new Node(2); Node n12 = new Node(12);
		 Node n3 = new Node(3); Node n13 = new Node(13);
		 Node n4 = new Node(4); Node n14 = new Node(14);
		 Node n5 = new Node(5); Node n15 = new Node(15);
		 Node n6 = new Node(6); Node n16 = new Node(16);
		 Node n7 = new Node(7); Node n17 = new Node(17);
		 Node n8 = new Node(8); Node n18 = new Node(18);
		 Node n9 = new Node(9); Node n19 = new Node(19);
		 Node n10 = new Node(10); Node n20 = new Node(20);
		 
		 
		 // Load Bubble List & Sort
		 // -----------------------
		 System.out.println("Load Bubble List & Sort\n");
		 b.setHead(n5);  
		 b.addNode(n3);
		 b.addNode(n8);
		 b.addNode(n7);
		 b.addNode(n1);
		 b.addNode(n6);
		 b.addNode(n2);
		 b.addNode(n4);
		 b.addNode(n10);
		 b.addNode(n9);
		 
		 b.printList();
		 b.sort();
		 b.printList();
		 
		 // Load Single Link List & Sort By Calling Static Method in List Utilities
		 // -----------------------------------------------------------------------
		 System.out.println("Load Single Link List & Sort By Calling Static Method\n");
		 s.setHead(n15);
		 s.addNode(n13);
		 s.addNode(n18);
		 s.addNode(n17);
		 s.addNode(n11);
		 s.addNode(n16);
		 s.addNode(n12);
		 s.addNode(n14);
		 s.addNode(n20);
		 s.addNode(n19);
		 
		 s.printList();
		 sb = ListUtilities.bubbleSort(s);
		 sb.printList();
		 
		

	}

}
