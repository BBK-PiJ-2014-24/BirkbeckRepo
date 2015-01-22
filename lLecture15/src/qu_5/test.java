package qu_5;

public class test {

	public static void main(String[] args) {
		
		PrimeDivisorList list;
		
		list = new PrimeDivisorListImpl();
		
		Integer x1;
		 Integer x2;
		 Integer x3; 
		 Integer x4;
		
		
		x1 = 2;
		x2 = 3;
		x3 = 3; 
		x4 = 7;
				

		list.add(x1);
		list.add(x2);
		list.add(x3);
		list.add(x4);
		
		System.out.println(list.multiplyPrimes());
		
		list.toString();
		
	}

}
