package qu1;

public interface Library {
	
	/**
	 * getLibraryName - gets Library Name
	 * @return String name of Library
	 */
	public String getLibraryName();
	
	/**
	 * getMaxBookPerUser - returns max number of books a user can borrow
	 * @return - returns max number of books a user can borrow
	 */
	public int getMaxBookPerUser();
	
	
	/**
	 * setMaxBookPerUser - sets max number of books a user can borrow. Note Constructor Default is 1
	 * @param max - max number of books a user can borrow
	 */
	public void setMaxBookPerUser(int max);
	
	/**
	 * getId(String name) returns the ID of a person for a given name in this 
	 * library. If the person does not have an ID yet, a new unique ID is created and returned.
	 * Any subsequent calls to this method with the same name argument should return the same ID
	 * @param - name of User
	 * @return - Return ID of User
	 */
	public int getID(String name);
	
/**
 * getUserDatabase() - Allows Public Access to UserDatabase
 * @return - returns the userDatabase for the Library.
 */
	public LibUserDatabase getUserDatabase();
}
