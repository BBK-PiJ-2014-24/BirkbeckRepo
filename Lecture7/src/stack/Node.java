package stack;

public class Node {
	
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
	
	public void setName(String n){
		name = n;
	}
	
	public Node getNextNode(){
		return nextNode;
	}
	
	public void setNextNode(Node n){
		nextNode = n;
	}
}
