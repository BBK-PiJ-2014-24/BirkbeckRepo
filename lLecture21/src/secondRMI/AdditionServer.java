package secondRMI;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;
import java.rmi.Naming;

public class AdditionServer {

	public static void main(String[] args){
		
		try{
			if(System.getSecurityManager() == null)
				System.setSecurityManager(new SecurityManager());  // Set Up Security Manager
			
			
			LocateRegistry.createRegistry(1099);  // Locate Registry on a Port
			
			Addition server = new Addition();  // Instant Server Obj
			
			String registryHost = "//localhost/";
			String serviceName = "Addition"; 
			Naming.rebind(registryHost + serviceName, server);
			
			//Naming.rebind("rmi://localHost/ABC", server);  // Bind the Server to the Registry ..."rmi://localHost/ABC"
			
			
			System.out.println("Addtion Server is Ready!");
		}
		catch(MalformedURLException eURL){
			System.out.println("Addition Server Failed! " + eURL.getMessage());
		}
		catch(RemoteException ex){
			System.out.println("Addition Server Failed! " + ex.getMessage());
		}
		
	} // end main
	
}
