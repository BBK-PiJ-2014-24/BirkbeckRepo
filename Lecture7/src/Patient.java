
public class Patient {

	public String name;
	private Patient PatientPointerToNextPatient;
	public static int countPatients=0;
	
	// Constructor
	// -----------
	Patient(String name){
		this.name = name;
		PatientPointerToNextPatient = null; // pointer
		countPatients++;
	}
	
	// Add to List Method
	// -----------------
	
	public void addPatient(Patient pToBeAdded){
		if(this.PatientPointerToNextPatient ==  null)  // implies at end of List
			this.PatientPointerToNextPatient = pToBeAdded; // point current pointer to New Patient to be add
		else											// else if not at end of list....	
			this.PatientPointerToNextPatient.addPatient(pToBeAdded);	// **thisObject.PointingToNextObject.
																	// ** Run This method Recursively	
	 } // end addMethod
	
	// Delete From List
	// ----------------
	
	public boolean deletePatient(Patient pToBeDeleted){
		if(this.PatientPointerToNextPatient == null)  // If Come to End of List And Not Found Patient to Delete
			return false; 							// return false
		else if (this.PatientPointerToNextPatient.name.equals(pToBeDeleted.name)){ // ** If .name of next Patient
													// in pointer to next patient =  .name of patient to delete
													// then delink by relinking to pointer to one after deleted 
													// patient.
			this.PatientPointerToNextPatient = this.PatientPointerToNextPatient.PatientPointerToNextPatient;
			return true;
		}
									//if not pointing to patient to delete pass delete method recursivley.
		else						// to next pointed patient. Method can be passed as it is Boolean METHOD
			return this.PatientPointerToNextPatient.deletePatient(pToBeDeleted);
			
	} // end Delete Method
	
	
	// Print List of Patients
	// ----------------------
	
	public void getList(){
		
		
		while(PatientPointerToNextPatient!=null){
			System.out.println(PatientPointerToNextPatient.name);
		}
		
	} // end getList
	
	// STATIC getter for countPatients
	// ------------------------
	
	public static int getNumPat(){
		return countPatients;
	}
		
}  // end Class
