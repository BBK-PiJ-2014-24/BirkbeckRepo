package qu_5;

public interface PrimeDivisorList {
	
	/**
	 * adds() prime integer to the PrimeDivisorList. If a null number is passed to the add(Integer) method, 
	 * a NullPointerException must be thrown. If a non-prime number is added, 
	 * an IllegalArgumentException must be thrown.
	 * @param Integer x to be added.
	 */
	 void add(Integer x);
	 
	 
	 /**
	  * remove(Integer x) - removes integer from the list.
	  * @param x integer to removed from the list
	  */
	 void remove(Integer x);
	 
	 
	 /**
	  * Override the method toString() so that it returns something like: [ 2 * 3^2 * 7 = 126 ]
	  */
	 @Override
	 String toString();

	 
}
