package qu3;

public class TestList {

	public static void main(String[] args) {
		
		DoubleLinkedList d = new DoubleLinkedList();
		
		Node n1 = new Node("Hello");
		Node n2 = new Node("World");
		Node n3 = new Node("This");
		Node n4 = new Node("is");
		Node n5 = new Node("Java");
		
		
		d.setHead(n1);;
		d.addNode(n2);
		d.addNode(n3);
		d.addNode(n4);
		d.addNode(n5);

	}

}
