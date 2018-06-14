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
    static double earnings;

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
    
    public double calcEarnings(){
     
        earnings = this.getRate() * this.getHoursWorked();
        double sal = fixedAmount;
    return earnings + sal;
    }
    
@Override

public void displayMyData() {
    
    System.out.println("Part Time/Fixed Based :"
+"\nName of Employee :" + this.getName()
+" \n Birth Year :" + this.calcBrithYear() 
+ " \n Earnings :" + this.calcEarnings() +"("+FixedBasedPartTime.earnings + " + " + this.fixedAmount + ")"
  +"\n Total Hours:" + this.getHoursWorked()
+"\n Pay Rate:" + this.getRate()
+"\nVehicle Details :" +this.getVehicle().getProducer()
+ "\n Vehicle Number :" + this.getVehicle().getNumPlate() 
+"\n Color of Vehcle :" + this.getVehicle().getColor() 
+ "\n Model Number :" + this.getVehicle().getModel());
        }

    }
    

