package Payroll;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author macstudent
 */
public abstract class Parttime extends Employee implements IDisplay  {
    
    private double rate;
    private int hoursWorked;
    
    Parttime p;
    
    public double getRate(){
        this.rate = rate;
        return 1000;
    }
    
    public int getHoursWorked() {
        return hoursWorked;
    }
    
    public void setHoursWorked(int hoursWorked) {
        
        this.hoursWorked = hoursWorked;
    }
    
    public void settype(){
        
     }
    
}
