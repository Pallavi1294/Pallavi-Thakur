package Payroll;


 
public class FullTime extends Employee implements IDisplay {



		

private double earnings;

private double bonus;

	





public double getearnings() {

return earnings;

}



public void setEarnings(double earnings) {

this.earnings = earnings;

}



public double getBonus() {

return bonus;

}



public void setBonus(double bonus) {

this.bonus = bonus;
}
public double calTotalSalary() {

return earnings + bonus;

}




@Override
public void displayMyData() {

System.out.println("\n Full Time Emloyee" +"\n Name is:" +this.getName() 
        +"\n Birth Year: " +this.calcBrithYear()
        +"\n Total Earnings" +this.calTotalSalary()
        +"\n Employee has a 'Car' \n Vehicle details :" +this.getVehicle().getProducer()
+ "\n Vehicle Number :" + this.getVehicle().getNumPlate() 
+"\n Color of Vehcle :" + this.getVehicle().getColor() 
+ "\n Model Number :" + this.getVehicle().getModel());

}}
    
    

