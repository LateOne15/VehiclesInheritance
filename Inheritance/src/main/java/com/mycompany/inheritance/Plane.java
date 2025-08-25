/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author lleyt
 */
public class Plane extends Vehicle{
    public int numberOfEngines;
    
    public Plane(String brand, String model, int year, String engineType, 
            int horsepower, int numberOfEngines) {
        super(brand, model, year, engineType, horsepower);
        this.numberOfEngines = numberOfEngines;
        this.vehicleType = "plane";
    }
    
    @Override
    public void start() {
        System.out.println("Plane is starting...");
        System.out.println("Starting "+numberOfEngines+" engine"+ ((1<numberOfEngines) ? "s." : "."));
        for (int i = 1; i < numberOfEngines+1; i++) {
            engine.startEngine();
            System.out.println("Engine "+i+" started.");
        }
        System.out.println("Plane has started.");
    }
    
    @Override
    public void stop() {
        System.out.println("Plane is stopping...");
        System.out.println("Stopping "+numberOfEngines+" engine"+ ((1<numberOfEngines) ? "s." : "."));
        for (int i = 1; i < numberOfEngines+1; i++) {
            engine.stopEngine();
            System.out.println("Engine "+i+" stopped.");
        }
        System.out.println("Plane has stopped.");
    }
    
    @Override
    public String getInfo() {
        String summary = "The "+vehicleType+" is a "+year+" "+brand+" "+model+
                ". "+engine.getSpecs()+"\nIt has "+numberOfEngines+" engines.";
        return summary;
    }
}
