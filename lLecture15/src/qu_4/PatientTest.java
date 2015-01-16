package qu_4;

public class PatientTest {

	public static void main(String[] args) {
		PatientTest pt = new PatientTest();

		pt.launch();
		
	}

	
	public void launch(){
		
		PatientList pList = new PatientList();
		
		try{
			Patient p1 = new Patient("Stewart", 1969);  
			Patient p2 = new Patient("Mike", 1966);
			Patient p3 = new Patient("Rob", 1974);
			Patient p4 = new Patient("x", 2016);
			
			pList.add(p1);  // Any Variables formed in the catch must now include all further
			pList.add(p2);  // references of them in the catch. Otherwise, don't show up.
			pList.add(p3);
			pList.add(p4);
			
		}
		catch(IllegalArgumentException ex){
			System.out.println("Invalid Patient Data Inputted"); 
		}
		

	
		String s = pList.toString();
		System.out.println(s);
		
		
	}
}
