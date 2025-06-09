package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MulRmi extends Remote{
	public int doMul(int n) throws RemoteException;
}
