/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author lleyt
 */
public class Car extends Vehicle{
    public int numberOfDoors;
    
    public Car(String brand, String model, int year, String engineType, 
            int horsepower, int numberOfDoors) {
        super(brand, model, year, engineType, horsepower);
        this.numberOfDoors = numberOfDoors;
        this.vehicleType = "car";
    }
    
    @Override
    public void start() {
        System.out.println("Car is starting...");
        engine.startEngine();
    }
    
    @Override
    public void stop() {
        System.out.println("Car has stopped.");
        engine.stopEngine();
    }
    
    @Override
    public String getInfo() {
        String summary = "The "+vehicleType+" is a "+year+" "+brand+" "+model+
                ", with "+numberOfDoors+" doors. "+engine.getSpecs();
        return summary;
    }
}
