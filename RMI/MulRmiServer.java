package RMI;

import java.rmi.Naming;

public class MulRmiServer {
	public static void main(String[] args) throws Exception{
		MulRmiImp m =  new MulRmiImp();
		Naming.rebind("huhuhu", m);
		System.out.println("Server rmi is runnig.");
	}
}
