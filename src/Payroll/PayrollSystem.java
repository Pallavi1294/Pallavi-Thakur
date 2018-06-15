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
    
        
        
     FixedBasedPartTime fx = new FixedBasedPartTime();
    Car c1 = new Car();
    fx.setVehicle(c1);
    c1.setProducer("BENTLEY");
    c1.setNumPlate("abc 123");
    c1.setColor1("BLUE");
    c1.setModel("BMW 2");
    fx.setName("VARUN");
    fx.setFixedAmount(20);
    fx.setAge(24);
    fx.calcBrithYear();
    fx.setHoursWorked(25);
    fx.setRate(20);
    fx.calcEarnings();
    fx.displayMyData();
    System.out.println("\n==========================");
    FixedBasedPartTime fx1 = new FixedBasedPartTime();
    Motorcycle m1 = new Motorcycle();
    m1.setModel("BMW F 850 GS");
    m1.setNumPlate("xyz");
    m1.setColor2("Red");
    m1.setProducer("BMW");
    
    
    fx1.setName("Rahul");
    fx1.calcBrithYear();
    fx1.setAge(20);
    fx1.setVehicle(m1);
    fx1.setHoursWorked(30);
    fx1.setRate(50);
    fx1.calcEarnings();
    fx1.displayMyData();
    
    System.out.println("\n==========================");
    FullTime f = new FullTime();
    Car c2 = new Car();
    f.setVehicle(c2);
    c2.setProducer("BENTLEY");
    c2.setNumPlate("abc 123");
    c2.setColor1("BLUE");
    c2.setModel("BMW 2");
    f.setName("ajay");
    f.setAge(23);
    f.setBonus(500);
    f.setEarnings(1500);
    f.calTotalSalary();
    f.displayMyData();
    
     System.out.println("\n==========================");
     FullTime f1 = new FullTime();
     Car c3 = new Car(); 
     c3.setProducer("Maruti Suzuki" );
     c3.setNumPlate("1269");
     c3.setColor1("Spac Grey");
     c3.setModel("Alto Lxi");
     f1.setVehicle(c3);
     f1.setAge(25); 
     f1.setName("Robin ");
     f1.setEarnings(2000);
     f1.setBonus(1000);
     f1.calTotalSalary();  
     f1.displayMyData();
      System.out.println("\n==========================");
    
    
    CommissionBasedPartTime com =new CommissionBasedPartTime();
    Car cr = new Car();
    com.setVehicle(cr);
    com.setName("ABHinav");
    com.setAge(23);
    com.calcBrithYear();
    com.setRate(32);
    com.setHoursWorked(30);
    com.setCommissionPercent(20);
    cr.setModel("A16th");
    cr.setProducer("Honda");
    cr.setNumPlate("ASR90");
    cr.setColor1("Black");
    com.displayMyData();
    System.out.println("\n==========================");
    
    CommissionBasedPartTime com1 =new CommissionBasedPartTime();
    Motorcycle m3 = new Motorcycle();
    com1.setVehicle(m3);
    m3.setModel("gh34");
    m3.setProducer("Honda");
    m3.setNumPlate("smp89");
    m3.setColor2("Black");
    com1.setName("Akshay");
    com1.setAge(25);
    com1.calcBrithYear();
    com1.setRate(30);
    com1.setHoursWorked(10);
    com1.setCommissionPercent(20);
    com1.displayMyData();
    
   
    System.out.println("\n==========================");
    Intern i = new Intern ();
    System.out.println("Has No Vehicle");
    i.setName("Sumit");
    i.setAge(21);
    i.calcBrithYear();
    i.setEarnings(1200);
    i.setSchoolName("KPu");
    i.displayMyData();
    
    
    
     
    System.out.println("\n==========================");
    Intern i1 = new Intern ();
    Car c4 = new Car();
    i1.setName("Arun");
    i1.setAge(22);
    i1.calcBrithYear();
    i1.setSchoolName("Langara");
    i1.setEarnings(700);
    c4.setModel("GLA 45");
    c4.setProducer("Mercedes");
    c4.setNumPlate("KJL25");
    c4.setColor1("RED");
    i1.setVehicle(c4);
    i1.printData();
    
    
            
   
    
    
    
    
   
    
    
    
    
    
    }
    }
    

