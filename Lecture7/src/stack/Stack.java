/*
 * 
 * 8. STACKS
 * A stack is a dynamic structure that implements these methods:
 
push(...) inserts an element at the beginning of the stack.

pop(...) remove an element from the beginning of the stack.

empty(...) returns true if there are no elements on the stack, false otherwise.

Stacks are heavily used in computing. The method call stack that stores the variables for each method 
in a program is just one well-known example.Implement a stack of integers. This could represent 
requests to a hard drive to read from different sectors. Implement the three methods listed above.
Then write another class that creates a stack, and makes several push(), and pop() calls. Make sure 
you check the size of the stack before popping elements out. Check that the values you get are 
consistent. The output of the program could look like this:
 */
package stack;

public class Stack {
	
	// Fields
	// ------
	private Node head;
	private int countNode;
	
	
	// Constructor
	// -----------
	public Stack(){
		head = null;
		countNode = 0;
	}
	
	// getter/setter
	// -------------
	public Node getHead(){
		return head;
	}
	
	public void setHead(Node h){
		head = h;
		countNode++;
	}
	
	public int getCountNode(){
		return countNode;
	}
	
	
	// push()
	// ------
	
	public void push(Node h){
		h.setNextNode(head); // new head points to old head
		head = h;
		countNode++;
	}
	
	
	
	// pop()
	// -----
	public void pop(){
		Node n = head.getNextNode(); // get the Node Under Head
		head = n;
		countNode--;
	}
	
	
	
	// empty()
	// -------
	
	public boolean empty(){
		if(head== null)
			return true;
		else
			return false;
	}
	
	// printStack()
	// ------------
	
	public void printStack(){
		Node n = head;
		while(n.getNextNode()!=null){
			System.out.println(n.getName());
			n=n.getNextNode();
		}
		System.out.println(n.getName());
	}

} // end class
