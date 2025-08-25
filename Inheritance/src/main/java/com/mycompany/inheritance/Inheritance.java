/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;

/**
 *
 * @author lleyt
 */
public class Inheritance {

    public static void main(String[] args) {
        String carBrand = "Mitsubishi";
        String carModel = "Lancer ES";
        int carYear = 2010;
        String carEngine = "petrol";
        int carHP = 200;
        int doors = 4;
        
        String cycleBrand = "Harley Davidson";
        String cycleModel = "Loud Boy";
        int cycleYear = 2099;
        String cycleEngine = "diesel";
        int cycleHP = 50;
        boolean sidecar = false;
        
        String planeBrand = "Airbus";
        String planeModel = "A380";
        int planeYear = 2007;
        String planeEngine = "jet";
        int planeHP = 28000;
        int engines = 2;
        
        Car Lancer = new Car(carBrand, carModel, carYear, carEngine, 
                carHP, doors);
        System.out.println(Lancer.getInfo());
        Lancer.start();
        Lancer.stop();
        System.out.println("");
        
        Motorcycle Harley = new Motorcycle(cycleBrand, cycleModel, cycleYear, 
                cycleEngine, cycleHP, sidecar);
        System.out.println(Harley.getInfo());
        Harley.start();
        Harley.stop();
        System.out.println("");
        
        Plane Airbus = new Plane(planeBrand, planeModel, planeYear, planeEngine, 
                planeHP, engines);
        System.out.println(Airbus.getInfo());
        Airbus.start();
        Airbus.stop();
    }
}
