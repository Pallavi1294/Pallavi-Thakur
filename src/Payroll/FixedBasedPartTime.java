/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;

/**
 *
 * @author hp
 */
public class FixedBasedPartTime extends Parttime implements IDisplay {
    
    private double fixedAmount;
    
    public double calcEarnings1(){
    double earnings;
        earnings = super.getRate() * super.getHoursWorked();
    return earnings;
    }
    
@Override

public void displayMyData() {
        }

    }
    

