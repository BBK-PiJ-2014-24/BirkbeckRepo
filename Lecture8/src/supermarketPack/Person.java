package supermarketPack;

public class Person {

	private String name;
	private int age;
	private Person nextPerson;
	
	// Constructor
	// -----------
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		nextPerson = null;
	}
	
	// getter/setter
	// -------------
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public Person getNextPerson(){
		return nextPerson;
	}
	
	public void setNextPerson(Person p){
		nextPerson = p;
	}
	
	
}  // end Person Class
