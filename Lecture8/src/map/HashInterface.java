package map;

public interface HashInterface {

	void put(int key, String name);  // Puts a new String in the map.

	String[] get(int key);  // Returns all the names associated with that key, * or null if there is none.

	void remove(int key, String name);  // Removes a name from the map

	boolean isEmpty();  // Returns true if there are no workers in the map, * false otherwise
	
}
