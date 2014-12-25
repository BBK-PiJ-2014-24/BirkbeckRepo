package qu3;

public class DoubleLinkedCircularRecursive<E> {

	// Fields
	// ------
	
	private E data;
	private DoubleLinkedCircularRecursive<E> nextNode;
	private DoubleLinkedCircularRecursive<E> prevNode;
	private int countNodes;
	
	
	// Constructor
	// -----------
	public DoubleLinkedCircularRecursive(E e){
		data = e;
		nextNode = null;
		prevNode = null;
		countNodes = 0;
	}
	
	// getter/setter
	// --------------
	
	public DoubleLinkedCircularRecursive<E> getNextNode(){
		return nextNode;
	}
	
	public void setNextNode(DoubleLinkedCircularRecursive<E> n){
		nextNode = n;
	}
	
	public DoubleLinkedCircularRecursive<E> getPrevNode(){
		return prevNode;
	}
	
	public void setPrevNode(DoubleLinkedCircularRecursive<E> n){
		prevNode = n;
	}
	
	// add()
	// -----
	
	public void add(E e){
		
		if(this.getNextNode()==null){
			DoubleLinkedCircularRecursive<E> n = new DoubleLinkedCircularRecursive<E>(e);
			this.setNextNode(n);
			n.setPrevNode(this);
		}
		else{
			this.getNextNode().add(e);
		}
	} // end add
	
}  // end class
