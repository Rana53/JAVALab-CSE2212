import java.util.*;
import java.rmi.*;

public class Client{
    public static void main(String arg[]){
        try{

            Scanner sc = new Scanner(System.in); 
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            ServerInterface Stub1= (ServerInterface) Naming.lookup("rmi://localhost:2001/tag");
            String ans1=Stub1.toUpper(str1);

            ServerInterface Stub2= (ServerInterface) Naming.lookup("rmi://localhost:2002/tag");
            String ans2=Stub1.toLower(str2);

            ServerInterface Stub3= (ServerInterface) Naming.lookup("rmi://localhost:2003/tag");
            String ans=Stub1.add(ans1,ans2);

            System.out.println(ans);

        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}