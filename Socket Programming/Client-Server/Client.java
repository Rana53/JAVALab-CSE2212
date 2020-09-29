import java.net.Socket;
public class Client {
  public static void main(String[] args) {
    try {
      System.out.println("Client");
      Socket client1 = new Socket("localhost",9090);
    } catch (Exception e) {
      System.out.println(e);
    }
  }   
}