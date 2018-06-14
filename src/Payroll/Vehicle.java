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

private String model;

private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    

public void Model(String Model) {

this.model = Model;

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