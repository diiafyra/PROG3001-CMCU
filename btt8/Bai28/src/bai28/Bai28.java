/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai28;

class Triangle {
    public double calculateArea(double h, double a) {
        return 0.5 * h * a;
    }
    
    public double calculateArea(double a, double b2, double c) {
        double p = (a + b2 + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b2) * (p- c));
    }

    public double calculateAreaSine(double b, double c, double angle_A) {
        return 0.5 * b * c * Math.sin(Math.toRadians(angle_A));
    }
}
public class Bai28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        double area1 = triangle.calculateArea(4.5, 3.2);
        System.out.println("Area with height and base: " + area1);

        double area2 = triangle.calculateArea(3, 4, 5);
        System.out.println("Area with three sides: " + area2);

        double area3 = triangle.calculateAreaSine(5, 7, 60);
        System.out.println("Area with two sides and angle: " + area3);
    }
    
}
