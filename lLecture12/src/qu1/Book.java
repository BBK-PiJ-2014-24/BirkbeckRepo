package qu1;

public class Book {
	
	
	
	// Fields
	// ------
	private String title;
	private String author;
	
	/**
	 * Constructor: BOOK
	 * 
	 * @param t = title of Book
	 * @param a = author of Book
	 */
	
	public Book(String t, String a){
		title = t;
		author = a;
	}
	
	/**
	 * getTitle - Returns Title
	 */
	public String getTitle(){
		return title;
	}
	
	/**
	 * setTitle
	 * @param t - Title
	 */
	public void setTitle(String t){
		title = t;
	}
	
	
	/**
	 * getAuthor - Returns Author
	 */
	public String getAuthor(){
		return author;
	}
	
	/**
	 * setAuthor
	 * @param a - Author
	 */
	public void setAuthor(String a){
		author = a;
	}
	
	
	
	
}
