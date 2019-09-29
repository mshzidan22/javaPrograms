/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inhiretance;

/**
 *
 * @author MshzidanPC
 */
public class Main {
    
    
    public static void main(String[] args) {
        
      SalaredEmp se = new SalaredEmp("Ahmed", 15, "Cairo", "Egypt", 5000, "Manger", 15, 11);
       se.setSalary(6000); 
        System.out.println(se);
    }
    
}
