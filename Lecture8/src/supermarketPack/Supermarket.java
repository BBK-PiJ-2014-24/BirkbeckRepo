/*
 * 1 Supermarket queue
 * -------------------
Use the interface PersonQueue that represents a queue of people waiting at the supermarket and then 
implement it. You can use the definition and the implementations of StringStack as a guide. You can 
reuse any version of class Person from past days. For example, depending on your implementation, you 
may want to use a version of Person with or without internal pointers.

public interface PersonQueue { 

	void insert(Person person);  // Adds another person to the queue.

	Person retrieve();  // Removes a person from the queue. 
}

Then create a class Supermarket that has two methods: 

addPerson(Person) 
servePerson(). 
These methods must call the appropriate methods of PersonQueue.
 */


package supermarketPack;

public class Supermarket {
	
	// Fields
	// ------
	 private PersonQueue q;
	
	
	// Constructor
	// -----------
	 public Supermarket(){
		q = new MyPersonQueue(); 
	 }
	
	// addPerson(Person) 
	// -----------------
	public void addPerson(Person p){
		q.insert(p);
		System.out.println("adding "+ p.getName());
	}
	 
	 
	// servePerson()
	// -------------
	
	public void servePerson(){
		Person r = q.retrieve();
		System.out.println("Serving " + r.getName());
	}
}
