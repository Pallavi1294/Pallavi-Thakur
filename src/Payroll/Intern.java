package Payroll;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hp
 */
public class Intern extends Employee implements IDisplay {
    
private String schoolName;

	

public String getSchoolName() {

return schoolName;
}

public void setSchoolName(String schoolName) {

this.schoolName = schoolName;

}

@Override
public void displayMyData() {
    
System.out.println("Intern Details:"
+"\nName of Employee :" + this.getName()
+" \n Birth Year :" + this.calcBrithYear() 
+ " \n Earnings :" + this.calcEarnings()
+"\n School Name:" + this.getSchoolName());
/*+"\nVehicle Details :" +this.getVehicle().getProducer()
+ "\n Vehicle Number :" + this.getVehicle().getNumPlate() 
+"\n Color of Vehcle :" + this.getVehicle().getColor() 
+ "\n Model Number :" + this.getVehicle().getModel());*/
}
public void printData(){System.out.println("Intern Details:"
+"\nName of Employee :" + this.getName()
+" \n Birth Year :" + this.calcBrithYear() 
+ " \n Earnings :" + this.calcEarnings()
+"\n School Name:" + this.getSchoolName()+"\nVehicle Details :" +this.getVehicle().getProducer()
+ "\n Vehicle Number :" + this.getVehicle().getNumPlate() 
+"\n Color of Vehcle :" + this.getVehicle().getColor() 
+ "\n Model Number :" + this.getVehicle().getModel());
}

}


    

