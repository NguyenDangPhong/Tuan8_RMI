
import java.rmi.Naming;


public class server {

    public static void main(String[] args) {

        try {

            Naming.rebind("rmi://localhost/string", new intImpl());
            System.err.println("Server ready");

        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }
    }
}
