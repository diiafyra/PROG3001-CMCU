/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b25;

class Shape {
    public void draw() {
        System.out.println("Drawing...");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class B25 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Shape();
        shapes[2] = new Shape();
        shapes[3] = new Circle();

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).draw();
            } else {
                shape.draw();
            }
        }
    }
}
