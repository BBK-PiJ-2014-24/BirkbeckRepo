package integerBinaryTree_Recursive;

public interface IntSet {

	void add(int v); // adds a new int to the set; if it is there already, nothing happens.
	
	boolean contains(int v); // returns true if the number is in the set, false otherwise.
	
	void containsVerbose(int v); // returns the same values as the former method, but for every element 
						 // that is checked, prints its value on screen.
	@Override
	String toString(); // returns a string with the values of the elements in the set separated by commas.
	
}
