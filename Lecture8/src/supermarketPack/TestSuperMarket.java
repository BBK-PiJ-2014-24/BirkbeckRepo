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

public class TestSuperMarket {

	public static void main(String[] args) {
		// initializations and Declarations
		// --------------------------------
		
		Supermarket s = new Supermarket();
		
		Person p1 = new Person("Stew", 45);
		Person p2 = new Person("Mike",48);
		Person p3 = new Person("Rob",40);
		Person p4 = new Person("Portia", 44);
		Person p5 = new Person("Pascale", 44);
		Person p6 = new Person("Jessica",44);
		Person p7 = new Person("Mary", 46);
		
		s.addPerson(p1);
		s.addPerson(p2);
		s.addPerson(p3);
		s.addPerson(p4);
		s.addPerson(p5);
		s.addPerson(p6);
		s.addPerson(p7);
		
		
		s.servePerson();
		s.servePerson();
		
	
	
		
		
	}

}
