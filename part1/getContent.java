/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pooledweblog;
import java.io.*;
/**
 *
 * @author markf
 */
public class getContent {
    
    public BufferedReader reader(String[] args) throws FileNotFoundException, IOException{
       
       FileInputStream get = new FileInputStream(args[0]);
       Reader in = new InputStreamReader(get);
       BufferedReader reader=new BufferedReader(in);   
       return reader;
        
       }
       
       
      // System.out.println(string.toString());
       
    }

