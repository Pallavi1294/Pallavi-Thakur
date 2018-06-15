package Payroll;


import java.io.File;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String args[]){
        try{
            File file = new File("Text text");
            if(file.createNewFile())
                System.out.println("Success");
            else
                System.out.println("Error,File already exists");
                
                        
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
