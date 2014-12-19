package circularLinkedList;
/*
 * IN THIS SET UP, THE NODE AND THE LINKED LIST METHODS ARE NOT SEPARATED INTO DIFFERENT CLASSES, 
 * BECAUSE THE POINTER IS REFERRED TO DIRECTLY (AND SO LINKED LISTS MUST BE IN THE SAME CLASS).
 * ALSO THE METHODS USE DIRECT RECURSION ON THE NODE OBJECT, WHICH AGAIN REQUIRES THE MERGE OF 
 * THE TWO CLASSES
 *  
 * 6 Circular lists
A circular list is a dynamic list in which there is a beginning but there is no end: the last element 
is pointing back to the first element. Circular lists can be singly- or doubly-linked. In this exercise, 
you must create a singly-linked circular list using the “hospital and patients” example as a starting 
point.

1. Create the circular list and add several elements to it (around 10 is fine).
2. Traverse it forwards for one complete loop. While you go around the list, print out the content of 
each element. How do you know that you have reached the end of the list when you never find a null 
pointer?
3. Delete a couple of elements from the list.
4. Traverse it again printing out the content of each element.
5. Add a new element to the list. Try to delete an element that is NOT in the list.
6. Traverse it again printing out the content of each element.
 */
public class PatCircular {
	
	private String name;
	private PatCircular nextPatObj;
	private boolean headFlag;
	
	// Constructor
	// -----------
	public PatCircular(String name){
		this.name = name;
		nextPatObj = null;
		headFlag = false;
	}// end Constructor
	
	
	// addPatient
	// ----------
	public void addPatient(PatCircular p){
		p.nextPatObj = null;  // ensure patient is clear of old links before adding
		p.setHeadFlag(false);
		if(this.nextPatObj.getHeadFlag()==true){ //CHECK IF POINTING TO HEAD, BY CHECKING FLAG!
			PatCircular tempHead = this.nextPatObj; // Create a temp copy of Head. 
			this.nextPatObj=p;  // Slot in new patient
			this.nextPatObj.nextPatObj = tempHead; // Set New Patient's Pointer to pHead.
											// done through this so to avoid pass by copy.	
		}
		else
			this.nextPatObj.addPatient(p); // remember that p is the payload, which 
										  // does not change on each recursion	
	} // end addPatient
	
	
	// endPatient
	// ----------
	public boolean deletePatient(PatCircular p){
		if(this.nextPatObj.getHeadFlag() == true) // The End of List is POINTING TO HEAD!!
			return false;
		else if(this.nextPatObj.equals(p)){
			this.nextPatObj = this.nextPatObj.nextPatObj;
			return true;
		}
		else{
			this.nextPatObj.deletePatient(p);
			return true;
		}
	} // end deletePatient
	
	// printForward
	// ------------
	public void printFwd(){
		System.out.println(this.name);
		if(this.nextPatObj.getHeadFlag()==false){
			this.nextPatObj.printFwd();
		}
	} // endPrintFwd
	
	
	// getPatient
	// ----------
	public PatCircular getPatient(int index){
		PatCircular p = this;
		for(int i=0;i<index;i++){
			p = p.nextPatObj;
		}
		return p;
	} // end get Patient
	
	// getName
	// -------
	public String getName(){
		return name;
	}
	
	// setHeadFlag
	// -----------
	public void setHeadFlag(boolean flag){
		headFlag = flag;
	}
	
	// getHeadFlag
	// -----------
	public boolean getHeadFlag(){
		return headFlag;
	}
	
	// setPointer
	// ----------
	
	public void setPointer(PatCircular p){
		p.nextPatObj = p;
	}
	
	// countList
	// ---------
	
	public int countList(){
		PatCircular p = this;
		if(p.nextPatObj.getHeadFlag() == true)
			return 1;
		else {
			int count = p.nextPatObj.countList() + 1;
			return count;
		}
	} // end countList
	
	
} // end class
