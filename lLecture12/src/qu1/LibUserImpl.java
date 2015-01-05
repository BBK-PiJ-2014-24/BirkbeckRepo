package qu1;


public class LibUserImpl implements LibUser {

	// Fields
	// ------
	
	private String UserName;
	private int id;
	private Library lib;
	
	// Constructor
	// -----------
	public LibUserImpl(String UserName){
		this.UserName = UserName;
		id = 0;
	}
	
	// getter/Setters
	// --------------
	
	@Override
	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	@Override
	public String getUserName() {
		return UserName;
	}

	@Override
	public void setUserID(int ID) {
		id = ID;
	}

	@Override
	public int getUserID() {
		return id;
	}

	@Override
	public void register(Library l) {
		lib = l;
		l.getUserDatabase().put(this);
	}

	@Override
	public Library getLibrary() {
		// TODO Auto-generated method stub
		return lib;
	}


}
