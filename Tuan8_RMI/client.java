import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;



public class client {
    private static StringInterface look_up;
    static Scanner sc;

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        look_up = (StringInterface) Naming.lookup("rmi://localhost/string");
        while (true) {

        System.out.println("1. in hoa chu dau\n2. dao nguoc chuoi\nexit de ket thuc\n");
        System.out.println(" chon:");
        sc = new Scanner(System.in);
        String choose = sc.nextLine();
        if(choose.equals("exit")){
           break;
        }else if(choose.equals("1")){
             System.out.print(" nhap 1 chuoi:");
        
            sc = new Scanner(System.in);
            String a = sc.nextLine();
            System.out.println("in hoa chu dau:" + look_up.upperCase(a)+"\n\n");
        }else if(choose.equals("2")){
             System.out.println(" nhap 1 chuoi:");
        
            sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println("in hoa chu dau:" + look_up.reverse(str)+"\n\n");
  
        

        }
        }

    }
}
