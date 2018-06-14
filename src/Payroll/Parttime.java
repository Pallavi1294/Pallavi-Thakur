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

   
    

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    
    public int getHoursWorked() {
        return hoursWorked;
    }
    
    public void setHoursWorked(int hoursWorked) {
        
        this.hoursWorked = hoursWorked;
    }}

    /**
     *
     */
    /*@Override
    public void displayMyData(){
("\nName of Employee :" + this.getName()
+" \n Birth Year :" + this.calcBrithYear() 
+ " \n Earnings :" + this.calcEarnings() 
+"\n Employee has a 'Car' \n Maker of Vehicle :" +this.getVehicle().getProducer()
+ "\n Vehicle Number :" + this.getVehicle().getNumPlate() 
+"\n Color of Vehcle :" + this.getVehicle().getColor() 
+ "\n Model Number :" + this.getVehicle().getModel());
        }*/
   

