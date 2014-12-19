package doubleLinkedList;
/*
 * IN THIS SET UP, THE NODE AND THE LINKED LIST METHODS ARE NOT SEPARATED INTO DIFFERENT CLASSES, 
 * BECAUSE THE POINTER IS REFERRED TO DIRECTLY (AND SO LINKED LISTS MUST BE IN THE SAME CLASS).
 * ALSO THE METHODS USE DIRECT RECURSION ON THE NODE OBJECT, WHICH AGAIN REQUIRES THE MERGE OF 
 * THE TWO CLASSES 
 * 
 * 5 Doubly-linked lists
A doubly-linked list is a dynamic list in which each element is connected to two other elements instead 
of just one. The one before and the one after it. In this exercise, you must create a doubly-linked 
list using the “hospital and patients” example as a starting point.

1. Create the doubly-linked list and add several elements to it (around 10 is fine). 
2. Traverse it forwards and backwards printing out the content of each element.
3. Delete a couple of elements from the list.
4. Traverse it forwards and backwards printing out the content of each element.
5. Add a new element to the list. Try to delete an element that is NOT in the list. 
6. Traverse it forwards and backwards printing out the content of each element.
Hint: First you need to add a new field to Patient for the pointer going “backwards”. 
Then you need to modify the add and delete methods to make sure you do not have loose pointers.
 */

public class PatDoubleLinkList {

	// Class Instance Variables
	// ---------------------------

	private String name;
	private PatDoubleLinkList nextPatientObj;
	private PatDoubleLinkList prevPatientObj;

	// Constructor
	// -----------
	public PatDoubleLinkList(String name) {
		this.name = name;
		this.nextPatientObj = null;
		this.prevPatientObj = null; // pointer for pointing to previous object.
	} // end constructor

	// Add Patient
	// -----------
	public void addPatient(PatDoubleLinkList p) {
		p.nextPatientObj = null;   //Ensure p obj to be added has NO OLD LINKS
		p.prevPatientObj = null;   //Ensure p obj to be added has NO OLD LINKS
		
		if (this.nextPatientObj == null) {
			this.nextPatientObj = p; // link nextPointer
			p.prevPatientObj = this; // link backPointer
		}
		else
			this.nextPatientObj.addPatient(p);
			
	} // end addPatient

	// Delete Patient
	// --------------

	public boolean deletePatient(PatDoubleLinkList p) {
		if (this.nextPatientObj == null)
			return false; // Cant find file to delete
		else if (this.nextPatientObj.equals(p)) {
			PatDoubleLinkList temp = this.nextPatientObj.nextPatientObj; // create temp file for swap objs												
			this.nextPatientObj = this.nextPatientObj.nextPatientObj; 
			temp.prevPatientObj = this;
			return true;
		} else {
			this.deletePatient(this.nextPatientObj);
			return true;
		}
	} // end deletePatient

	// PrintForward
	// ------------

	public void printFwd() {
		System.out.println(this.getName());
		if (this.nextPatientObj != null)
			this.nextPatientObj.printFwd();
	} // end PrintFwd

	// PrintBackward
	// -------------

	public void printBack() {
		PatDoubleLinkList p = this;
		
		while (p.nextPatientObj != null)  // Scroll Fwd to The Tail End Patient
			p = p.nextPatientObj;
		while(p.prevPatientObj != null) {  // Print Backwards to the Head Patient
			System.out.println(p.name);
			p = p.prevPatientObj;
		}
		System.out.println(this.name);
	}

	// count Patients in List
	// ----------------------

	public int countIterative() {
		PatDoubleLinkList p = this;
		int count = 1;
		while (p.nextPatientObj != null) {
			p = p.nextPatientObj;
			count++;
		} // end while loop
		return count;
	} // end

	// getName
	// -------

	public String getName() {
		return this.name;
	}
	
	// getPatient(index)
	// -----------------
	
	public PatDoubleLinkList getPatient(int index){
		
		PatDoubleLinkList p = this;
		if(index!=1){
			for(int i=1; i<index;i++){
				p = p.nextPatientObj;
			} // end loop
		}// end if
		return p;
	}
	
	
	// unLinkBackPointer
	// -----------------
	public void unLinkBackPointer(){
		this.prevPatientObj = null;
	}

} // end class
