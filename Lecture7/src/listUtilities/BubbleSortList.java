package listUtilities;

public class BubbleSortList {

	// Fields
	// ------
		 Node head;
		 int countNodes;
	
	// Constructors
	// ------------
		 public BubbleSortList(){
			 head = null;
			 countNodes = 0;		 
		 }
	
	// getter/setter
	// -------------
		 public Node getHead(){
			 return head;
		 }
		 
		 public void setHead(Node n){
			 head = n;
			 countNodes++;
		 }
	 
		 public int size(){
			 return countNodes;
		 }
	// 
	
	// deleteHead
	// ----------
		 
		 public void deleteHead(){
			 Node n;
			 n = head.getNextNode();
			 head = n;
			 countNodes--;
		 }
		 
		 
	// addNode
	// -------
		 public void addNode(Node a){
			 Node n = head;
			 while(n.getNextNode()!=null){
				 n = n.getNextNode();
			 }
			 n.setNextNode(a);
			 countNodes++;
		 }
		 
	// **** sort ****
	// --------------
	
		 public void sort(){
			 int swap = 0;
			 boolean endSort = false;
			 while(!endSort){
				 Node n = head;
				 Node prevN=head;
				 for(int i=0; i<countNodes-1;i++){
					 Node x = n;
					 Node y = n.getNextNode();
					 if(x.getInt()<y.getInt()){   // if x<y, swap
						 Node t = x;
						 x.setNextNode(y.getNextNode());
						 y.setNextNode(t);
						 if(i==0)
							 head = y;
						 else
							 prevN.setNextNode(y);
						 swap++;
						 prevN = y;				// *** previous Node is now Y!!***
						 n = y.getNextNode();
					 } //end if
					 else{
						 prevN = n;
						 n = n.getNextNode();
						 }
				 } // end for loop
				 if(swap>0)
					 swap=0;
				 else
					 endSort = true;
			 } // end outer while
		 }  //end BubbleSort
		 
		 
	// printList()
	// -----------	 
		 
		 public void printList(){
			 Node n = head;
			 while(n!=null){
				 System.out.println(n.getInt());
				 n = n.getNextNode();
			 }
			 System.out.println("\n");
		 }
	
} // end Class
