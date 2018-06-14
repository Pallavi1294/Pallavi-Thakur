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
public class Car extends Vehicle implements IDisplay  {
    
    
	private String type1;

	private String color1;

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    

	

	@Override

	public void displayMyData() {

		// TODO Auto-generated method stub

		System.out.println(this.color1 + "\n" + this.type1);

	}

    

    
    
}
