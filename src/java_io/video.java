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
public class video {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("F:\\elsalim.mp4"));
            FileInputStream fis2 = new FileInputStream(new File("F:\\BVR_bayez.mp4"));
            FileOutputStream fos = new FileOutputStream(new File("F:\\gidid.mp4"));
            BufferedInputStream bis  = new BufferedInputStream(fis);
            BufferedInputStream bis2  = new BufferedInputStream(fis2);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            
            int a ; 
            int headerSize = 2^20;
            int unheaderSize = 37064704-headerSize;
            
            for(int i =0 ; i<headerSize ; i++){
            a=bis.read();
            bos.write(a);
            }
             System.out.println("finished 1 ");  
             
             for(int y=0 ;y<headerSize;y++){
             bis2.read();
             }
             
             System.out.println("finshed2");
            for(int z=0;z<unheaderSize;z++){
            a=bis2.read();
            bos.write(a);
            
            }
            System.out.println("Finshed3");
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(video.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(video.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
      
      



        
    }
}
