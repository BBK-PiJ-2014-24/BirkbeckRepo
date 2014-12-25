package qu3_4;

public class SortedList<E> extends DoubleLinkedList<E> {

	
	// Constructor
	// -----------
	public SortedList(){
		super();
	}
	
	// addNode()
	// ---------
	@Override
	public void addNode(Node<E> a){
		Node<E> x = super.head;
		while(a.getData()>x.getData()){
			x = x.getNextNode();
		}
		Node<E> y = x.getNextNode().getNextNode();
		x.setNextNode(a);
		a.setPrevNode(x);
		a.setNextNode(y);
		y.setPrevNode(a);
	}
	
}
