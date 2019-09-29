import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Server1{

    public static void main(String[] args) throws RemoteException {
        try{

            ServerInterface Skleton = new ServerImplement();
            LocateRegistry.createRegistry(2001);
            Naming.rebind("rmi://localhost:2001/tag",Skleton);
            System.out.println("Skeleton1 is binded with Registry");

        }

        catch(Exception e){
            System.out.println(e); 
        }
    }
}