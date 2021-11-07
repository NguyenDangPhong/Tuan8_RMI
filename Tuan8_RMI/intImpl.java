import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class intImpl extends UnicastRemoteObject implements StringInterface {

    public String upperCase(String str) throws RemoteException {
        char[] in = str.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < in.length; i++) {

            if (Character.isLetter(in[i])) {
                if (foundSpace) {
                    // đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
                    in[i] = Character.toUpperCase(in[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        return String.valueOf(in);
    }
    public boolean checkExit(String str) throws RemoteException {
        if(str.equals("exit")){
            return false;
        }else return true;
    }

    private static final long serialVersionUID = 1L;

    public intImpl() throws RemoteException {
        super();
    }

    public String reverse(String str) throws RemoteException {
        StringBuilder a = new StringBuilder(str);
        return a.reverse().toString();
    }
}
