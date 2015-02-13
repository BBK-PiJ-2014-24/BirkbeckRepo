package qu1;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;


public class EchoServer extends UnicastRemoteObject implements EchoService {

	protected EchoServer() throws RemoteException {
		super();
	}

	@Override
	public String echo(String s) throws RemoteException {
		System.out.println("Echoing client Request saying: " + s );
		return s;
	}

}
