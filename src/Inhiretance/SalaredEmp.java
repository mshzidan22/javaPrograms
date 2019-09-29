/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inhiretance;

/**
 *
 * @author MshzidanPC
 */
public class SalaredEmp extends Empolyee {
    protected double bouns ;
    protected double deduction ;

    public double getBouns() {
        return bouns;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

   

    
public SalaredEmp(String n , double age , String add, String nat, double sal, String job , double bouns, double ded){

super(n,age,add,nat,sal,job);
this.bouns = bouns;
deduction = ded; 
}

@Override
public double get_salary(){

return salary+bouns-deduction;
}























}
