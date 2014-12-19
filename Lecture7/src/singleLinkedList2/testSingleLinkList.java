/*
 * 3 Singly-linked lists
Create a linked list following the “hospital and patients” example of the notes:
1. Create the linked list and add several elements to it (around 10 is fine).
2. Go through the list printing out the content of each element.
3. Delete a couple of elements from the list.
4. Print the elements in the list again. Check that the deleted elements have been deleted. 
Check that you can delete the first element too.

Hint: Note that you cannot delete the first element from inside the list because you need to update
the pointer patientListStart. To add or delete the first element of a list, you must do it from outside
the list.

4 Queue length
Reuse the code of one of the dynamic list in the former exercise, and add a method that calculates 
the length of the list (maybe you have done this already).
Is it easy to do this both iteratively and recursively? Try both ways and see which is more 
natural for you. If one takes too long, try the other way.
 */


package singleLinkedList2;

public class testSingleLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testSingleLinkList sll = new testSingleLinkList();
		sll.launch();
	
	}
	
	public void launch(){
		
		
		// Load Patients
		// -------------
		Node p1 = new Node("Stewart");
		Node p2 = new Node("John");
		Node p3 = new Node("Michael");
		Node p4 = new Node("David");
		Node p5 = new Node("Robert");
		Node p6 = new Node("Mark");
		Node p7 = new Node("Pascale");
		Node p8 = new Node("Jessica");
		Node p9 = new Node("Mary");
		Node p10 = new Node("Emma");
		
		// Create List Object and Add Nodes
		// --------------------------------
		SingleLinkList s = new SingleLinkList();
		//q.getPatientData();
		s.setHead(p1);
		s.addNode(p2);
		s.addNode(p3);
		s.addNode(p4);
		s.addNode(p5);
		s.addNode(p6);
		s.addNode(p7);
		s.addNode(p8);
		s.addNode(p9);
		s.addNode(p10);
		
		// Print List
		// ----------
		s.printList();
		System.out.println("\nThe Number of Patients: "+ s.getNodeCount());
		
		// Delete Patients p2,p3, p9
		// -------------------------
		
		System.out.println("\nDelete Patients p2,p3,p9");
		s.deleteNode(p2);
		s.deleteNode(p3);
		s.deleteNode(p9);
		s.printList();
		
		System.out.println("\nThe Number of Patients after Delete: "+ s.getNodeCount());
		
		// Delete Head
		// -----------
		System.out.println("\nDelete Head!\n");
		s.deleteHead();
		s.printList();
		System.out.println("\nThe Number of Patients after Deleted Head: "+ s.getNodeCount());
		
	} // end launch

} // end class
