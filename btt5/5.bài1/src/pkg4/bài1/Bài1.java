/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.bài1;

/**
 *
 * @author DELL
 */

import java.util.Scanner;

class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
         this.width=w;       
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
       this.height = h;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2.0 * (width + height);
    }
}
class Circle {
    public Circle(){
        System.out.println("Đây là một hàm khởi tạo");
        radius=100;
    }
    public Circle (double r){
        System.out.println("Đây là hàm tạo có đối, số đối bằng số biến của lớp");
        radius=r;
    }
    //public double radius;
    private double radius;//che

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Bài1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ////////////////////////////////////
        Circle obj = new Circle();
        System.out.println("Bán kính khởi đầu của biến obj là:"+obj.getRadius());
       // circle.radius=5.0; //?
        obj.setRadius(5.0);
        System.out.println("Radius: " + obj.getRadius());
        System.out.println("Area: " + obj.calculateArea());
        System.out.println("cấp phát một biến đối tượng Circle có bán kính bằng 2000");
        Circle ob = new Circle(2000.0);
        System.out.println("Diện tích của đối tượng ob là:"+ob.calculateArea());
        System.out.println("Thử lớp Rectangle");
        Rectangle ob1 = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        double width, height;
        while (true)
        {
            try
            {
                System.out.print("Nhập độ rộng: ");
                width = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập độ cao: ");
                height = Double.parseDouble(scanner.nextLine());
                Rectangle rectangle = new Rectangle(width, height);
                ob1= rectangle;
                break;// thoát khỏi vòng lặp
            } //try
            catch (Exception e)
            {
                System.out.println("Nhập sai, hãy nhập lại.");
            } // catch
        }// while

        scanner.close();

        System.out.println("Độ rộng: " + ob1.getWidth());
        System.out.println("Độ cao: " + ob1.getHeight());
        System.out.println("Diện tích: " + ob1.calculateArea());
        System.out.println("Chu vi: " + ob1.calculatePerimeter());

    }
}