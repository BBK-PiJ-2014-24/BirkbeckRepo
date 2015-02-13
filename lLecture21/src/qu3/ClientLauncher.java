package qu3;

import java.rmi.*;
import java.rmi.Naming;

import java.rmi.RemoteException;


public class ClientLauncher{

	public static void main(String[] args){
		ClientLauncher client = new ClientLauncher();
		client.launch();
	}
	
	
	public void launch(){
		
		if(System.getSecurityManager() == null){
			System.setSecurityManager(new SecurityManager());
		}
		try{
			MyCalc_Interface remoteServer = (MyCalc_Interface) Naming.lookup("//127.0.0.1:1099/MyServerName");
		
			int w = remoteServer.add(2,3);
			int x = remoteServer.subtract(2,3);
			int y = remoteServer.multiply(2,3);
			double z = remoteServer.divide(2,3);
		
			System.out.println("add 2+3 = " + w);
			System.out.println("subtract 2-3 = " + x);
			System.out.println("multiply 2*3 = " + y);
			System.out.println("divide 2/3 = " + z);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}



}