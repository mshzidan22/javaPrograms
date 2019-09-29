/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inhiretance;

/**
 *
 * @author MshzidanPC
 */
public abstract class Empolyee extends Person {
    
    protected double salary ;
    protected String job ;

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


public Empolyee (String a ,double s , String l, String u , double sal , String j){
super(a, s, l, u);
salary = sal;
job = j ;

}
    
    

public abstract double get_salary(); 

@Override
public void print_all_info(){
    super.print_all_info();
    System.out.println("job=="+job+"\n"+"salary=="+salary);

}
} 