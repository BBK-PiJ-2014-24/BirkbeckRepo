package queue;

public class testQueue {

	public static void main(String[] args) {
		testQueue tq = new testQueue();
		tq.launch();
	}// end main

	public void launch(){
		
		Queue q = new Queue();
		
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
		
		// load Queue
		// ----------
		q.insert(p1);
		q.insert(p2);
		q.insert(p3);
		q.insert(p4);
		q.insert(p5);
		q.insert(p6);
		q.insert(p7);
		q.insert(p8);
		q.insert(p9);
		q.insert(p10);
		
		q.printQ();
		System.out.println("The Number in the Queue: "+ q.size());
		
		System.out.println("\nRetrieve p1, p2 from the queue from the front of queue");
		q.retrieve();
		q.retrieve();
		q.printQ();
		System.out.println("\nThe Number in the Queue: "+ q.size());
		
	} // end launch
	
} // end class
