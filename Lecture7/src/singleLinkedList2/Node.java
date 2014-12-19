package singleLinkedList2;

public class Node {

	
	private String name;
	private Node nextNode;
	
	
	// Construtors
	// -----------
	public Node(String n){
		name = n;
		Node nextNode = null;
	}
	
	// getter/setter
	// -------------
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setNextNode(Node d){
		nextNode = d;
	}
	
	public Node getNextNode(){
		return nextNode;
	}
}
