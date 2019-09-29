import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Server3{

    public static void main(String[] args) throws RemoteException {
        try{

            ServerInterface Skleton = new ServerImplement();
            LocateRegistry.createRegistry(2003);
            Naming.rebind("rmi://localhost:2003/tag",Skleton);
            System.out.println("Skeleton3 is binded with Registry");

        }

        catch(Exception e){
            System.out.println(e); 
        }
    }
}