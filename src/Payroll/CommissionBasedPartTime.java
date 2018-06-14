/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;


public class CommissionBasedPartTime extends Parttime implements IDisplay{
    
    
private double commissionPercent;
static double earnings;
static double commission;
    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(double commissionPercent) {
        this.commissionPercent = commissionPercent;
    }



public double calEarnings() {

earnings = this.getRate() * this.getHoursWorked();


commission = earnings*(commissionPercent/100);

return earnings+commission;}

    @Override
    public void displayMyData() {
        
System.out.println("Part Time/Commission Based :"
+"\nName of Employee :" + this.getName()
+" \n Birth Year :" + this.calcBrithYear() 
+ " \n Earnings :" + this.calEarnings() + "("+CommissionBasedPartTime.earnings +" + " +this.getCommissionPercent() +"%" + "of" +CommissionBasedPartTime.earnings + ")"
+"\n Total Hours:" + this.getHoursWorked()
+"\n Pay Rate:" + this.getRate()
+"\nVehicle Details :" +this.getVehicle().getProducer()
+ "\n Vehicle Number :" + this.getVehicle().getNumPlate() 
+"\n Color of Vehcle :" + this.getVehicle().getColor() 
+ "\n Model Number :" + this.getVehicle().getModel());
       
    }

}




