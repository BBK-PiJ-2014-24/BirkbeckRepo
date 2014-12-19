/*
 
 9) From array to list
 =====================
Create a static method that takes an array of integers and returns a linked list of integers in the same
order as the original array. You can put this method in a class called ListUtilities so that you can 
easily use it for the following exercises.

Initialising an array with 15-20 elements is very easy with curly-brackets-notation, so it is common to
create an array and then convert it into a dynamic structure automatically.

11 Bubble sort (*)
==================
In this exercise, you will implement the bubble sort algorithm and use it to sort an unsorted linked 
list of integers. The bubble sort algorithm is the simplest sorting algorithm there is:
1. Take the first element. Compare it with the second element. If it is greater, make them change
 	positions (first becomes second and viceversa); otherwise, do nothing.
2. Move to the next element. Repeat the process (i.e. compare 2 and 3, then 3 and 4, up to the last
 	element).
3. Now you have the highest element at the end of the list.
4. Move back to the beginning and repeat the whole process until your list is sorted.
5. Once you pass through the list without swapping elements, your list is sorted.

Put your implementation in a static method in a class, maybe ListUtilities.bubbleSort(List). 
The name of the algorithm comes from metaphorical bubbles always moving up in a liquid.
 */


package listUtilities;

public class ListUtilities {

	
	// arrayToList
	// -----------
	public static SingleLinkList arrayToList(int[] x){
		
		Node head; 
		SingleLinkList s = new SingleLinkList();
		head = new Node(x[0]); // Initialize Head Node Obj 
		s.setHead(head);	// Add Head Node to List	
		
		for(int i=1;i<x.length;i++){ //populate List
			Node n = new Node(x[i]);
			s.addNode(n);
		}
			return s;
		} // end 
				
	
	// Bubble Sort
	// -----------
	 public static SingleLinkList bubbleSort(SingleLinkList s){
		 
		 int swap = 0;
		 int countNodes = s.getNodeCount();
		 Node head = s.getHead();
		 
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
		 
		 s.setHead(head, false);
		 return s;
	 }
	
	
} //end class
