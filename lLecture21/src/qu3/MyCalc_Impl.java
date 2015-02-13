package qu3;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;


public class MyCalc_Impl extends UnicastRemoteObject implements MyCalc_Interface{
	
	public MyCalc_Impl() throws RemoteException{
		super();
	}
	
	@Override
	public int add(int x, int y) throws RemoteException{
		return x + y;
	}
	
	@Override
	public int subtract(int x, int y) throws RemoteException{
		return x - y;
	}
	
	@Override
	public int multiply(int x, int y) throws RemoteException{
		return x*y;
	}
	
	@Override
	public double divide(int x, int y) throws RemoteException{
		return x/y;
	}
	
}

	 
	
	
	
	