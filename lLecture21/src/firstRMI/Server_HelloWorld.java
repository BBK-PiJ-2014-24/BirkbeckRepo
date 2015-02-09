package firstRMI;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.rmi.server.UnicastRemoteObject;

public class Server_HelloWorld extends UnicastRemoteObject implements HelloWorld{

	
	// Constructor
	// -----------
	protected Server_HelloWorld() throws RemoteException {
		super();
	}

	// HelloWorld()
	// ------------
	@Override
	public String HelloWorld() throws RemoteException {
		System.out.println("Invocation to helloWorld was succesful!"); 
		return "Hello World from RMI server!";
	}
	
	// main()
	// ------
	public static void main(String[] args){
		
		
		try{
			Server_HelloWorld obj = new Server_HelloWorld(); // Instant itself - i.e. server.
			Naming.rebind("HelloWorld", obj);
			System.out.println("HelloWorld bound in registry");
		}
		catch (Exception e){
			System.out.println("HelloWorldServer error: " + e.getMessage());
		    e.printStackTrace();
		}
		
	}  //end main
	
	

}
