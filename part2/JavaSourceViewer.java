/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication32;
import java.io.*;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author markf
 */
public class JavaSourceViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        String i=args[1];
        try{
        URL u=new URL(args[0]);
        URLConnection uc = u.openConnection();
        InputStream in =u.openStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(isr);
            String str;
            int begin;
            int end;
            String content;
            while((str=reader.readLine())!=null){


               String regex = ">(.*)<";
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(str);
	       while (matcher.find()) {
                   if(matcher.group(1).contains(i)){
	           System.out.println(matcher.group(1));
                   }
	       }
               //if(matcher.group(1).contains(i)){
                  // System.out.println(matcher.group(1));
               }
                //content=str.substring(begin, end);


        }catch(MalformedURLException ex){
            System.out.println("It is not valid");
        }
    }

}
