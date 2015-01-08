package qu1;

public class Book {

	// Fields
	// ------
	private String title;
	private String author;
	private boolean borrowed;
	
	/**
	 * Constructor: BOOK
	 * 
	 * @param t = title of Book
	 * @param a = author of Book
	 */
	public Book(String t, String a){
		title = t;
		author = a;
		borrowed = false;
	}
	
	/**
	 * getTitle - Returns Title
	 */
	public String getTitle(){
		return title;
	}
	
		
	/**
	 * getAuthor - Returns Author
	 */
	public String getAuthor(){
		return author;
	}
	

	/**
	 * isBorrowed() Determines if the book is Taken Out. 
	 * @return returns true if book is on Loan (borrowed); 
	 * returns false if book is not taken out.
	 */
	public boolean isBorrowed(){
		if(borrowed==false)
			return false;
		else
			return true;
	}
	/**
	 * setBorrowed - setter method for flagging book is borrowed or Not.
	 * @param isBorrowed
	 */
	public void setBorrowed(boolean isBorrowed){
		borrowed = isBorrowed;
	}
	
	
}
