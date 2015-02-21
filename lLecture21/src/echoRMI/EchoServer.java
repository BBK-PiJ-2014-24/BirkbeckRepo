package echoRMI;


import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoServer extends UnicastRemoteObject implements EchoService {

	protected EchoServer() throws RemoteException {
		super();
	}

	@Override
	public String echo(String s) throws RemoteException {
		System.out.println("Replied to some client saying ’" + s + "’");
		return s;
	}

}
