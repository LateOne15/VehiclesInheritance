/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author lleyt
 */
public class Motorcycle extends Vehicle{
    public boolean hasSideCar;
    
    public Motorcycle(String brand, String model, int year, String engineType, 
            int horsepower, boolean hasSideCar) {
        super(brand, model, year, engineType, horsepower);
        this.hasSideCar = hasSideCar;
        this.vehicleType = "motorcycle";
    }
    
    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
        engine.startEngine();
    }
    
    @Override
    public void stop() {
        System.out.println("Motorcycle has stopped.");
        engine.stopEngine();
    }
    
    @Override
    public String getInfo() {
        String summary = "The "+vehicleType+" is a "+year+" "+brand+" "+model+
                ". "+engine.getSpecs();
        if (hasSideCar) {
            summary += "\nIt has a sidecar.";
        }
        else {
            summary += "\nIt has no sidecar.";
        }
        return summary;
    }
}
