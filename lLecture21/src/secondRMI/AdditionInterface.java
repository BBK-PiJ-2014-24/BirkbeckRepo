package secondRMI;

import java.rmi.*;


public interface AdditionInterface extends Remote {

	public int add(int x, int y) throws RemoteException;
	
	
}
