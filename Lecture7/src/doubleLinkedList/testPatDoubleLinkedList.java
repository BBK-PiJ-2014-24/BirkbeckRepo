package doubleLinkedList;

/*
 * 5 Doubly-linked lists
A doubly-linked list is a dynamic list in which each element is connected to two other elements instead 
of just one. The one before and the one after it. In this exercise, you must create a doubly-linked 
list using the “hospital and patients” example as a starting point.

1. Create the doubly-linked list and add several elements to it (around 10 is fine). 
2. Traverse it forwards and backwards printing out the content of each element.
3. Delete a couple of elements from the list.
4. Traverse it forwards and backwards printing out the content of each element.
5. Add a new element to the list. Try to delete an element that is NOT in the list. 
6. Traverse it forwards and backwards printing out the content of each element.

Hint: First you need to add a new field to Patient for the pointer going “backwards”. 
Then you need to modify the add and delete methods to make sure you do not have loose pointers.
 */


public class testPatDoubleLinkedList {

	private PatDoubleLinkList pHead;
	
	
	public static void main(String[] args) {
	
		testPatDoubleLinkedList tpd = new testPatDoubleLinkedList();
		tpd.launch();
	
	} // end main
	
	// LAUNCH
	// ======
	
	public void launch(){
		PatDoubleLinkList p1 = new PatDoubleLinkList("Stewart");
		PatDoubleLinkList p2 = new PatDoubleLinkList("John");
		PatDoubleLinkList p3 = new PatDoubleLinkList("Mike");
		PatDoubleLinkList p4 = new PatDoubleLinkList("David");
		PatDoubleLinkList p5 = new PatDoubleLinkList("Rob");
		PatDoubleLinkList p6 = new PatDoubleLinkList("Mark");
		PatDoubleLinkList p7 = new PatDoubleLinkList("Pascale");
		PatDoubleLinkList p8 = new PatDoubleLinkList("Jessica");
		PatDoubleLinkList p9 = new PatDoubleLinkList("Mary");
		PatDoubleLinkList p10 = new PatDoubleLinkList("Emma");
		
		// Launch
		// ------
		addHead(p1);
		
		// add Patients
		// ------------
		pHead.addPatient(p2);
		pHead.addPatient(p3);
		pHead.addPatient(p4);
		pHead.addPatient(p5);
		pHead.addPatient(p6);
		pHead.addPatient(p7);
		pHead.addPatient(p8);
		pHead.addPatient(p9);
		pHead.addPatient(p10);
		
		
		// Traverse Forwards
		// -----------------
		System.out.println("Traverse Forwards");
		pHead.printFwd();
		
		// Traverse Backwards
		// ------------------
		System.out.println();
		System.out.println("Traverse Backwards");
		pHead.printBack();
		
		// Count List
		// ----------
		int n = pHead.countIterative();
		System.out.println("\nCount in List: " + n);
		
		// Delete Patients 2,7,9
		// ---------------------

		pHead.deletePatient(p2);
		pHead.deletePatient(p7);
		pHead.deletePatient(p9);
		n = pHead.countIterative();
		System.out.println("\nDelete Patients p2, p7, p9:");
		pHead.printFwd();
		System.out.println();
		pHead.printBack();
		System.out.println("\nReCount After Delete: " + n);
		
		// Add Patient 2 back to Linked List
		// ---------------------------------
		pHead.addPatient(p2);
		System.out.println("\n Add P2 back to Linked List");
		pHead.printFwd();
		System.out.println();
		pHead.printBack();
		n = pHead.countIterative();
		System.out.println("\nReCount After New Addition: " + n);
		
		// Delete Header
		// -------------
		System.out.println("\n Delete Header");
		deleteHead();
		pHead.printFwd();
		System.out.println();
		pHead.printBack();
		n = pHead.countIterative();
		System.out.println("\nReCount After delete head: " + n);
		
		
		
	} // end Launch
	
	
	// ===========================================================
	
	// add Head
	// --------
	public void addHead(PatDoubleLinkList p){
		pHead = p;
	} 
	
	
	// delete Head
	// -----------	
	public void deleteHead(){
		PatDoubleLinkList p2 = pHead.getPatient(2);
		p2.unLinkBackPointer();  // unlink the backpointer before setting up as new head
		pHead = p2;
	} 

}
