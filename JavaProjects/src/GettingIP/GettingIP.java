package GettingIP;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class GettingIP {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress web1 = InetAddress.getByName("www.google.com");
        System.out.println(web1);
    }
}
