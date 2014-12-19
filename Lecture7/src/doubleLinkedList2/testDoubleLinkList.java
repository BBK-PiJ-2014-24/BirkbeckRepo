package doubleLinkedList2;

public class testDoubleLinkList {

	public static void main(String[] args) {
		
		testDoubleLinkList tdl = new testDoubleLinkList();
		tdl.launch();
		
	} // end main

public void launch(){
		
		// Load Patients
		// -------------
		Node p1 = new Node("Stewart 1");
		Node p2 = new Node("John 2");
		Node p3 = new Node("Michael 3");
		Node p4 = new Node("David 4");
		Node p5 = new Node("Robert 5");
		Node p6 = new Node("Mark 6");
		Node p7 = new Node("Pascale 7");
		Node p8 = new Node("Jessica 8");
		Node p9 = new Node("Mary 9");
		Node p10 = new Node("Emma 10");
		
		// Create List Object and Add Nodes
		// --------------------------------
		DoubleLinkList d = new DoubleLinkList();
		//q.getPatientData();
		d.setHead(p1);
		d.addNode(p2);
		d.addNode(p3);
		d.addNode(p4);
		d.addNode(p5);
		d.addNode(p6);
		d.addNode(p7);
		d.addNode(p8);
		d.addNode(p9);
		d.addNode(p10);
		
		// Print List
		// ----------
		d.printListFwd();
		System.out.println();
		d.printListBackwd();
		System.out.println("\nThe Number of Patients: "+ d.getCountNode());
		
		// Delete Patients p2,p3, p9
		// -------------------------
		
		System.out.println("\nDelete Patients p2,p3,p9");
		d.deleteNode(p2);
		d.deleteNode(p3);
		d.deleteNode(p9);
		d.printListFwd();
		System.out.println();
		d.printListBackwd();
		
		System.out.println("\nThe Number of Patients after Delete: "+ d.getCountNode());
		
		// Delete Head
		// -----------
		System.out.println("\nDelete Head!\n");
		d.deleteHead();
		d.printListFwd();
		System.out.println();
		d.printListBackwd();
		System.out.println("\nThe Number of Patients after Deleted Head: "+ d.getCountNode());
		
	} // end launch

} // end class
