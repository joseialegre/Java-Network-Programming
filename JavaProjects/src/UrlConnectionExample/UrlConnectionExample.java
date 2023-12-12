package UrlConnectionExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionExample {

    // URL connection Class, simplest way to accessing a server
    // This class represents a connection between an application and a URL instance
    //
    public static void main(String[] args) {
        try{
            URL url = new URL("https://google.com");
            URLConnection myUrlConnection = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(myUrlConnection.getInputStream()));
            String myLine;

            while((myLine = br.readLine()) != null){
                System.out.println(myLine);
            }
            br.close();
        } catch(IOException exception){
            System.out.println(exception.getMessage());
        }

    }
}
