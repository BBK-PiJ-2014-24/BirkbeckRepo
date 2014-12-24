package qu3;

public class DoubleLinkedList <E>{
	
	// Fields
	// ------
	
	Node<E> head;
	int countNodes;
	
	
	// Constructors
	// ------------
	
	public DoubleLinkedList(){
		countNodes = 0;
	}
	
	// getter/setter
	// -------------
	
	public Node<E> getHead(){
		return head;
	}
	
	public void setHead(Node h){
		if(countNodes==0)
			head = h;
		else{
			h.setNextNode(head);
			h.setPrevNode(null);
			head.setPrevNode(h);
			head = h;
		}
	}
	
	public int count(){
		return countNodes;
	}
	
	
	// addNode()
	// ---------

	public void addNode(Node a){
		Node n = head;
		while(n.getNextNode()!= null)
			n = n.getNextNode();
		n.setNextNode(a);
		a.setPrevNode(n);
	}
	
	// deleteNode()
	// ------------
	
	
	
	
}
