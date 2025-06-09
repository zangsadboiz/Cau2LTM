package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface SumRmi extends Remote{
	public int doSum(int n) throws RemoteException;
}  