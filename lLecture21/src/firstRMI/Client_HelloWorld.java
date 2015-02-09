package firstRMI;

import java.rmi.Naming;

public class Client_HelloWorld {


	// Fields
	// ------
	
    static String message = "blank";
    static HelloWorld obj = null;  // The HelloWorld object "obj" is the identifier that is
    							  // used to refer to the remote object that implements	
    							 // the HelloWorld interface.	
    
    // main()
    // ------
    
    public static void main(String[] args){
    	
    	
    	try{
    		obj = (HelloWorld)Naming.lookup("pathname");  // seems to look up the address of server class
    		message = obj.HelloWorld();    // message comes the output of the server method 
    		
    		System.out.println("Message from the RMI-server was: "  + message );
    	}
    	catch (Exception e) {
    		System.out.println("Client_HelloWorld  Exception: "  + e.getMessage());
            e.printStackTrace();
    	}
    	
    	
    } // end main
    
    
    
    
	
}
