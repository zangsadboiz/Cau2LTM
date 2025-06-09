package RMI;

import java.rmi.Naming;
import java.util.Scanner;

public class CapitalizeRmiClient {
    public static void main(String[] args) throws Exception {
        String url = "rmi://localhost/uppercase";
        CapitalizeRmi service = (CapitalizeRmi) Naming.lookup(url);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi thuong: ");
        String input = scanner.nextLine();

        String result = service.toUpperCase(input);
        System.out.println("Chuoi in hoa: " + result);
        
       
//     // Chuỗi chữ thường có sẵn
//        String input = "xin chao";
//        String result = service.toUpperCase(input);
//
//        System.out.println("Chuỗi ban đầu : " + input);
//        System.out.println("Chuỗi in hoa  : " + result);
    }
}
