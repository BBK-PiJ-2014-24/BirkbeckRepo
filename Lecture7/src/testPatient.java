
public class testPatient {

	private Patient pStart = null;
	
	public static void main(String[] args) {
		// Initializations and Declarations
		// --------------------------------
		
		testPatient tp = new testPatient();
		
		Patient p1 = new Patient("Stewart");
		Patient p2 = new Patient("John");
		Patient p3 = new Patient("Michael");
		Patient p4 = new Patient("David");
		Patient p5 = new Patient("Robert");
		Patient p6 = new Patient("Mark");
		
		// Launch
		// ------
		tp.pListLaunch(p1);
		
		// Add Patient
		// -----------
		
		tp.pStart.addPatient(p2);
		tp.pStart.addPatient(p3);
		tp.pStart.addPatient(p4);
		tp.pStart.addPatient(p5);
		tp.pStart.addPatient(p6);
		
		// Count Patients
		// --------------
		int n = Patient.getNumPat();
		System.out.println("Num of Patients: " + n);
		
		// DeletePatients
		// --------------
		
		tp.pStart.deletePatient(p6);
		
		

	}  // end main
	
	public void pListLaunch(Patient s){
		this.pStart = s;
		System.out.println("Launch with p1: " + pStart.name);
	}

}
