/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai32;

/**
 *
 * @author DELL
 */
abstract class Vehicle {
    public abstract void start();
    public abstract void stop();
}
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}
public class Bai32 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); 
        car.stop();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start(); 
        motorcycle.stop(); 
    }
}
