
public enum MyFirstEnum {

	// List of ENUM Constant Types Objects
	// -----------------------------------
	
	DOG("Fido",8),
	CAT("Tom", 5),
	MOUSE("Jerry",6);
	
	// List Enum Constant Fields (Properties)
	// ---------------------------------------
	
	private final String name;
	private final int age;
	
	
	
	// Constructor (Note no modifier at all, as instantiates internally))
	// -----------
	
	MyFirstEnum (String name, int a){
		this.name = name;
		age = a;
	}
	
	
	// Getters 
	// -------
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
} // end enum
