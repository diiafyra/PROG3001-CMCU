/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.bài2;

import java.util.Scanner;


public class Bài2 {
        Scanner scanner = new Scanner(System.in);        public static void checkN(int n) {
        if (n < 0 || n > 10) {
            throw new IllegalArgumentException();
        }
    }
    public static int nhapN(){
        int n;
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Nhap vao so nguyen n (trong khoang 1 den 10): ");
                n = Integer.parseInt(scanner.nextLine());
                checkN(n);
                break;
            }
            catch(IllegalArgumentException e){
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
            }
        }
            return n;
    }

    public static float nhapF(){
        float f;
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Nhap vao so thuc: ");
                f = Float.parseFloat(scanner.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
            }
        }
            return f;        
    }
    
    public static float[] nhapArrF(){
        int n;
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Nhap vao so luong phan tu ");
                n = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
            }
        }
        float[] arr = new float[n];
        for(int i =0; i < arr.length; i++){
            arr[i]=nhapF();
        }
        return arr;        
    }
    
    public static void main(String[] args) {
        int n = nhapN();
        System.out.println("So nguyen da nhap: "+n);
        float f = nhapF();
        System.out.println("So thuc da nhap: "+f);  
        int i=0;
        float[] arr = nhapArrF();
        for(Float a : arr){
            System.out.printf("Phan tu thu %d: %f\n", i+1, a); 
            i++;
        }
    }
    
}
