package map;

import singleLinkedList2.SingleLinkList;
import singleLinkedList2.Node;

public class MyHash implements HashInterface {

	// Fields
	// ------
	private int[] keyArray;
	private SingleLinkList[] listArray;
	private int size;
	private int index;
	
	// Constructors
	// ------------
	
	public MyHash(int size){
		keyArray = new int[size];
		listArray = new SingleLinkList[size];      /// **** Initialize the SingleLinkListArray ITSLEF.
		for(int i=0;i<size;i++)
			listArray[i] = new SingleLinkList();  // **** HAVE TO INITIALIZE ELEMENTS of SingleLinkList Array
		this.size = size;
		index = 0;
	}
	
	
	// Getter/Setter
	// -------------
	
	
	// put()
	// -----
	@Override
	public void put(int key, String name) {
		int i=0;
		Node n = new Node(name);    // Create a Node for insertion in Linked List
		
		while(i<index ){
			if(key!=keyArray[i]) // If key not found yet
				i++;
			else{				// If key found	
				if(listArray[i].getNodeCount()>0){  // if linked list already exists at i, add()
					listArray[i].addNode(n);
					break;
				}
				else{
					listArray[i].setHead(n); // if linked list does NOT exist at i, setHead()
					break;
				}
			} // end else
		} // end while
		if(i==index)  // If KEY not found through search 
			listArray[index].setHead(n); // Add a new index and a new Linked List
		
		keyArray[i] = key; // Whatever i, set keyArray
		index++;  // INCREMENT INDEX
	}

	
	// get()
	// -----
	@Override
	public String[] get(int key) {
		
		int i=0;
		String[] s;
		
		while(i<index){
			if(key!=keyArray[i])   //If not Found key yet
				i++;
			else{				   // If found the key	
				Node n = listArray[i].getHead();
				int length = listArray[i].getNodeCount(); // check size of linked list
				int j=0;
				s = new String[length];  // prepare String Array 
				
				while(n!=null){   // populate String Method
					s[j] = n.getName();
					n = n.getNextNode();
					j++;
				}
				return s;	
			} // end else
		} // end  while
		s = new String[1];
		s[0] = " Error: No Such Key Exists";   // if Key NOT Found
		return s;
	} // end get()

	
	// remove()
	// --------
	@Override
	public void remove(int key, String name) {
		
		int i=0;
		String[] s;
		
		while(i<index){
			if(key!=keyArray[i])   //If not Found key yet
				i++;
			else{				   // If found the key	
				keyArray[i]=0;
				listArray[i].setHead(null);
				} // end else
		} // end while
	} // end remove

	
	// isEmpty()
	@Override
	public boolean isEmpty() {
		if(keyArray[0]==0)
			return true;
		else
			return false;
	} // end isEmpty

} // end Class
