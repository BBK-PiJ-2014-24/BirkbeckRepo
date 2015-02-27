package qu1;

public class TestLibrary {

	public static void main(String[] args) {
		
		TestLibrary tl = new TestLibrary();
		tl.launch();
	}
	
	public void launch(){
		
		Library myLibrary = new LibraryImpl("CroydonLibrary");
		System.out.println("The Library Name is: " + myLibrary.getLibraryName() );
		
		myLibrary.setMaxBookPerUser(3);
		System.out.println("The maximum num of books on loan is: " + myLibrary.getMaxBookPerUser());
		
		myLibrary.addBook("The Power of Now", "Tolle");
		myLibrary.addBook("AntiFragile", "Taleb");
		myLibrary.addBook("Java Heaf First", "Reilly");
		myLibrary.addBook("War and Peace", "Tolstoy");
		
		System.out.println("The Number of Books in the Libary: " + myLibrary.getBookCount());
		
		
		LibUser user1 = new LibUserImpl("Calum Smith");
		System.out.println("Calum Smith ID: "+ myLibrary.getID("Calum Smith"));
		LibUser user2 = new LibUserImpl("Ken Adams");
		LibUser user3 = new LibUserImpl("Richard Dunbar");
		LibUser user4 = new LibUserImpl("Natalie Gill");
		LibUser user5 = new LibUserImpl("Alan Bridges");
		LibUser user6 = new LibUserImpl("Guy Bridges");
		
	
		
		
		
			
		
		
		
	}  // end launch()
} // end class
