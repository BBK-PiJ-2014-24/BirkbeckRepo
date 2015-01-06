package qu1;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import qu1.Book;

public class BookDatabase {
	
	// Fields
	// ------
	private List<Book> database;
	
	// Constructor
	// -----------
	public BookDatabase(){
		database = new LinkedList<Book>();
	}
	
	// addBook()
	// ---------
	public void addBook(String t, String a){
		Book b = new Book(t,a);
		database.add(b);
	}
	
	// size()
	// ------
	public int size(){
		return database.size();
	}
	

}
