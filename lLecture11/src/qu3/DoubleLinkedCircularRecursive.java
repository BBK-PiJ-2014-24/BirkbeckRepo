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

	// delete()
	// --------
	
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
	} // end delete
	
	// printFwd()
	// ----------
	
	public void printFwd(){
		if(this.getNextNode()!=null){
			System.out.println(this.data);
			this.getNextNode().printFwd();
		}
	} // end printFwd
	
	// printBack()
	// -----------
	
	public void printBack(){
		int countNodes = count();
		DoubleLinkedCircularRecursive<E> n = this;
		for(int i=0;i<countNodes-1;i++)
			n = n.getNextNode();
		while(n.prevNode!=null){
			System.out.println(n.data);
			n = n.prevNode;
			}
			
	} // end printFwd
	
}  // end class
