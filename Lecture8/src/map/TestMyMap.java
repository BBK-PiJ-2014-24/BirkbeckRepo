package map;

public class TestMyMap {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		SimpleMap m = new MyMap(10);  // Note the Interface refernce Type and the MyMap Obj
		
		// Test if Empty
		// -------------
		System.out.println("\nIs Map Empty: " + m.isEmpty() + "\n");
		
		// Load Data
		// ---------
		
		m.put(100, "Stewart");
		m.put(101, "Rob");
		m.put(102, "Mike");
		m.put(103, "Portia");
		m.put(104, "Pascale");
		m.put(105, "Jessica");
		m.put(106, "Mary");
		m.put(107, "Emma");
		
		// Print Map
		// ---------
		
		System.out.println("Print Map\n");
		for(int i=100; i<108; i++){
			System.out.println("Key: " + i + " Name: " + m.get(i));
		}
		
		// Remove key 104
		// --------------
		
		m.remove(104);
		System.out.println("\nRemove key 104");
		for(int i=100; i<108; i++){
			System.out.println("Key: " + i + " Name: " + m.get(i));
		}
		
		// Test if Empty
		// -------------
		System.out.println("\nIs Map Empty: " + m.isEmpty() + "\n");

	}  // end main

} // end class
