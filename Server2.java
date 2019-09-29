import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Server2{

    public static void main(String[] args) throws RemoteException {
        try{

            ServerInterface Skleton = new ServerImplement();
            LocateRegistry.createRegistry(2002);
            Naming.rebind("rmi://localhost:2002/tag",Skleton);
            System.out.println("Skeleton2 is binded with Registry");

        }

        catch(Exception e){
            System.out.println(e); 
        }
    }
}