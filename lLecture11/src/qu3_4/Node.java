package qu3_4;

/* Generic parameter type, T, is used to turn the Node Class Generic.
*  
*/

public class Node<E> implements Comparable <E> {   // Use <E>, E standing for Element used in Java Collections
	
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
	
	public int compareTo(E otherE){
		return 0;
	}

/*
	public int compareTo(E otherE){
		if(this.data > otherE)
			return 1;
		else if(this.data < otherNode.data)
			return -1;
		else
			return 0;	
	}

	public int compareTo(Object o){
		E other = (E) o;
		if
		
	}
*/	
}  // end Class
