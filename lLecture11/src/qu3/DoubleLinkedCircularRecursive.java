package qu3;

public class DoubleLinkedCircularRecursive<E> {

	// Fields
	// ------
	
	private E data;
	private DoubleLinkedCircularRecursive<E> nextNode;
	private DoubleLinkedCircularRecursive<E> prevNode;
	
	
	
	// Constructor
	// -----------
	public DoubleLinkedCircularRecursive(E e){
		data = e;
		nextNode = null;
		prevNode = null;
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
	
	// count()
	// -------
	
	public int count(){
		if(this.nextNode==null)
			return 1;
		else
			return 1 + this.nextNode.count();
	}
	
	
	// add()
	// -----
	
	public void add(E e){
		
		if(this.getNextNode()==null){
			DoubleLinkedCircularRecursive<E> n = new DoubleLinkedCircularRecursive<E>(e);
			this.setNextNode(n);
			n.setPrevNode(this);
		}
		else
			this.getNextNode().add(e);
	} // end add

	
	public void delete(int index){
		int countNodes = count();
		if(index<0 || index > countNodes-1 ){
			System.out.println("Invalid Index");
		}
		else if(index>0)
			this.getNextNode().delete(index-1);
		else{
			DoubleLinkedCircularRecursive<E> x = this.prevNode;
			DoubleLinkedCircularRecursive<E> y = this.nextNode;
			x.setNextNode(y);
			y.setPrevNode(x);
		}
	}
	
}  // end class
