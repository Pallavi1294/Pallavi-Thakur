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
public class commissionedBasedPartTime extends Parttime implements IDisplay{
    
    
private int commissionPercent;



public double calEarnings() {

double earnings = super.getRate() * super.getHoursWorked();


double com = earnings*(commissionPercent/100);

return earnings+com;
  

}
@Override

public void displayMyData() {

}}
