package stack;

public class testStack {

	public static void main(String[] args) {
		
		testStack ts = new testStack();
		ts.launch();

	} // end main main 
	
	public void launch(){
		
		Stack s = new Stack();
		
		Node p1 = new Node("Stewart 1");
		Node p2 = new Node("John 2");
		Node p3 = new Node("Michael 3");
		Node p4 = new Node("David 4");
		Node p5 = new Node("Robert 5");
		Node p6 = new Node("Mark 6");
		Node p7 = new Node("Pascale 7");
		Node p8 = new Node("Jessica 8");
		Node p9 = new Node("Mary 9");
		Node p10 = new Node("Emma 10");
		Node p11 = new Node("Maggie 11");
		Node p12 = new Node("Portia 12");
		
		// load stack
		// ----------
		s.push(p1);
		s.push(p2);
		s.push(p3);
		s.push(p4);
		s.push(p5);
		s.push(p6);
		s.push(p7);
		s.push(p8);
		s.push(p9);
		s.push(p10);
		
		
		s.printStack();
		System.out.println("Size of Stack: " + s.getCountNode());
		
		// pop stack
		// --------
		System.out.println("\nPop 2 Off Stack");
		s.pop();
		s.pop();
		s.printStack();
		System.out.println("\nSize of Stack After 2 pops: " + s.getCountNode());
		
		// Add two back to Stack
		// ---------------------
		
		System.out.println("\nPush two ps back on the stack");
		s.push(p11);
		s.push(p12);
		s.printStack();
		System.out.println("\nSize of Stack After 2 pushes: " + s.getCountNode());
		
		
		
	} // end launch

}
