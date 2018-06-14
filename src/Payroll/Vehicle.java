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
public abstract class Vehicle implements IDisplay {
    
    
private String producer;

private String numplate;

String type;

private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }   

public void Transmission(String Transmission) {

this.type = Transmission;

}



public String getColor() {

return color;
}


public void setColor(String color) {

this.color = color;

}




public String getProducer() {

return producer;

}

public void setProducer(String producer) {

this.producer = producer;

}

public String getNumPlate() {

return numplate;

}

public void setNumPlate(String NumPlate) {

this.numplate = NumPlate;

}

    public Vehicle() {
    }

}