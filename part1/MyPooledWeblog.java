/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pooledweblog;
import java.io.*;
import java.net.*;
/**
 *
 * @author markf
 */
public class MyPooledWeblog {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException   {
       if(args[0].isEmpty()){
           System.out.println("the access file is missing");
           System.exit(1);
       }
       if(args[1].isEmpty()){
           System.out.println("The command is missing");
           System.out.println("1 = count number of accesses by each remotehost");
           System.out.println("2 = count total bytes transmitted");
           System.out.println("3 = count total bytes by remotehost");
           System.exit(1);
       }
       getContent content=new getContent();
       BufferedReader reader=content.reader(args);
       getTransmitted byteT=new getTransmitted(args,reader);

       if(args[1].equals("2")){
            byteT.showTransmitted();
        }
       if(args[1].equals("1")){
           byteT.accessCount();
       }
       if(args[1].equals("3")){
           byteT.byteByHost();
       }


       //byteT.accessCount();
      // byteT.byteByHost();


    }

}
