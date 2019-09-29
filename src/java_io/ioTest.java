/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MshzidanPC
 */
public class ioTest {
    public static void main(String[] args) {
        
        try {
          FileInputStream  fis = new FileInputStream(new File("F:\\one punch man\\OnePunchMan2ndSeason10.mp4"));
            FileOutputStream fos = new FileOutputStream(new File("F:\\one punch man\\copyofOnePunchMan2ndSeason10.mp4"));
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int a ;
            
            long startTime =System.nanoTime();
            while((a = bis.read()) != -1 ){
            bos.write(a);
            }
            
            long endTime =System.nanoTime();
            bis.close();
            bos.close();
            System.out.println((endTime-startTime)/1000000);
        } catch (IOException ex) {
            Logger.getLogger(ioTest.class.getName()).log(Level.SEVERE, null, ex);
        
        } 
            }
            }
            
            
            
            
            
            
            
            

      
     
              
              


