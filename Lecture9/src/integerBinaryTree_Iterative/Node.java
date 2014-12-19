/*
 * 1 Integer Binary Tree 1.1 First steps: add and seek
Complete the class IntegerTreeNode.
From the notes, you already know what the member fields are and you have seen a possible implementation 
of methods add(int) and contains(int). Implement as well two methods getMax() and getMin() that returns 
the maximum and the minimum values stored in the tree.

Compile the class and use it inside a script1 adding numbers in different orderings.
 */

package integerBinaryTree_Iterative;

public class Node {

	// Fields
	// ------
		private int value;
		private Node leftNode;
		private Node rightNode;
		
	
	// Constructor
	// -----------
		public Node(int value){
			this.value = value;
			leftNode = null;
			rightNode = null;
		}
	
	// getter/setter
	// -------------
		
		public int getValue(){
			return value;
		}
		
		public void setValue(int value){
			this.value = value;
		}
		
		public Node getLeftNode(){
			return leftNode;
		}

		public void setLeftNode(Node n){
			leftNode = n;
		}
		
		public Node getRightNode(){
			return rightNode;
		}
		
		public void setRightNode(Node n){
			rightNode = n;
		}
	

	
	
	
	
	
}
