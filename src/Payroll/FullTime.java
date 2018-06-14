package Payroll;


 
public class FullTime extends Employee implements IDisplay {



		

private double salary;

private double bonus;

	

public double calEarnings() {

return salary + bonus;

}



public double getSalary() {

return salary;

}



public void setSalary(double salary) {

this.salary = salary;

}



public double getBonus() {

return bonus;

}



public void setBonus(double bonus) {

this.bonus = bonus;
}



@Override
public void displayMyData() {

System.out.println(this.getName() 

+ ""

+ ""

+ "");

		

}

}
 
    
    

