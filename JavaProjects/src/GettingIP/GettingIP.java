package GettingIP;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class GettingIP {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress web1 = InetAddress.getByName("www.google.com");
        System.out.println("HOST ADDRESS:           "+web1.getHostAddress());
        System.out.println("CANONICAL HOST NAME:    "+ web1.getCanonicalHostName());
        System.out.println("HOST NAME:              "+web1.getHostName());
    }
}
