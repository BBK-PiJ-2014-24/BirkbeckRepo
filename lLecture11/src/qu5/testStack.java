package qu5;

public class testStack {

	public static void main(String[] args) {
		Node<Integer> n0 = new Node<Integer>(0);
		Node<Integer> n1 = new Node<Integer>(1);
		Node<Integer> n2 = new Node<Integer>(2);
		Node<Integer> n3 = new Node<Integer>(3);
		Node<Integer> n4 = new Node<Integer>(4);
		Node<Integer> n5 = new Node<Integer>(5);
		
		GenericStack<Integer> s = new GenericStack<Integer>();
		System.out.println("isEmpty: " + s.isEmpty());
		s.push(n0);
		s.push(n1);
		s.push(n2);
		s.push(n3);
		s.push(n4);
		s.push(n5);
		s.printStack();
		
		System.out.println();
		s.pop();
		s.pop();
		s.printStack();
		
		
		// Test <E extends Number>
		// -----------------------
		
	//	GenericStack<String> strStack = new GenericStack<String>();  WON'T WORK
		

	}

}
