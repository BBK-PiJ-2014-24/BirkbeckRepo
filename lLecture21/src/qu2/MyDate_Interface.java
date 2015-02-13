package qu2;


import java.rmi.Remote;
import java.rmi.RemoteException;



public interface MyDate_Interface extends Remote{
	
	String printTimeStamp() throws RemoteException;
	
}