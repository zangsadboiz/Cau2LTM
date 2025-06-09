package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;

public class MulRmiImp extends UnicastRemoteObject implements MulRmi{
	
	protected MulRmiImp() throws RemoteException{
		
	}
	
	int n;
	public int doMul(int n) {
		int kq = 1;
		for(int i = 1; i <= n; i++) {
			kq *= i;
		}
		return kq;
	}
}
