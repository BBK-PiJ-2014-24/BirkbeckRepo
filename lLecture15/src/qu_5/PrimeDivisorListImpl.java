package qu_5;

import java.util.ArrayList;

public class PrimeDivisorListImpl implements PrimeDivisorList{

	ArrayList<Integer> pList = new ArrayList<Integer>();
	
	@Override
	public void add(Integer x) {
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
	

}
