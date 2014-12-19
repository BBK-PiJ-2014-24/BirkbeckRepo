package integerBinaryTree_Recursive;


public class MyRecursiveTreeTest {

	public static void main(String[] args) {
		
			// Initializations & Declarations
			// -----------------------------
			
			MyRecursiveTree t = new MyRecursiveTree(6);
			String st;
		
			
			// Populate the Tree
			// -----------------
			System.out.println("Tree: 6");
			System.out.print("\nPrint:  ");t.twoString();    // 6
			st = t.toString();
			System.out.println("\nstring: " + st + "\n");
			
			
			System.out.println("\nTree: 6 9");  // 6,9
			t.add(9);
			System.out.print("\nPrint:  "); t.twoString();
			st = t.toString();
			System.out.println("\nstring: " + st + "\n"); 
			

			System.out.println("\nTree: 6 9 5 3");
			t.add(5);
			t.add(3);
			System.out.print("\nPrint:  "); t.twoString();     //6 9 5 3
			st = t.toString();
			System.out.println("\nstring: " + st + "\n"); 
			
			System.out.println("\nTree: 6 9 5 3 8 11 12");
			t.add(8);
			//t.add(8);  // Test Duplication
			t.add(11);
			t.add(12);
			System.out.print("\nPrint:  "); t.twoString();   // 6 9 5 8 3 11 12
			st = t.toString();
			System.out.println("\nstring: " + st + "\n"); 
			
			System.out.println();
			
			
			// boolean b = t.contains(15);
			
			
			
			// Check Tree Working
			// ------------------
			System.out.println("\ncontains 9: " + t.contains(9));
			System.out.println("\ncontains 11: " + t.contains(11));
			System.out.println("\ncontains 12: " + t.contains(12));
			System.out.println("\nmax: " + t.getMax());
			System.out.println("\nmax: " + t.getMin());
			System.out.println("\nDepth: " + t.depth());
			
			t.add(50);
			System.out.println("max: " + t.getMax());
			
			

	}

}
