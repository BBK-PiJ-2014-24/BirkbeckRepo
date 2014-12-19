package map;

import supermarketPack.Person;

public class TestHashUtilities {

	public static void main(String[] args) {
		// Create Some Objects
		// -------------------
		Person p1 = new Person("Stew", 45);
		Person p2 = new Person("Mike",48);
		Person p3 = new Person("Rob",40);
		Person p4 = new Person("Portia", 42);
		Person p5 = new Person("Pascale", 44);
		Person p6 = new Person("Jessica",38);
		Person p7 = new Person("Mary", 46);
		
		// Find their hashCodes
		// --------------------
		int h1 = p1.hashCode();
		int h2 = p2.hashCode();
		int h3 = p3.hashCode();
		int h4 = p4.hashCode();
		int h5 = p5.hashCode();
		int h6 = p6.hashCode();
		int h7 = p7.hashCode();
		
		// Convert hashCodes to 0<h<1000
		// -----------------------------
		int hh1 = HashUtilities.shortHash(h1);
		int hh2 = HashUtilities.shortHash(h2);
		int hh3 = HashUtilities.shortHash(h3);
		int hh4 = HashUtilities.shortHash(h4);
		int hh5 = HashUtilities.shortHash(h5);
		int hh6 = HashUtilities.shortHash(h6);
		int hh7 = HashUtilities.shortHash(h7);
		
		// Results
		// -------
		System.out.println("Hash Conversions");
		System.out.println(h1 + "\t" + hh1);
		System.out.println(h2 + "\t "+ hh2);
		System.out.println(h3 + "\t "+ hh3);
		System.out.println(h4 + "\t "+ hh4);
		System.out.println(h5 + "\t "+ hh5);
		System.out.println(h6 + "\t "+ hh6);
		System.out.println(h7 + "\t "+ hh7);
		
		
		
	}

}
