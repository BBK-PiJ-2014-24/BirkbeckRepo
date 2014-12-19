package supermarketPack;

// INTERFACE FOR PersonQueue
// -------------------------

public interface PersonQueue { 
	
	void insert(Person person);  //Adds another person to the queue.
		
	Person retrieve(); // Removes a person from the queue.
	
	int size(); // My Add to the Interface.
	
	void printQ(); // My Add to the Interface
		

}
