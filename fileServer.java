import java.io.*;
import java.net.*;

public class fileServer {
    public static void main (String[] args) throws Exception {
        ServerSocket s=new ServerSocket(4333);
        Socket sr=s.accept();
        FileInputStream fr;
        fr = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\cns.txt");
        byte b[]=new byte[2002];
        fr.read(b, 0, b.length);
        OutputStream os=sr.getOutputStream();
        os.write(b, 0, b.length);
        
    }
}

