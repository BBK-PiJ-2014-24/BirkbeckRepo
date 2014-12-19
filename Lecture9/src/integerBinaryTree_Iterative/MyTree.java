/*
 * 1 Integer Binary Tree 
 * 1.1 First steps: add and seek
 * 
Complete the class IntegerTreeNode.
From the notes, you already know what the member fields are and you have seen a possible implementation 
of methods add(int) and contains(int). Implement as well two methods getMax() and getMin() that returns 
the maximum and the minimum values stored in the tree.

Compile the class and use it inside a script1 adding numbers in different orderings.
 */

package integerBinaryTree_Iterative;

public class MyTree {
	
	// Fields
	// ------
		private Node root;
		private int countNodes;
		
	// Constructor
    // -----------		
		public MyTree(){
			root = null;
			countNodes = 0;
		}
	
		// getter/setter
		// -------------
		
		public Node getRoot(){
			return root;
		}
		
		public void setRoot(int x){
			Node n = new Node(x); 
			root = n;
		}
		
		
	// add()
	// -----
		
		public void add(int newNumber) {
			Node r = root;
			boolean added = false;
			while(!added){
				if (newNumber > r.getValue()) {         //HOP TO RIGHT CHILD
					if (r.getRightNode() == null){		// If Child is empty
						Node right = new Node(newNumber);  // create a Node to Drop Number in.
						r.setRightNode(right);
						added = true;
					}
					else  
						r = r.getRightNode();   // Move Indicator to the Right Child Node
				} 
				else if(newNumber < r.getValue()) {  // HOP TO LEFT CHILD
					if (r.getLeftNode() == null){  // If Child is empty
						Node left = new Node(newNumber);
						r.setLeftNode(left);  
						added = true;
					}
					else
						r = r.getLeftNode();   // Move Indicator to the Left Child Node	
				}
				else
					added = true; //newNumber IS ALREADY IN TREE
			} // end while
		}  //end add()

			
	// contains()
	// ----------
	
		public boolean contains(int x){
			
			Node r = root;
			boolean found = false;
			while(!found){
				if(x==r.getValue())  // if found
					return true;
				
				else if(x>r.getValue()) // if x > node.value
					if(r.getRightNode()== null)  // check if right child node empty
						return false;		  // end of tree AND NOT FOUND
					else
						r = r.getRightNode(); // hop to right node 
				
				else if (x<r.getValue()) // if x < node
					if(r.getLeftNode()==null) // check if left child node is empty
						return false;
					else
					r = r.getLeftNode(); // end of tree AND NOT FOUND
			}// end while
			return false;
		}
		
	
	// getMax()
	// --------
		public int getMax(){
			Node r = root;
			int max = 0;
			while(r.getRightNode()!=null){
				r = r.getRightNode();
			}
			max = r.getValue();
			return max;
		} // end getMax
		
			
	// getMin()
	// --------
	
		public int getMin(){
			Node r = root;
			int min=0;
			while(r.getLeftNode()!=null)
				r = r.getLeftNode();
			min = r.getValue();
			return min;
		} // end getMin
		
		
	// isEmpty()
	// ---------
		public boolean isEmpty(){
			return root == null;  // Cheap way to express the if statement
		} // end isEmpty
		
		
	// toString()
	// ----------
		
		public void toStringPrint(){
			
			Node parent = root;
			Node child=root;
			System.out.print("[" + parent.getValue());
			
			if(parent!=null){
				if(parent.getRightNode()!=null){
					System.out.println("R[" + parent.getValue());
					child = parent.getRightNode();
					parent = parent.getRightNode();
				}
				else if(parent.getRightNode()==null){
					System.out.println("]");
					parent = child.getRightNode();  // go back up level
				}
				
				else if(parent.getLeftNode()!=null){
					System.out.println("L[" + parent.getValue());
					child = parent.getLeftNode();
				}
				else if(parent.getLeftNode()==null){
					System.out.println("]");
					parent = child.getLeftNode();
				}

			}// end if
		} // end toString

}  // end Class

