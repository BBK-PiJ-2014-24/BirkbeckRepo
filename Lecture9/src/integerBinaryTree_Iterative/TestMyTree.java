package integerBinaryTree_Iterative;

public class TestMyTree {

	public static void main(String[] args) {
		// Initializations & Declarations
		// -----------------------------
		
		MyTree t = new MyTree();
		
		// Populate the Tree
		// -----------------
		t.setRoot(10);
		t.add(15);
		t.add(11);
		t.add(8);
		t.add(9);
		t.add(9);  // Test Duplication
		t.contains(9);
		
		
		
		// Check Tree Working
		// ------------------
		System.out.println("contains 9: " + t.contains(9));
		System.out.println("contains 11: " + t.contains(11));
		System.out.println("contains 12: " + t.contains(12));
		System.out.println("max: " + t.getMax());
		System.out.println("max: " + t.getMin());
		
		
		t.add(50);
		System.out.println("max: " + t.getMax());
		
	
	}

}
