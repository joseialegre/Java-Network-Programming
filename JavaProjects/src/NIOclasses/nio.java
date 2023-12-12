package NIOclasses;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class nio {
    public static void main(String[] args){

        FileChannel fc;
        DatagramChannel dc; // Supports UPD communications
        SocketChannel sc; // Is used with a TCP client (This is UDP)
        ServerSocketChannel ssc; // This is used for the TCP server (This is TCP)
    }
}
