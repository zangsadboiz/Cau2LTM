package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SumRmiImp extends UnicastRemoteObject implements SumRmi{
	
	protected SumRmiImp() throws RemoteException{
		
	}
	int n = 6;
	public int doSum(int n) {
		int kq = 0;
		for(int i = 0; i <= n; i++) {
			kq += i;
		}
		return kq;
	}
}
