package qu1;

import java.rmi.*;
import java.rmi.Naming;


public class EchoClient{
	
	// main()
	// ------
	
	
	public static void main(String[] args){
		EchoClient client = new EchoClient();
		client.launch();
	}
	
	// launch()
	public void launch(){
		
		if(System.getSecurityManager()==null){
			System.setSecurityManager(new SecurityManager());
		}
		
		try{
			EchoService CallRemoteServer = (EchoService) Naming.lookup("//127.0.0.1:1099/TheServer");
			
			String remoteAnswer = CallRemoteServer.echo("This is a test msg!");
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}
	
	
	
}