package doubleLinkedList2;

public class DoubleLinkList {

	private Node head;
	private int countNode;
	

	// Constructor
	// -----------
	public DoubleLinkList(){
		head = null;
		countNode = 0;
	}
	
	// getter/setter
	// -------------
	
	public int getCountNode(){
		return countNode;
	}
	
	public Node getHead(){
		return head;
	}
	
	public void setHead(Node n){
		head = n;
		countNode++;
	}
	
	public void deleteHead(){
		Node n = head.getNextNode();
		n.setPrevNode(null);  // set the new head's prev pointer to null
		head = n;
		countNode--;
	}
	
	// addNode()
	// ---------
	
	public void addNode(Node p){ 
		p.setNextNode(null);  // clean any old pointers
		Node n = head;
		while(n.getNextNode()!=null)
			n = n.getNextNode();
		n.setNextNode(p);
		p.setPrevNode(n);
		countNode++;
	} // end add 
	
	// deleteNode()
	// ------------
	public boolean deleteNode(Node d){
		Node n = head;
		while(n.getNextNode()!=null){
			if(n.getNextNode().equals(d)){
				n.setNextNode(n.getNextNode().getNextNode());
				n.getNextNode().setPrevNode(d.getPrevNode());
				countNode--;
				return true;
			} // end if
				else
					n=n.getNextNode();	
			} // end While
		return false;
	} // end delete
	
	// printListFwd
	// ------------
	
	public void printListFwd(){
		Node n = head;
		for(int i=0; i<countNode;i++){
			System.out.println(n.getName());
			n = n.getNextNode();
		}
	}
	
	public void printListBackwd(){
		Node n = head;
		while(n.getNextNode()!=null)
			n= n.getNextNode();    // scroll fwd
		
		for(int i=countNode;i>=1;i--){
			System.out.println(n.getName());
			n = n.getPrevNode();
		}
	}
	

} //end class
	

