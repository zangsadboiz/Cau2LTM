package RMI;

import java.rmi.Naming;

public class CapitalizeRmiServer {
    public static void main(String[] args) throws Exception {
        CapitalizeRmiImp service = new CapitalizeRmiImp();
        Naming.rebind("uppercase", service);
        System.out.println("RMI Server is running.");
    }
}
