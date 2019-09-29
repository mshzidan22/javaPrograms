/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MshzidanPC
 */
public class heliuem {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("F:\\name.txt"));
            ArrayList<String> al = new ArrayList<>();
            
            String s ;
            while((s = bf.readLine())!= null){
            al.add(s);
            
            }
            System.out.println(al);
            
            //////////////////////////////////
            
            
            BufferedReader bf2 = new BufferedReader(new FileReader("F:\\url.txt"));
            ArrayList<String> al2 = new ArrayList<>();
            
            String s2 ;
            while((s2 = bf2.readLine())!= null){
            al2.add(s2);
            
            }
            System.out.println(al2);
            
            
       //////////////////////////////////////////////////////
            for(int i = 0 ; i<al.size();i++){
                System.out.println("<a href ='"+al2.get(i) +"'>"+al.get(i)+"</a><br>");
            
            
            }            
            
            
        } catch (IOException ex) {
            Logger.getLogger(heliuem.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    
}
