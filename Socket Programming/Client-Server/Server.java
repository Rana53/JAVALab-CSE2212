import java.net.ServerSocket;
import java.net.Socket;
public class Server {
  public static void main(String[] args) {
    System.out.println("Servar waitting for client......\n");
    try {
      ServerSocket serverSocket = new ServerSocket(9090);   
      Socket socketClient1 = serverSocket.accept();
      System.out.println(socketClient1);
      System.out.println(serverSocket);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
}