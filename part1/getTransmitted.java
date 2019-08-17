/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pooledweblog;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author markf
 */
public class getTransmitted {
    
    String []args=null;
    BufferedReader reader=null;
    String line=null;
    int bTrans=0;
    ArrayList<Entity> ip =new ArrayList<Entity>(); 
 
    
    public getTransmitted(String []args, BufferedReader reader){
        this.args=args;
        this.reader=reader;
    }
    
    public void showTransmitted() throws IOException{     
        
       while(reader.readLine()!=null){
           line=reader.readLine();
           line=line.replace("-", "");
           String [] arr = line.split("\\s+");
           bTrans+=Integer.parseInt(arr[arr.length-1]);
           //System.out.println(line);
           
       }
       System.out.println("total byte transmitted are "+ bTrans+ " byte");     
    }
    
    public void accessCount() throws IOException{
        
         while(reader.readLine()!=null){
           line=reader.readLine();
           line=line.replace("-", "");
           String [] arr = line.split("\\s+");
           Entity entity = new Entity(arr[0],0,Integer.parseInt(arr[arr.length-1]));
           ip.add(entity);
       }
        
       for  ( int  i  =   0 ; i  <  ip.size()  -   1 ; i ++ )  {       
          for  ( int  j  =  ip.size()  -   1 ; j  >  i; j -- )  {       
           if  (ip.get(j).getIp().equals(ip.get(i).getIp()))  {       
              ip.remove(j);
              ip.get(i).number++;
            }        
        }
       ip.get(i).number++;
      }        
      
       for(Entity entity: ip){
           System.out.println("remotehost: "+entity.getIp()+" acesses "+entity.getNumber()+" times");
       }
       
    }
    public void byteByHost() throws IOException{
       // int TotalByte=0
        while(reader.readLine()!=null){
           line=reader.readLine();
           line=line.replace("-", "");
           String [] arr = line.split("\\s+");
           Entity entity = new Entity(arr[0],0,Integer.parseInt(arr[arr.length-1]));
           ip.add(entity);
           
           for  ( int  i  =   0 ; i  <  ip.size()  -   1 ; i ++ )  {       
          for  ( int  j  =  ip.size()  -   1 ; j  >  i; j -- )  {       
           if  (ip.get(j).getIp().equals(ip.get(i).getIp()))  {  
              ip.get(i).by+=ip.get(j).by;
              ip.remove(j);
              
            }        
        }
       ip.get(i).number++;
      }        
       }
         for(Entity entity: ip){
           System.out.println("remotehost: "+entity.getIp()+" uses "+entity.getBy()+" bytes");
       }
    }
}
    
   

    

