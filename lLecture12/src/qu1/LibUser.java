/**
 * 1.2
Create a class for the users of the library. Users have a name and a library-ID (an int), 
both of which must be unique in a library. The name is set at construction time, but the library-ID is 
not. 
The class must implement methods to get the name of the person and their ID, and to set the latter.
 */

package qu1;

import java.util.List;

public interface LibUser {

/**
 * setUserName 
 * @param name - UserName
 */
 void setUserName(String name);

 
 /**
  * getUserName - gets UserName
  * @return - UserName
  */
 String getUserName();
 
 
 
 /**
  * setUserID - sets user ID
  * @param ID
  */
 void setUserID(int ID);
 
 
 /**
  * getUserID - get User ID
  * @return ID
  */
 int getUserID();
 
 
 
/**
 * register - Method for User to Register with a Library
 * @param l  - Name of Library
 */
 void register(Library l);
 
 
 
 /**
  * getLibrary - returns Library user is registered at.
  * @return
  */
 Library getLibrary();

 /**
  * getBorrowedBookList()
  * list (or an array) with the titles of all the books they are borrowing at the moment.
  * @return list (or an array) with the titles of all the books borrowed
  */
 List<String> getBorrowedBookList();
 
 
 /**
  * borrowBook()
  * - Method for user to borrow a book
  * @param - Title of Book to Borrow;
  */
 void borrowBook(String t);
 
 /**
  * getUserBookCount - Counts Number of Books User has on Loan
  * @return - Number of Books User has on Loan
  */
 int getUserBookCount();
 
 /**
  * returns Book on Loan to Library.
  */
 void returnBook(String t);
 
}
