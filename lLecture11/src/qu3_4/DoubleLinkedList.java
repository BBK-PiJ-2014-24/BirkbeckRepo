package qu3_4;

public class DoubleLinkedList <E>{
	
	// Fields
	// ------
	
	private Node<E> head;
	private int countNodes;
	
	
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
	
	public void setHead(Node<E> h){
		if(countNodes==0)
			head = h;
		else{
			h.setNextNode(head);
			h.setPrevNode(null);
			head.setPrevNode(h);
			head = h;
		}
		countNodes++;
	}
	
	public int count(){
		return countNodes;
	}
	
	
	// addNode()
	// ---------

	public void addNode(Node<E> a){
		Node<E> n = head;
		while(n.getNextNode()!= null)
			n = n.getNextNode();
		n.setNextNode(a);
		a.setPrevNode(n);
		countNodes++;
	}
	
	// deleteNode()
	// ------------
	
	public void deleteNode(int index){
		
		if(index < 0 || index > countNodes-1)
			System.out.println("Invalid index");
		else if(index==0){
			head = head.getNextNode();
			countNodes--;	
		}
		else{
			Node<E> n = head;               // if delete head
			 for(int i=0; i<index-1;i++){
				 n = n.getNextNode();
			 }
			 if(n.getNextNode().getNextNode()==null){			// if delete tail
				 n.setNextNode(null);
			 }
			 else{								// deleted Node in middle of list
				 Node<E> m = n.getNextNode().getNextNode();
				 n.setNextNode(m);
				 m.setPrevNode(n);
			 }
			 countNodes--;
		} // end else
	}  // end delete()
	
	
	
	
}
