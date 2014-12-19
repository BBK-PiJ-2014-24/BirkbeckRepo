 /* 7 Integer
Create your own version of boxed int! Create a class Integer2 with only one field (int value) 
and the following methods:
getValue(): returns the value of this number as an int, a getter. 
setValue(int): a setter.
isEven(): returns true if the number is even, false otherwise. isOdd(): the opposite.
prettyPrint(): prints the value of the integer on the screen. 
toString(): returns a String equivalent to the number.
*/

public class Integer2 {

	private int x;
	
	public int getValue(){
		return x;
	}
	
	public void setValue(int X){
		x = X;
	}
	
	public boolean isEven(){
		if(x%2==0)
			return true;
		else
			return false;
	}
	
	public void prettyPrint(){
		System.out.println(x);
		
	}
	
	
	public String toString(){
		String s = Integer.toString(x);
		return s;
	}
	
} // end class
