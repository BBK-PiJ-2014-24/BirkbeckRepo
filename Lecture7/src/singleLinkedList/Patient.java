package singleLinkedList;
/*
 * IN THIS SET UP, THE NODE AND THE LINKED LIST METHODS ARE NOT SEPARATED INTO DIFFERENT CLASSES, 
 * BECAUSE THE POINTER IS REFERRED TO DIRECTLY (AND SO LINKED LISTS MUST BE IN THE SAME CLASS).
 *  ALSO THE METHODS USE DIRECT RECURSION ON THE NODE OBJECT, WHICH AGAIN REQUIRES THE MERGE OF 
 *  THE TWO CLASSES  
 * 
 * 3 Singly-linked lists
Create a linked list following the “hospital and patients” example of the notes:
1. Create the linked list and add several elements to it (around 10 is fine).
2. Go through the list printing out the content of each element.
3. Delete a couple of elements from the list.
4. Print the elements in the list again. Check that the deleted elements have been deleted. 
Check that you can delete the first element too.

Hint: Note that you cannot delete the first element from inside the list because you need to update
the pointer patientListStart. To add or delete the first element of a list, you must do it from outside
the list.

4 Queue length
Reuse the code of one of the dynamic list in the former exercise, and add a method that calculates 
the length of the list (maybe you have done this already).
Is it easy to do this both iteratively and recursively? Try both ways and see which is more 
natural for you. If one takes too long, try the other way.
 */

public class Patient {

	private String name;
	private Patient nextPatientObj;  // made protected so subclass can see.
	public static int countPatients=0; // should be private!
	
	// Constructor
	// -----------
	public Patient(String name){
		this.name = name;
		nextPatientObj = null; // pointer
		countPatients++;
	}
	
	// Add to List Method
	// -----------------
			
			public void addPatient(Patient pToBeAdded){
				pToBeAdded.nextPatientObj = null; // ensure that new Patient has no old links!!!!
				
				if(this.nextPatientObj ==  null)  // implies at end of List
					this.nextPatientObj = pToBeAdded; // point current pointer to New Patient to be add
				else											// else if not at end of list....	
					this.nextPatientObj.addPatient(pToBeAdded);	// **thisObject.PointingToNextObject.
																			// ** Run This method Recursively	
			 } // end addMethod
			
			// Delete From List
			// ----------------
			
			public boolean deletePatient(Patient pToBeDeleted){
				if(this.nextPatientObj == null)  // If Come to End of List And Not Found Patient to Delete
					return false; 							// return false
				else if (this.nextPatientObj.name.equals(pToBeDeleted.name)){ // ** If .name of next Patient
															// in pointer to next patient =  .name of patient to delete
															// then delink by relinking to pointer to one after deleted 
															// patient.
					this.nextPatientObj = this.nextPatientObj.nextPatientObj;
					countPatients--;
					return true;
				}
											//if not pointing to patient to delete pass delete method recursivley.
				else						// to next pointed patient. Method can be passed as it is Boolean METHOD
					return this.nextPatientObj.deletePatient(pToBeDeleted);
					
			} // end Delete Method
			
			
			// Print List of Patients
			// ----------------------
			
			public void getList(){
				
				System.out.println(this.name);
				if(this.nextPatientObj!=null){
					this.nextPatientObj.getList();  // called recursively as dont know size of list
				} // end if	
			} // end getList
			
			
			// Get a Patient Name & Get Patient
			// --------------------------------
			// All that is happening in the loop is that the pointer keeps moving along the list. 
			// HOWEVER, note that the "this" patient obj (and its pointer) DOES NOT WANT TO change 
			// (as it screws up the Linked list). So create a Patient, p, object for the method and 
			// then move its pointer. 
			
			public String getPatientName(int index){
				String s;
				Patient p = this;
				if(index>1){
					for(int i=1;i<index;i++){
						p = p.nextPatientObj; 
					} // end loop
				}  // end if
				s = p.name;
				return s;
			}
			
			public Patient getPatient(int index){
				Patient p = this;
				if(index>1){
					for(int i=1;i<index;i++){
						p = p.nextPatientObj;
					} // end loop
				} // end if
				return p;
			}
			
			// getter for countPatients
			// ------------------------
			
			public int getNumPat(){
				return countPatients;
			}
			
			// Iterative Count List
			// --------------------
			
			public int countIterative(){
				int count = 1;
				Patient p = this;     // use "this" as referring to this object in method
				while(p.nextPatientObj!=null){
					count++;
					p = p.nextPatientObj;
				}
				return count;
			}

			
			// Recursive Count List Method
			// ---------------------------
			
			public int countRecursive(Patient p){
				if(p.nextPatientObj == null)
					return 1;
				else{
					int count = 1 + countRecursive(p.nextPatientObj);
					return count;
				}
			}	
		

}  // end Class
