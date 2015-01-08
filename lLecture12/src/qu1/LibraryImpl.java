package qu1;

public class LibraryImpl implements Library {

	private String libraryName;
	private int MaxBookPerUser;
	private LibUserDatabase userDatabase;
	private BookDatabase bookDatabase;
	
	// Constructor
	// -----------
	public LibraryImpl(String l){
		libraryName = "Croydon";
		userDatabase = new LibUserDatabase();
		bookDatabase = new BookDatabase();
		MaxBookPerUser = 1;
	}
	
	// getter/setter
	// -------------
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

	@Override
	public BookDatabase getBookDatabase() {
		return bookDatabase;
	}
	
	@Override
	public void addBook(String t, String a) {
		bookDatabase.addBook(t, a);
	}

	@Override
	public Book takeBook(String t) {
		Book b = bookDatabase.findBook(t);
		return b;
	/*	if(!b.equals(null)){
			b.isBorrowed();	
			return b;
		}
		Book n = null;
		return n;*/
	}
	
	
	


	
	
	
	
	
}
