/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài8;

class Vehicle
{
    public void start()
    {
        System.out.println("The vehicle starts");
    }
}

class Car extends Vehicle{
    @Override public void start() {
        System.out.println("The car starts with a key");
    }
}
public class Bài8 {
    public static void main(String[] args){
        Car a=new Car();
        a.start();
    }
}