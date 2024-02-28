/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.bài3;

import java.util.Scanner;


public class Bài3 {
        Scanner scanner = new Scanner(System.in);        
        public static void checkLength(String str) {
        if (str.length() != 4) {
            throw new IllegalArgumentException();
        }
    }
    public static int input(){
        Scanner scanner = new Scanner(System.in);
        int n;
        while(true){
            try{
                System.out.print("Nhap vao xau ki tu gom 4 chu so: ");
                String input = scanner.nextLine();
                checkLength(input);
                n = Integer.parseInt(input);
                break;
            }
            catch(IllegalArgumentException e){
                System.out.println("Vui lòng nhập lại.");
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int n = input();
        System.out.println("Xâu gồm 4 chữ số là: " +n);
    }
    
}
