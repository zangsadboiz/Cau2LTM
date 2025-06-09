package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CapitalizeRmi extends Remote {
    public String toUpperCase(String input) throws RemoteException;
}
