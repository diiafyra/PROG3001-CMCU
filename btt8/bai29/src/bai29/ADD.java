/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai29;

/**
 *
 * @author DELL
 */
public class ADD {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
    public static void main(String[] args) {
        ADD a = new ADD();
        int add1 = a.add(3, 4);
        System.out.println("add 2 số nguyên: " + add1);
        
        double add2 = a.add(2.1, 2.3);
        System.out.println("add 2 số thực: " + add2);
        
        String add3 = a.add("Hí cô giáo", " \ndat Trang Di");
        System.out.println("add 2 chuỗi: " + add3);        
    }
    
}
