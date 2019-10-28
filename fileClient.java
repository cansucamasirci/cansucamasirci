import java.io.*;
import java.net.*;

public class fileClient {
    public static void main (String[] args) throws Exception {
        
        byte []b=new byte[2000];
        Socket sr=new Socket("localhost",4333);
        InputStream is=sr.getInputStream();
        FileOutputStream fr=new FileOutputStream("D:\\2.txt");
        is.read(b, 0, b.length);
        fr.write(b, 0, b.length);
        
    } 
    
}
