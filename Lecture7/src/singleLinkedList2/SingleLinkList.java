package singleLinkedList2;

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
	
	

	// printList()
	// -----------
	
	public void printList(){
		Node n = head;
		for(int i=0;i<nodeCount;i++){
			System.out.println(n.getName());
			n = n.getNextNode();
		} // end loop
	}
	
	
	
}// end class
