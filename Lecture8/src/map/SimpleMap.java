/*
 * Simple map
 * ==========
Create a class that implements the following interface of a simple map from integers to strings.

* Map from integer to Strings
*  
*/

package map;

public interface SimpleMap {

	void put(int key, String name);  // Puts a new String in the map. If the key is already in the map, 
								     // nothing is done. 
	
	String get(int key);  // Returns the name associated with that key, or null if there is none.
	
	void remove(int key);  // Removes a name from the map. Future calls to get(key)  
						   // will return null for this key unless another
	
	boolean isEmpty();  // Returns true if there are no workers in the map, false otherwise
	
}
