package firstRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloWorld extends Remote{

	String HelloWorld() throws RemoteException;
	
}
