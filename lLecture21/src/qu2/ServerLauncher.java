package qu2;

import java.rmi.*;
import java.rmi.server.*;

import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
	
import java.rmi.RemoteException;
import java.net.MalformedURLException;	
	

public class ServerLauncher{
	
	public static void main(String[] args){
		
		if(System.getSecurityManager()==null){
			System.setSecurityManager(new SecurityManager());
		}
		
		try{
			LocateRegistry.createRegistry(1099);
			MyDate_Interface server = new MyDate_Impl();
			Naming.rebind("MyServerName",server);
			System.out.println("SERVER IS ACTIVATED");
		}
		catch(RemoteException ex1){
			ex1.printStackTrace();
		}
		catch(MalformedURLException ex2){
			ex2.printStackTrace();
		}
		
		
		
	}
}

