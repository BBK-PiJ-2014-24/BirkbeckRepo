/*
 * 4 Unfair queue (*) 
 * 4.1 Simple
Implement the interface queue in a way that the person at the end (i.e. the person that is retrieved 
next time the method retrieve() is called) is always the oldest person.
 */



package supermarketPack;

//import listUtilities.Node;   // Lecture 7 Included in Build

public class UnfairQueueSimple implements PersonQueue{

	// Fields
	// ------
	
	private Person endQ;
	private int countPerson;
	
		
	// Constructor
	// -----------
	
	public UnfairQueueSimple(){
		endQ = null;
		countPerson = 0;
	}
	
	// size()
	// ------
	
	public int size(){
		return countPerson;
	}
	
	@Override
	public void insert(Person p) {
		p.setNextPerson(endQ);
		endQ = p;
		countPerson++; 
		bubbleSort();
		
	}

	@Override
	public Person retrieve() {
		Person p;
		Person pFrontQ;
		p = endQ;
		while(p.getNextPerson().getNextPerson()!=null)
			p = p.getNextPerson();
		
		pFrontQ = p.getNextPerson();
		p.setNextPerson(null);
		countPerson--;
		return pFrontQ;
	} // end retrieve
	
	
	// **** BubbleSort ****
	// --------------------
	
		 public void bubbleSort(){
			 int swap = 0;
			 boolean endSort = false;
			 while(!endSort){
				 Person n = endQ;
				 Person prevN=endQ;
				 for(int i=0; i<countPerson-1;i++){
					 Person x = n;
					 Person y = n.getNextPerson();
					 if(x.getAge()>y.getAge()){   // if x<y, swap
						 Person t = x;
						 x.setNextPerson(y.getNextPerson());
						 y.setNextPerson(t);
						 if(i==0)
							 endQ = y;
						 else
							 prevN.setNextPerson(y);
						 swap++;
						 prevN = y;				// *** previous Node is now Y!!***
						 n = y.getNextPerson();
					 } //end if
					 else{
						 prevN = n;
						 n = n.getNextPerson();
						 }
				 } // end for loop
				 if(swap>0)
					 swap=0;
				 else
					 endSort = true;
			 } // end outer while
		 }  //end BubbleSort
	
	
		 
		 // printQ()
		 // --------
		 
		 
		 public void printQ(){
			 Person p = endQ;
			 while(p!=null){
				 System.out.println(p.getName() + "\t" + p.getAge());
				 p = p.getNextPerson();
			 }
			 System.out.println("\n");
		 }
	
} // end class
