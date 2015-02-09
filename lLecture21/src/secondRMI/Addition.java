package secondRMI;

import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Addition extends UnicastRemoteObject implements AdditionInterface{

	protected Addition() throws RemoteException {
		super();
	}

	@Override
	public int add(int x, int y) throws RemoteException {
		
		return x  + y;
	}
	

}
