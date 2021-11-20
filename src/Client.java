import java.io.*;
import java.net.Socket;

public class Client implements Serializable {

    public static void main(String[] args) throws  IOException{
        Socket s = new Socket("localhost", 8081);


	    ObjectOutputStream out;

	    out = new ObjectOutputStream(s.getOutputStream());

	    while(true) {

	        out.writeObject(new MouseCoordinates());

        }
    }
}
