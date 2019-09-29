/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inhiretance;

/**
 *
 * @author MshzidanPC
 */
public class Person {
    
    protected String name ;
    protected double age ;
    protected String nationlaty;
    protected String address ;
    
    public Person() {}
    public Person (String n , double a , String nat , String add){
    name = n;
    age = a; 
    nationlaty =nat ;
    address = add ;
    }
    
    ///setter
    public void setName(String s){name = s ;}
    public void setAge(double s){age = s;}
    public void setNationality(String s){nationlaty = s ;}
    public void setAddress(String s){address = s ;}
    ///getter
    public String getName(){return name ;}
    public double getAge(){return age ;}
    public String getNationality(){return nationlaty ;}
    public String getAddress(){return address ;}
    
    public void print_all_info(){
    System.out.println("Name == "+name+"\n" + "Age == " +age+ "\n"+ "Nationality ==" +nationlaty+"\n" +"Address ==" +address+ "\n" );
    
    
    }
}
