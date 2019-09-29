import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class ServerImplement extends UnicastRemoteObject implements ServerInterface{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public ServerImplement() throws RemoteException{
        super();
    }

    @Override
    public String toUpper(String str1) throws RemoteException{
        String ans;
        ans=str1.toUpperCase();
        return ans;
    }

    @Override
    public String toLower(String str1) throws RemoteException{
        String ans;
        ans=str1.toLowerCase();
        return ans;
    }

    @Override
    public String add(String str1,String str2) throws RemoteException{
        String ans;
        ans=str1+" and "+str2;
        return ans;
    }
}
