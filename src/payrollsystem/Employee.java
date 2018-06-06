/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author hp
 */
public class Employee {
    
    char Name;
     int Age;
     int calcbirthyear()
    {
        return (2017-Age);
                }
      int calcearnings()
    {
        return (1000);
                }

    public char getName() {
        return Name;
    }

    public void setName(char Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    
     
}
    

