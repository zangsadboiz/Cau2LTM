package RMI;

import java.rmi.Naming;

public class MulRmiClient {
	public static void main(String[] args) throws Exception {
		String url = "rmi://localhost/huhuhu";
		MulRmi no = (MulRmi) Naming.lookup(url);
		int n;
		System.out.println("Ket qua: " + no.doMul(9));
	}
}
