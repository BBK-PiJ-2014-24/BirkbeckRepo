package qu1;

import java.rmi.*;
import java.rmi.server.*;

import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

import java.net.MalformedURLException;
import java.rmi.RemoteException;


@SuppressWarnings("deprecation")
public class EchoServerLauncher {

	public static void main(String[] args){
		
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager()); }
		
		try {
				LocateRegistry.createRegistry(1099);
				
				EchoService server = new EchoServer();
				String registryHost = "TheServer"; 
				Naming.rebind(registryHost, server);
				System.out.println("\nServer is Registered");
				
		} catch (RemoteException e) {
			System.out.println("Remote ERROR!");
			e.printStackTrace();
		} catch (MalformedURLException e) {
			System.out.println("Mal URL ERROR!");
			e.printStackTrace();
		}
		
		
	}
	
}
