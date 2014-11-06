
public class testEnum {

	public static void main(String[] args) {
		// MyFirstEnum
		// -----------

		MyFirstEnum e = MyFirstEnum.CAT;
		
		
		System.out.println("e: " + e);
		System.out.println("e.getName(): "+ e.getName());
		System.out.println("e.getAge(): " + e.getAge());
		System.out.println("e.name(): " + e.name());
		System.out.println("e.values(): "+ e.values());
		System.out.println();
		
		// Coin Enum
		// ---------
		
		CoinEnum c;
		c = CoinEnum.QUARTER;
		
		switch(c){
			case PENNY:
				System.out.println("PENNY = " + c.getCoinValue());
				break;
			case NICKLE:
				System.out.println("NICKEL = " + c.getCoinValue());
				break;
			case DIME:
				System.out.println("DIME = " + c.getCoinValue());
				break;
			case QUARTER:
				System.out.println("QUARTER = " + c.getCoinValue());
				break;	
		}
		
		
	}

}
