/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inhiretance;

/**
 *
 * @author MshzidanPC
 */
public class HourlyEmp extends Empolyee {
 protected double workingHours ;
 protected  double hourlyRate ;


    public HourlyEmp(String a, double s, String l, String u, double sal, String j) {
        super(a, s, l, u, sal, j);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    @Override
    
    public double get_salary(){
    
    return workingHours * hourlyRate;
    }
}
