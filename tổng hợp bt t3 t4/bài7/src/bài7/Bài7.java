/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài7;

class Shape
{
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
    
    public void displayColor()
    {
        System.out.println("Mau: "+this.color);
    }   
}

class Circle extends Shape
{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    public void displayCircleInfo()
    {
        System.out.println("Mau: "+this.color);
        System.out.println("Ban kinh: : "+this.radius);
    }
}

public class Bài7 {

    public static void main(String[] args) {
       Circle hinhtron = new Circle("Red", 5.0);
       hinhtron.displayCircleInfo();
    }
    
}
