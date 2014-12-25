package qu5;

public class Node<E> {
	
	// Fields
	// ------
	private E data;
	private Node<E> nextNode;

	// Constructor
	// -----------
	
	public Node(E e){
		data = e;
		nextNode = null;
	}
	
	// getter/setter
	// -------------
	
	public E getData(){
		return data;
	}
	
	public Node<E> getNextNode(){
		return nextNode;
	}
	
	public void setNextNode(Node<E> n){
		nextNode = n;
	}
	
}
