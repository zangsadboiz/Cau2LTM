package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CapitalizeRmiImp extends UnicastRemoteObject implements CapitalizeRmi {

    protected CapitalizeRmiImp() throws RemoteException {
        super();
    }

    public String toUpperCase(String input) {
        return input.toUpperCase();
    }
}
