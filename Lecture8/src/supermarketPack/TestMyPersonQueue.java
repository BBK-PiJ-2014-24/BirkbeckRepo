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

import map.HashUtilities;

public class TestMyPersonQueue {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		TestMyPersonQueue  t = new TestMyPersonQueue();
		
	//	PersonQueue q = new MyPersonQueue();       // ****  Nb. Interface Type != Object Type  *****
		PersonQueue q = new UnfairQueueSimple();  // ****  Nb. Interface Type != Object Type  *****
		
		Person p1 = new Person("Stew", 45);
		Person p2 = new Person("Mike",48);
		Person p3 = new Person("Rob",40);
		Person p4 = new Person("Portia", 42);
		Person p5 = new Person("Pascale", 44);
		Person p6 = new Person("Jessica",38);
		Person p7 = new Person("Mary", 46);
		
		q.insert(p1);
		q.insert(p2);
		q.insert(p3);
		q.insert(p4);
		q.insert(p5);
		q.insert(p6);
		q.insert(p7);
		
		q.printQ();
		System.out.println("Size: " + q.size());
		System.out.println();
		Person r1 = q.retrieve();
		System.out.println("Size: " + q.size());
		q.printQ();
		
		System.out.println();
		
		System.out.println("\n");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		int h1 = HashUtilities.shortHash(p1.hashCode());

	}

}
