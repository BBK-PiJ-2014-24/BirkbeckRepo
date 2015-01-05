package qu1;

import java.util.HashMap;

public class LibUserDatabase {
	
	// Fields
	// ------

	private HashMap<Integer,LibUser> m;
	
	// Constructors
	// ------------
	
	public LibUserDatabase(){
		m = new HashMap<Integer,LibUser>();
	}

	
	/**
	 * Generates Random ID Number over (100,000-999,999)
	 * @return random Number
	 */
	public static int generateID(){
		int x = 0;
		int min = 100000;
		while(x<min){
			x = (int) (Math.random()*1000000);
		}
		return x;
	}
	
	
	/**
	 * put - Generates unique ID for new user and then adds (ID, user)  to the Library User's database
	 * @param name - name of user
	 */
	public void put(LibUser u){
		Integer id = u.getUserID();     // Should be id = 0;
		while(m.containsKey(id)==true || id == 0){
			id = LibUserDatabase.generateID();   // generate random id
			u.setUserID(id);             // assign id to user
		}		
		m.put(id, u);
	}
	
	/**
	 * getLibUser(Integer key) - Returns the LibUser obj given ID key
	 * @param key - this is the id of the lib user
	 * @return Returns the LibUser obj given ID key
	 */
	public LibUser getLibUser(Integer key){
		return m.get(key);
	}
	
	/**
	 * size - Size of Database
	 * @return - size of database
	 */
	public int size(){
		return m.size();
	}
	
	/**
	 * ContainsValue - Boolean Check if Value(i.e. UserName) is in Database
	 * @param v - name of User
	 * @return boolean true if user is in database
	 */
	public boolean containsKey(Integer key){
		return m.containsKey(key);
	}
	

}
