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

package integerBinaryTree_Recursive;

public class MyRecursiveTree {
	
	
	// Fields
	// ------
	private int value;
	MyRecursiveTree leftNode;
	MyRecursiveTree rightNode;
		
	// Constructor
	// -----------
	public MyRecursiveTree(int v){
		value = v;
		rightNode=null;
		leftNode=null;
	}
	
	// getterSetter
	// ------------

	public int getValue(){
		return value;
	}
	
	public void setValue(int v){
		value = v;
	}
	
	public MyRecursiveTree getRightNode(){
		return rightNode;
	}
	
	public void setRightNode (MyRecursiveTree r){
		rightNode = r;
	}
	
	public MyRecursiveTree getLeftNode(){
		return leftNode;
	}
	
	public void setLeftNode (MyRecursiveTree r){
		leftNode = r;
	}
	
	
	// add()
	// -----
	public void add(int v){
		if (v > this.value){   
			if(rightNode==null){  // If right Node Empty
				MyRecursiveTree r = new MyRecursiveTree(v);  // Create TreeNode with Value v in it.
				this.setRightNode(r);              // set Right Node
			}
			else
				rightNode.add(v); // If right Node Empty, Recursive Loop
		} //end Right if
		else if(v<this.value){
			if(leftNode==null){ // If left Node Empty
				MyRecursiveTree l = new MyRecursiveTree(v); // Create TreeNode with Value v in it.
				this.setLeftNode(l);   // Set Left Node
			}
			else
				leftNode.add(v); // If left Node Empty, Recursive Loop
		}// end left if	
		else
			System.out.println("\nThe Number "+ v + " is Already In the Tree");
	} // end add()
	
	
	// getMin()
	// --------
	public int getMin(){
		if(leftNode==null)
			return this.value;
		else
			return leftNode.getMin();
	}
	
	
	// getMax()
	// --------
	
	public int getMax(){
		if(rightNode==null)
			return this.value;
		else
			return rightNode.getMax();
	}
	
	
	// contains()
	// ----------
	
	public boolean contains(int v){
		
		if(v == this.value)   
			return true;
		
		else if (v > this.value){
		    if(rightNode!=null)
		    	return rightNode.contains(v); // recursion of contains() returns a boolean type
			else
				return false;
			}
		else if(v< this.value){
			if(leftNode!=null)
				return leftNode.contains(v);  // recursion of contains() returns a boolean type
			else
				return false;
		}
		else
			return false;
	} // end Contains


	



	// toString()
	// ----------
/*	@Override
	public String toString1(){
		String str = "["+ this.value + " L";
	
	if(leftNode==null){
		if(rightNode==null)
			str += "[] R[]";
		else
			str += "[] R";
	}
	else
		return str + leftNode.toString();
	
	if(rightNode==null){
		if(leftNode==null)
			str += " ";
		else
			str += "R[] ";
	}
	else{
		if(leftNode!=null && rightNode!=null)
			str += "R";
		return str + rightNode.toString();
	}
	
		str +="]";
		return str + "5";
} // end toString()
*/	
	//======================
@Override	
public String toString(){
	String str = "[" + value;
	
	if(leftNode==null)
		str += " L[] ";
	else{
		str += " L";
		return str + leftNode.toString();
	}
	
	if(rightNode==null)
		str+=" R[] ";
	else{
		str+="R";
		return str + rightNode.toString();
	}
			
	if(leftNode==null && rightNode==null)
		str+="]";
	
	return str +"5";
	
}
	
	

	public void twoString(){
			System.out.print("["+ this.value + " L");
		
		if(leftNode==null){
			if(rightNode==null)
				System.out.print("[] R[]");
			else
				System.out.print("[] R");
		}
		else
			leftNode.twoString();
		
		if(rightNode==null){
			if(leftNode==null)
				System.out.print(" ");
			else
				System.out.print("R[] ");
		}
		else{
			if(leftNode!=null && rightNode!=null)
				System.out.print("R");
			rightNode.twoString();
		}
		
			System.out.print("]");
	} // end TwoString()
	
	
	// depth()
	// -------
	
	public int depth(){
		if(leftNode==null && rightNode==null)
			return 0;					//Base Case for Recursion
		
		else if(leftNode!=null && rightNode==null)
			return 1+ leftNode.depth();
		else if(leftNode==null && rightNode!=null)
			return 1+ rightNode.depth();
		else
			return 1 + Math.max(rightNode.depth(),leftNode.depth());  // Recursion on the max branch
	}
	
	
}// end CLASS
