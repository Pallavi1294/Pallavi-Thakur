package Payroll;




public abstract class Employee implements IDisplay {

	

	private String name;

	private int age;

	private double earnings;

	private Vehicle vehicle;
        
        
        public int calcBrithYear() {

	return 2018 - age;

	}
        
        
        public double calcEarnings() {

        return earnings;

        }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    
        


}
    

