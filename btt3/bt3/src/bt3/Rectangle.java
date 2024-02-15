/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author DELL
 */
public class Rectangle {
    private float height;
    private float width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(float height) {
        if(height > 0){
            this.height = height;
        } else{
            System.out.println("Chieu dai khong hop le: ");
        }
    }

    public void setWidth(float width) {
        if(width > 0){
            this.width = width;
        } else{
            System.out.println("Chieu rong khong hop le: ");
        }
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }
    public void calculateArea()
    {
        float area = width * height;
        System.out.println("Dien tich: " + area);
        
    }
    public void calculatePerimeter()
    {
        float perimeter = (width + height)*2;
        System.out.println("Chu vi: " + perimeter);
        
    }
}
