package listUtilities;

public class Node {
	
	private int x;
	private Node nextNode;
	
	// Constructor
	// -----------
	
	public Node(int x){
		this.x = x;
		nextNode = null;
	}
	
	// getter/setter
	// -------------
	
	public int getInt(){
		return x;
	}
	
	public void setInt(int n){
		x = n;
	}
	
	public Node getNextNode(){
		return nextNode;
	}
	
	public void setNextNode(Node n){
		nextNode = n;
	}
}
