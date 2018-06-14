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
public class PayrollSystem {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        
        Intern i = new Intern();
    Car c1 = new Car();
    c1.setProducer("BENTLEY");
    c1.setNumPlate("abc 123");
    c1.setColor1("BLUE");
    c1.setType1("Automatic");
    i.setAge(24);
    
    i.setName("VARUN");

    i.setVehicle(c1);

    i.setSchoolName("HUMBER");

    i.setEarnings(1500);

    i.displayMyData();
    
    }
    }
    

