import java.io.IOException;
import java.io.ObjectInputStream;
import  java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket server = new ServerSocket(8081);
        Socket s = server.accept();
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());


        while(true) {
            MouseCoordinates coord = (MouseCoordinates) in.readObject();
            System.out.println("Mouse X: " + coord.x + "Mouse Y: " + coord.y);


        }
    }
}
