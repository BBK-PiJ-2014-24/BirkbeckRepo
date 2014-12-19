/*
 * 7 Queues (*)
A queue is a dynamic structure that implements these methods:

insert(...) inserts an element at the beginning of the queue. 

retrieve(...) remove an element from the end of the queue. 

size() returns the current size of the queue.

Queues are heavily used in computing: communication buffers, incoming request to web servers, 
read/write requests to hard disks, etc.
Implement a queue of integers. This could represent requests to a hard drive to read from different
sectors. Implement the three methods listed above.
Then write another class that creates a queue, and makes several insert(), retrieve(), and size() calls.
Check that the values you get are consistent. The output of the program could look like this:
 */


package queue;

public class Queue {
	
	private Node head;
	private int countNode;
	
	// Constructor
	// -----------
	public Queue(){
		head = null;  // the head's pointer is already pointing to null
		countNode=0;
	}
	
	// getter/setter
	// -------------
    // None required as insert() = setHead()s + addNode()
	// and getCountNode = size();
	
	// size()
	// ------
	public int size(){
		return countNode;
	}

	
	// insert()
	// --------
	
	public void insert(Node h){
		h.setNextNode(head); // Prepare new head's pointer. The new head points to old head!!
		head = h;
		countNode++;
	}
	
	
	// retrieve()
	// ----------
	
	public void retrieve(){
		Node n = head;
		while(n.getNextNode().getNextNode()!=null)
			n= n.getNextNode();
		n.setNextNode(null);
		countNode--;
	}// end retrieve
	
	
	// printQ()
	// --------
	
	public void printQ(){
		Node n = head;
		while(n.getNextNode()!=null){
			System.out.println(n.getName());
			n = n.getNextNode();
		}
		System.out.println(n.getName()); // Last item always missing so need to add
	}

} // end class
