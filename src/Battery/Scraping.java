/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Battery;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MshzidanPC
 */
public class Scraping {
    
    
    public static void main(String[] args) throws IOException {
       
            File fr = new File("C:/Users/MshzidanPC/Desktop/test.txt");
        try {
            Scanner s = new Scanner(fr);
            
            while(s.hasNext()){
            String line = s.nextLine();
                
            FileWriter fw = new FileWriter(new File("C:/Users/MshzidanPC/Desktop/test1.txt"));
            fw.write(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Scraping.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
  
    
    
    
}
