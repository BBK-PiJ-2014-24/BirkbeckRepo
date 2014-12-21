package qu3;

public class Node<E> {
	
	// Fields
	// ------
	
	private E data ;
	private Node<E> nextNode;
	private Node<E> prevNode;
	
	
	// Constructors
	// ------------
	public Node(E d){
		data = d;
	}
	
	
	// getter/setter
	// -------------
	
	public E getData(){
		return data;
	}

}  // end Class
