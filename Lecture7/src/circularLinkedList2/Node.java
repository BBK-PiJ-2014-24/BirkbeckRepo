package circularLinkedList2;


public class Node{
	
	private String name;
	private Node nextNode;
	
	
	
	// Constructor
	// -----------
	public Node(String name){
		this.name = name;
		nextNode = null;
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
	
} // end class
