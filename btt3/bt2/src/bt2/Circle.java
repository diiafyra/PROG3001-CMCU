/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author DELL
 */
public class Circle {
    private Float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

public void setRadius(float radius) {
    if (radius > 0) {
        this.radius = radius;
    } else {
        System.out.println("Bán kính không hợp lệ");
    }
}
    
    public void calculateArea()
    {
        float area = (float)Math.PI * radius * radius;
        System.out.println("Dien tich: " + area);
        
    }
    
    public void calculatePerimeter()
    {
        float perimeter = radius*2*(float)Math.PI;
        System.out.println("Chu vi: " + perimeter);
        
    }
}
