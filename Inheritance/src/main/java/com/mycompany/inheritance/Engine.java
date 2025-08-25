/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author lleyt
 */
public class Engine {
    public String type;
    public int horsepower;
    
    public Engine(String type, int horsepower) {
        this.horsepower = horsepower;
        this.type = type;
    }
    public void startEngine() {
        System.out.println("Vroom Vroom!");
    }
    public void stopEngine() {
        System.out.println("Vroom Disabled.");
    }
    
    public String getSpecs() {
        String specs = "The engine is a "+type+" engine, with "
                +horsepower+" horsepower.";
        return specs;
    }
}
