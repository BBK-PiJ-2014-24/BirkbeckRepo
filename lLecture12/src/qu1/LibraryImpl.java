package qu1;

public class LibraryImpl implements Library {

	private String libraryName;
	private int MaxBookPerUser;
	private LibUserDatabase userDatabase;
	private BookDatabase bookDatabase;
	private int countBorrowedBooks;
	
	// Constructor
	// -----------
	public LibraryImpl(String l){
		libraryName = "Croydon";
		userDatabase = new LibUserDatabase();
		bookDatabase = new BookDatabase();
		MaxBookPerUser = 1;
		countBorrowedBooks = 0;
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
		if(b!=null) {  // If you want to test obj is null, DO NOT USE .equals, use == instead
			if(b.isBorrowed() == false){  // if Book Not on Loan
				b.setBorrowed(true);	
				countBorrowedBooks++;
			}
			else{  // if book is on loan
				b = null;
				System.out.println("Sorry, the book, " + t + ", is Already on Loan");
			}		
		}
		else{
			System.out.println("Sorry, the book, " + t + ", is Not Found in this Library");
		}
		return b;
	}

	@Override
	public void returnBook(Book b) {
		if(b != null){
			b.setBorrowed(false);
			countBorrowedBooks--;
		}
	}

	@Override
	public int getReaderCount() {
		return userDatabase.size();
	}

	@Override
	public int getBookCount() {
		return bookDatabase.size();
	}

	@Override
	public int getBorrowedBookCount() {
		return countBorrowedBooks;
	}
	
	
	


	
	
	
	
	
}
