package qu2;

import java.rmi.server.*;
import java.rmi.Naming;
import java.rmi.RemoteException;


public class MyDate_Client{
	
	public static void main(String[] args){
		MyDate_Client client = new MyDate_Client();
		client.launch();
	}
	
	public void launch(){
	
		if(System.getSecurityManager()==null){
			System.setSecurityManager(new SecurityManager());
		}
		try{
		    MyDate_Interface RemoteServer = (MyDate_Interface) Naming.lookup("//127.0.0.1:1099/MyServerName");
		
		    String s = RemoteServer.printTimeStamp();
		    System.out.println(s);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		    		
		
	}
	
}

