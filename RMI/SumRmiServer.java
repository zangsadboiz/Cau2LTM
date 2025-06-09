package RMI;

import java.rmi.Naming;

public class SumRmiServer {
	public static void main(String[] args) throws Exception{
		SumRmiImp kk = new SumRmiImp();
		Naming.rebind("hehehe", kk);
		System.out.println("Sv ss");
	}
}
