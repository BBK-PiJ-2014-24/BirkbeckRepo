package doubleLinkedList2;

public class Node {
	
	private String name;
	private Node nextNode;
	private Node prevNode;
	
	
	// Constructor
	// -----------
	public Node(String name){
		this.name = name;
		nextNode = null;
		prevNode = null;
	}
	
	// getter/setter
	// -------------
	public String getName(){
		return name;
	}
	
	public void setName(String s){
		name = s;
	}
	
	public Node getNextNode(){
		return nextNode;
	}
	
	public void setNextNode(Node n){
		nextNode = n;
	}
	
	public Node getPrevNode(){
		return prevNode;
	}
	
	public void setPrevNode(Node p){
		prevNode = p;
	}
	
	
	
} // end class
