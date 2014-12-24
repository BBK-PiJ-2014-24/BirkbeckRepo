package qu3;

public class TestList {

	public static void main(String[] args) {
		
		DoubleLinkedList<String> d = new DoubleLinkedList<String>();
		
		Node<String> n1 = new Node<String>("Hello");
		Node<String> n2 = new Node<String>("World");
		Node<String> n3 = new Node<String>("This");
		Node<String> n4 = new Node<String>("is");
		Node<String> n5 = new Node<String>("Java");
		
		
		d.setHead(n1);;
		d.addNode(n2);
		d.addNode(n3);
		d.addNode(n4);
		d.addNode(n5);
		
		d.deleteNode(2);
		d.deleteNode(3);
		
		d.count();

	}

}
