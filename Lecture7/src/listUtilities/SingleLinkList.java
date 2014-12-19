// This Linked List Works for Nodes with int data

package listUtilities;

public class SingleLinkList {
	
	private Node head;
	private int nodeCount;

	// Constructor
	// ----------
	
	public SingleLinkList(){
		head = null;
		nodeCount = 0;
	}
	
	// getter/Setter
	// -------------
	
	public Node getHead(){
		return head;
	}
		
	public void setHead(Node n){
		head = n;
		nodeCount++;
	}
	
	// Overload setHead, giving the option not to increase count.
	// used when changing head with another node.
	public void setHead(Node n, boolean addCount){
		head = n;
		if(addCount)
			nodeCount++;			
	}
	
	public int getNodeCount(){
		return nodeCount; 
	}
	
	// deleteHead()
	// ------------
	
	public void deleteHead(){
		Node n = head.getNextNode();
		head = n;
		nodeCount--;
	}
	
		
	// addNode()
	// ---------
	
	public void addNode(Node newNode){
		newNode.setNextNode(null); // ensure pointer is null
		
		Node n = head;  
		while(n.getNextNode()!=null){
			n = n.getNextNode();
		}
		n.setNextNode(newNode);
		nodeCount++;
	}
	
	// deleteNode
	// ----------
	
	public boolean deleteNode(Node oldNode){
		Node n = head;
		int index = 1;
			while(index<nodeCount){
				if(n.getNextNode().equals(oldNode)){
					n.setNextNode(n.getNextNode().getNextNode());
					nodeCount--;
					return true;
				}
				else
					n=n.getNextNode();
					index++;		
			}
			return false;
	} // end delete
	
	// insert()
	// --------
	
	public void insert(Node a, int i){
		Node n = head;
		if(i==1){
			Node h = head; // set copy of h
			setHead(a);    // set a as new head
			a.setNextNode(h);  // set a to point to old head
		}
		else{
			for(int x=1; x<i-1; x++){
				n=n.getNextNode();
			}
			a.setNextNode(n.getNextNode());   // LINK NEW NODE WITH ITS POINTER FIRST
			n.setNextNode(a);                 // THEN YOU CAN POINT TO NEW NODE	
			nodeCount++;
		}
	}// end insert
	
	

	// printList()
	// -----------
	
	public void printList(){
		Node n = head;
		for(int i=0;i<nodeCount;i++){
			System.out.println(n.getInt());
			n = n.getNextNode();
		} // end loop
		System.out.println("\n");
	}
	
	
	
}// end class}
