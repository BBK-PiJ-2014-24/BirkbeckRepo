/*
 * 5 Generic stack
 * Create a generic stack (with methods for pushing, poping, and checking emptiness) that only works 
 * with classes that extend Number (e.g. Integer and Double, but not String).
 */

package qu5;

public class GenericStack<E> {
	
	// Fields
	// ------
	private Node<E> top;
	private int countNodes;
	
	
	// Constructor
	// -----------
	public GenericStack(){
		top = null;
		countNodes = 0;
	}
	
	// getter/Setter
	// -------------
	
	public Node<E> getTop(){
		return top;
	}
	
	public void setTop(Node<E> n){
		top = n;
	}
	
	public int count(){
		return countNodes;
	}
	
	
	// push()
	// ------
		
	public void push(Node<E> e){
		e.setNextNode(top);
		top = e;
		countNodes++;
	}
	
	
	// pop()
	// -----
	
	public void pop(){
		Node<E> n = top.getNextNode();
		top = n;
	}
	
	
	// isEmpty()
	// ---------
	public boolean isEmpty(){
		if(top==null)
			return true;
		else
			return false;
	}
	
	
	// printStack()
	// ------------

	public void printStack(){
		Node<E> n = top;
		while(n!=null){
			System.out.println(n.getData());
			n = n.getNextNode();
		}		
	}
	
	
	
}
