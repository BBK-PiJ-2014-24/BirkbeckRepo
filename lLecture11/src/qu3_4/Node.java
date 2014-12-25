package qu3_4;

/* Generic parameter type, T, is used to turn the Node Class Generic.
*  
*/

public class Node<E> {   // Use <E>, E standing for Element used in Java Collections
	
	// Fields
	// ------
	
	private E data ;
	private Node<E> nextNode;   // Note the reference variable of a generic is called Node<E>
	private Node<E> prevNode;
	
	
	// Constructors
	// ------------
	public Node(E d){
		data = d;
		nextNode = null;
		prevNode = null;
	}
	
	
	// getter/setter
	// -------------
	
	public E getData(){
		return data;

	}
	
	public void setNextNode(Node n){
		nextNode = n;
	}
	
	
	public Node getNextNode(){
		return nextNode;
	}
	
	
	
	public void setPrevNode(Node n){
		prevNode = n;
	}
	
	
	public Node getPrevNode(){
		return prevNode;
	}

}  // end Class
