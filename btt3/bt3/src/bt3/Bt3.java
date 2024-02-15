/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bt3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle hcn = new Rectangle(0,0);
        System.out.print("Nhap vao chieu dai: ");
        float a = scanner.nextFloat();
        hcn.setHeight(a);
        System.out.print("Nhap vao chieu rong: ");
        float b = scanner.nextFloat();
        hcn.setWidth(b);
        if(hcn.getHeight() != 0 && hcn.getWidth() != 0){
            hcn.calculatePerimeter();
            hcn.calculateArea();
        }
    }
}
