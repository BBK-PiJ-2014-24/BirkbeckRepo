package circularLinkedList2;

public class CircularLinkList {

	// Properties
	// ----------
	private Node head;
	private int countNode;
	
	// Constructor
	// -----------
	public CircularLinkList(){
		head = null;
		countNode = 0;
	}
	
	// getter/setter
	// -------------
	public Node getHead(){
		return head;
	}
	
	public void setHead(Node h){  // set head requires	
		head = h;        		 // 1) add Node
		head.setNextNode(head);	 // 2) set head pointer (to head)
		countNode++;			 // 3) increase count++
	}							 // n.b set Head Can Only Be USED Once.
	
	public void deleteHead(){
		Node n2 = head.getNextNode();
		head = n2;
		countNode--;
	}
	
	public int getNodeCount(){
		return countNode;
	}
	
	
	// addNode()
	// ---------
	
	public void addNode(Node a){
		a.setNextNode(null);
		Node n = head;
	
		while(n.getNextNode()!= head){
			n = n.getNextNode();
		}
		n.setNextNode(a);
		a.setNextNode(head);
		countNode++;
	} // end Add
	
	
	// deleteNode()
	// ------------
	
	public boolean deleteNode(Node d){
		
		Node n = head;
		while(n.getNextNode()!=head){
			if(n.getNextNode().equals(d)){
				n.setNextNode(n.getNextNode().getNextNode());
				countNode--;
				return true;
			}
			else 
				n = n.getNextNode();
		} // end while
		return false;
	} // end delete
	
	
	// printList()
	// -----------
	public void printList(){
		Node n = head;
		for(int i=0;i<countNode;i++){
			System.out.println(n.getName());
			n = n.getNextNode();
		}
	}  // endPrint
	
	// 
	
	
}
