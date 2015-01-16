package qu_4;

public class Patient {
	
	private String name;
	private int birthYear;
	private int today = 2015;

	public Patient(String n, int y){
		name = n;
		int age = today - y;
		if(age < 0 || age > 130 )
			throw new IllegalArgumentException("Invalid Age");
		else
			birthYear = y;
	}
	
	public String getName(){
		return name;
	}


}
