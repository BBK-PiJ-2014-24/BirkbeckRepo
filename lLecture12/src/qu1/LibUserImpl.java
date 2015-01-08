package qu1;

import java.util.ArrayList;
import java.util.List;


public class LibUserImpl implements LibUser {

	// Fields
	// ------
	
	private String UserName;
	private int id;
	private Library lib;
	private List<String> borrowedBookList;
	private int userBookCount;
	
	// Constructor
	// -----------
	public LibUserImpl(String UserName){
		this.UserName = UserName;
		id = 0;
		borrowedBookList = new ArrayList<String>();
		userBookCount = 0;
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
		return lib;
	}

	@Override
	public List<String> getBorrowedBookList() {
		return borrowedBookList;
	}

	@Override
	public void borrowBook(String t) {
		int maxBooks = lib.getMaxBookPerUser();
		
		
		if(userBookCount<maxBooks){
			Book b = lib.takeBook(t);
			if(b != null){     // If Book IS in Library and if Book is NOT Loaned
					borrowedBookList.add(t);
					userBookCount++;		
			}
		}
		else{
			System.out.println("Denied: User Has Exceeded Max Number of Books on Loan");
		}
			
	}

	@Override
	public int getUserBookCount() {
		return userBookCount;
	}


}
