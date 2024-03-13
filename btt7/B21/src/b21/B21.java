/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b21;

class Shape{
    protected String color;

    public Shape(String Color) {
        this.color = Color;
    }
    
    public void displayColor(){
        System.out.println("Màu: "+color);
    }
}

class Circle extends Shape{
    private float radius;
    public Circle(String Color, float Radius) {
        super(Color);
        this.radius = Radius;
    }
    
    public void displayCircleColor(){
        System.out.println("Màu: "+color);
        System.out.println("Bán kinh: "+color);
    }
}
public class B21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        circle.displayCircleColor();
    }
    
}
