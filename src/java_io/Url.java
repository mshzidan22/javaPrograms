/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.*;
import java.net.URI;


/**
 *
 * @author MshzidanPC
 */
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Url {
    
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.fadelk.com/files/Resources/205/YouTube/IOStreamsP07.pdf");
            URLConnection us =url.openConnection();
            byte a [] = new byte[1000];
            BufferedInputStream bis = new BufferedInputStream(us.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("F:\\one punch man\\pdf.pdf"))) ;
            int x ;
            
            while((x = bis.read()) != -1){
            bos.write(x);
            
            }
            bis.close();
            bos.close();
        } catch (IOException ex) {
            Logger.getLogger(Url.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
}
