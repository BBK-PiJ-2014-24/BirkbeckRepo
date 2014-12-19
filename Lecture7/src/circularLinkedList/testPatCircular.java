package circularLinkedList;

/*
 * 6 Circular lists
 * ================
A circular list is a dynamic list in which there is a beginning but there is no end: the last element
is pointing back to the first element. Circular lists can be singly- or doubly-linked. In this 
exercise, you must create a singly-linked circular list using the “hospital and patients” example as a
 starting point.
 
1. Create the circular list and add several elements to it (around 10 is fine).
2. Traverse it forwards for one complete loop. While you go around the list, print out the content 
of each element. How do you know that you have reached the end of the list when you never find 
a null pointer?
3. Delete a couple of elements from the list.
4. Traverse it again printing out the content of each element.
5. Add a new element to the list. Try to delete an element that is NOT in the list.
6. Traverse it again printing out the content of each element.
 */
public class testPatCircular {

private PatCircular pHead;	
	
	public static void main(String[] args) {
		// Initializations and Declarations
		// --------------------------------
		testPatCircular tpc = new testPatCircular();
		tpc.launch();
	
	} // end main
	
	// LAUNCH
	// ------
	public void launch(){
		
		// Add Patients
		// ------------
		PatCircular p1 = new PatCircular("Stewart");
		PatCircular p2 = new PatCircular("John");
		PatCircular p3 = new PatCircular("Mike");
		PatCircular p4 = new PatCircular("David");
		PatCircular p5 = new PatCircular("Rob");
		PatCircular p6 = new PatCircular("Mark");
		PatCircular p7 = new PatCircular("Pascale");
		PatCircular p8 = new PatCircular("Jessica");
		PatCircular p9 = new PatCircular("Mary");
		PatCircular p10 = new PatCircular("Emma");
		PatCircular p11 = new PatCircular("Jack");
		
		// addHead
		// -------
		this.addHead(p1);
		
		// addPatients
		// -----------
		pHead.addPatient(p2); // nb.if in static main must use tpc.pHead and not just pHead as 
		pHead.addPatient(p3); // pHead needs a handle.
		pHead.addPatient(p4);
		pHead.addPatient(p5);
		pHead.addPatient(p6);
		pHead.addPatient(p7);
		pHead.addPatient(p8);
		pHead.addPatient(p9);
		pHead.addPatient(p10);
	
		// printList
		// ---------
		pHead.printFwd();
		int n = pHead.countList();
		System.out.println("The Number of Patients: " + n);
		
		// Delete p2 and p3
		// ----------------
		pHead.deletePatient(p2);
		pHead.deletePatient(p3);
		System.out.println("\nDelete Files 2 and 3");
		pHead.printFwd();
		n = pHead.countList();
		System.out.println("The Number of Patients After deletion: " + n);
		
		// Try to Delete Patient, p11, Not On List
		// ----------------------------------------
		
		pHead.deletePatient(p11);
		System.out.println("\nTry to Delete Patient, p11, Not On List...");
		System.out.println("...Nothing Happens");
		
		// Now Add p11 to List
		// -------------------
		
		System.out.println("\nNow Add to p11 to List");
		pHead.addPatient(p11);
		pHead.printFwd();
		n = pHead.countList();
		System.out.println("The Number of Patients After New Addition: " + n);
		
		
		
	} // end launch
	
	// --------------------------------------------------------------
	// addHead
	// -------
	public void addHead(PatCircular p){
		p.setHeadFlag(true);
		p.setPointer(p);
		this.pHead = p;
	}
	
	// deleteHead
	// ----------
	public void deleteHead(){
		pHead.setHeadFlag(false);  // Remove old pHead of its flag
		PatCircular p2 = pHead.getPatient(2);
		p2.setHeadFlag(true);
		pHead = p2;
	}
	
	

}
