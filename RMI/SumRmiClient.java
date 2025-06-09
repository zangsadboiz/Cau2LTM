package RMI;

import java.rmi.Naming;

public class SumRmiClient {
	public static void main(String[] args) throws Exception{
		String url = "rmi://localhost/hehehe";
		SumRmi kk = (SumRmi) Naming.lookup(url);
		int n = 6;
		System.out.println("Tong la: " + kk.doSum(n));
	}
}
