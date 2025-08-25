/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author lleyt
 */
public class Vehicle {
    public String brand;
    public String model;
    public int year;
    public Engine engine;
    public String vehicleType = "n/a";
    
    public Vehicle(String brand, String model, int year, String engineType, int horsepower) {
        engine = new Engine(engineType, horsepower);
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void start() {
        engine.startEngine();
    }
    
    public void stop() {
        engine.stopEngine();
    }
    
    public String getInfo() {
        String summary = "This "+vehicleType+" is a "+model+" by "+brand+
                " from "+year+". "+engine.getSpecs();
        return summary;
    }
}