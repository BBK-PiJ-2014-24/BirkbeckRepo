/**
 * 1.2
Create a class for the users of the library. Users have a name and a library-ID (an int), 
both of which must be unique in a library. The name is set at construction time, but the library-ID is 
not. 
The class must implement methods to get the name of the person and their ID, and to set the latter.
 */

package qu1;

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
 
 void register(LibraryImpl l);
 
 /**
  * getLibrary - returns Library user is registered at.
  * @return
  */
 
 LibraryImpl getLibrary();

 
 
 
 
 
 
}
