package singleLinkedList;

/*
 * 3 Singly-linked lists
 * =====================
Create a linked list following the “hospital and patients” example of the notes:
1. Create the linked list and add several elements to it (around 10 is fine).
2. Go through the list printing out the content of each element.
3. Delete a couple of elements from the list.
4. Print the elements in the list again. Check that the deleted elements have been deleted. 
Check that you can delete the first element too.

Hint: Note that you cannot delete the first element from inside the list because you need to 
update the pointer patientListStart. To add or delete the first element of a list, you must do it 
from outside the list.
 */

public class testPatient {

	private Patient pStart = null;
	
	public static void main(String[] args) {
		// Initializations and Declarations
		// --------------------------------
		
		testPatient tp = new testPatient();
		tp.launch();

	}  // end main
	
	// launch()
	// ========
	
	public void launch(){
		
		Patient p1 = new Patient("Stewart");
		Patient p2 = new Patient("John");
		Patient p3 = new Patient("Michael");
		Patient p4 = new Patient("David");
		Patient p5 = new Patient("Robert");
		Patient p6 = new Patient("Mark");
		Patient p7 = new Patient("Mary");
		Patient p8 = new Patient("Jessica");
		Patient p9 = new Patient("Pascale");
		Patient p10 = new Patient("Emma");
		
		// Add Head
		// --------
		addHead(p1);  // note how you can call addHead without a handle as it is a function
					  // within this class. However, calling Patient Class methods requires a
					  // a head (nb only use tp. if calling inside main)
		// Add Patients
		// ------------
									
		pStart.addPatient(p2);  
		pStart.addPatient(p3); //always add to the list by going through the head, pStart
		pStart.addPatient(p4);
		pStart.addPatient(p5);
		pStart.addPatient(p6);
		pStart.addPatient(p7);
		pStart.addPatient(p8);
		pStart.addPatient(p9);
		pStart.addPatient(p10);
		
		// Count Patients
		// --------------
		int n = pStart.getNumPat();
		System.out.println("Num of Patients: " + n);
		
		
		// List
		// ---
		System.out.println("\nGenerate List:");
		pStart.getList();
		
		
		// DeletePatients 3, 6 10
		// ----------------------
		System.out.println();
		System.out.println("DeletePatients 3, 6 10");
		pStart.deletePatient(p3);
		pStart.deletePatient(p6);
		pStart.deletePatient(p10);
		
		
		// Check Number After Delete
		// -------------------------
		System.out.println();
		n = pStart.getNumPat();
		System.out.println("Num of Patients after Deletes: " + n);
		System.out.println("Generate List after Deletes:");
		pStart.getList();
		
		// Get Patient Names for index i
		// -----------------------------
		
		System.out.println("\nGet Patient Names with index" );
		String patName = pStart.getPatientName(1);
		System.out.println("Patient Index 1 = " + patName);
		patName = pStart.getPatientName(3);
		System.out.println("Patient Index 3 = " + patName);
		
		// Showing how to delete Head
		// --------------------------
		
		System.out.println("\nDelete Head:");
		deleteHead();
		System.out.println("new Head: "+ pStart.getPatientName(1));
		n = pStart.getNumPat();
		System.out.println("Num of Patients after delete head: " + n);
		System.out.println("\nList after delete head: ");
		pStart.getList();
		
		
		// Testing Iterative & Recursive Count Methods
		// -------------------------------------------
		n = pStart.countIterative();
		System.out.println("\nIterative Count: " + n);
		n = pStart.countRecursive(pStart);
		System.out.println("Recursive Count: " + n);

		
	}  // end launch
	
	
	// ====================================================
	
	// add Head
	// --------
	public void addHead(Patient s){
		pStart = s;
		System.out.println("Launch with p1: " + pStart.getPatientName(1));
	} // end launch
	
	// delete Head
	// -----------------
	public void deleteHead(){	
		Patient p2 = pStart.getPatient(2);  // always go through the head...
		pStart =  p2; 
		Patient.countPatients--;   // as countPatients is static variable it MUST be CALLED
								   // statically, just like a static method. That said, we 
								   // we are cheating here as countPatients should be private...
	}
	
	
}  //end class
