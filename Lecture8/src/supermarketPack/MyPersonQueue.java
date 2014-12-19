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

public class MyPersonQueue implements PersonQueue {

	private Person endQ;  // end of Q
	private int countPersons;
	
	public MyPersonQueue(){
		endQ = null;   // the head's pointer is already pointing to null
		countPersons = 0;
	}
	
	// getter
	// ------
	@Override
	public int size(){
		return countPersons;
	}
	
	
	@Override
	public void insert(Person p) {
		p.setNextPerson(endQ);
		endQ = p;  
		countPersons++;
	}

	@Override
	public Person retrieve() {
		
		Person p = endQ;
		Person pOldHead;
		
		while(p.getNextPerson().getNextPerson()!=null){
			p = p.getNextPerson();
		}
		pOldHead = p.getNextPerson();
		p.setNextPerson(null);
		countPersons--;
		return pOldHead;
	}

	@Override
	public void printQ(){
		Person p = endQ;
		while(p!=null){
			System.out.println(p.getName() + "\t" + p.getAge() );
			p = p.getNextPerson();
		}
		System.out.println("\n");
	}
	
}
