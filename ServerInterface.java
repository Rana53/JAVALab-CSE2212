import java.rmi.*;

public interface ServerInterface extends Remote{
    public String toUpper(String str1) throws RemoteException;
    public String toLower(String str1) throws RemoteException;
    public String add(String str1,String str2) throws RemoteException;


}