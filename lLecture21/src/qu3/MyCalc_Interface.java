package qu3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyCalc_Interface extends Remote{

	public int add(int x, int y) throws RemoteException;
	public int subtract(int x, int y) throws RemoteException;
	public int multiply(int x, int y) throws RemoteException;
	public double divide(int x, int y) throws RemoteException;

}