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
public class Motorcycle extends Vehicle implements IDisplay  {
    
    
private String color2;

private String type2;

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    

@Override

public void displayMyData() {
    
System.out.println(this.color2 + "  " + this.type);

	

}

}
