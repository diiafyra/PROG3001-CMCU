/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai18;

class Shape
{
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
    
    public void displayColor()
    {
        System.out.println("Màu: "+this.color);
    }   
}

class Circle extends Shape
{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
}

class Rectangle extends Shape
{
    private double length;
    private double witdth;

    public Rectangle(String color, double length, double witdth) {
        super(color);
        this.length = length;
        this.witdth = witdth;
    }
    
}
public class Bai18 {

    public static void main(String[] args) {
       Circle hinhtron = new Circle("Đỏ", 5.0);
       hinhtron.displayColor();
    }
    
}