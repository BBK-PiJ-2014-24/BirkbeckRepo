package circularLinkedList2;

public class testCircularLinkList {

	public static void main(String[] args){
		testCircularLinkList tcl = new testCircularLinkList();
		tcl.launch();
		
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
				CircularLinkList c = new CircularLinkList();
				//q.getPatientData();
				c.setHead(p1); 
				c.addNode(p2);
				c.addNode(p3);
				c.addNode(p4);
				c.addNode(p5);
				c.addNode(p6);
				c.addNode(p7);
				c.addNode(p8);
				c.addNode(p9);
				c.addNode(p10);
				
				// Print List
				// ----------
				c.printList();
				System.out.println("\nThe Number of Patients: "+ c.getNodeCount());
				
				// Delete Patients p2,p3, p9
				// -------------------------
				
				System.out.println("\nDelete Patients p2,p3,p9");
				c.deleteNode(p2);
				c.deleteNode(p3);
				c.deleteNode(p9);
				c.printList();
				
				System.out.println("\nThe Number of Patients after Delete: "+ c.getNodeCount());
				
				// Delete Head
				// -----------
				System.out.println("\nDelete Head!\n");
				c.deleteHead();
				c.printList();
				System.out.println("\nThe Number of Patients after Deleted Head: "+ c.getNodeCount());
				
			
			} // end launch
} // end class
