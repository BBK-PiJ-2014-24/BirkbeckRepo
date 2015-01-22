package qu_5;

import java.util.ArrayList;

public class PrimeDivisorListImpl implements PrimeDivisorList{

	ArrayList<Integer> pList = new ArrayList<Integer>();
	
	@Override
	public void add(Integer x) throws NullPointerException{
		
		if(x == null)
			throw new NullPointerException();
		else
			pList.add(x);
	}

	@Override
	public void remove(Integer x){
		
		int index = pList.indexOf(x);
		if(index != -1)
			pList.remove(index);
		else
			System.out.println(x + " is not in the PrimeList");
	}

	@Override
	public int size() {
		return pList.size();
	}
	
	
	public boolean testPrimeNumber(Integer x) throws IllegalArgumentException{
		
		 double y = Math.sqrt(x);
		 int sqrtX = (int) y; 
		 int factor = 2;
		 
		 
		 if(x <= 0){
			throw new IllegalArgumentException("Number Must be Greater than 0."); 
		 }
			 
		 else if(x == 1 || x == 2)
			return true;
		 else {
			 while(factor < sqrtX){
				 if(x % factor == 0)
					 return false;
				 else
					 factor++;
			 }
		 }
	return true;
	}
		 
}
