package qu1;

public class LibraryImpl implements Library {

	private String libraryName;
	private int MaxBookPerUser;
	private LibUserDatabase userDatabase;
	
	
	public LibraryImpl(String l){
		libraryName = "Croydon";
		userDatabase = new LibUserDatabase();
		MaxBookPerUser = 1;
	}
	
	public String getLibraryName(){
		return libraryName;
	}
	
	public int getMaxBookPerUser(){
		return MaxBookPerUser;
	}
	
	public void setMaxBookPerUser(int max){
		MaxBookPerUser = max;
	}

	@Override
	public int getID(String name) {
		return userDatabase.getID(name);
	}

	@Override
	public LibUserDatabase getUserDatabase() {
		return userDatabase;
	}
	
	
	
	
	
}
