package qu_4;

import java.util.ArrayList;
import java.util.List;

public class PatientList {

	private List<Patient> PatientList;
	
	public PatientList(){
		PatientList = new ArrayList<Patient>();
	}
	
	public void add(Patient p){
		PatientList.add(p);
	}
	
	@Override
	public String toString(){
		
		String s = "";
		
		for(Patient p : PatientList ){
			s+= p.getName() + ", "; 
		}
		return s;
	}
	
	
}
