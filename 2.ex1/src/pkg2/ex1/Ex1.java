/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.ex1;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Nhap vao mot xau ky tu bat ki: ");
         String input = scanner.nextLine();
         char[] arr = input.toCharArray();
         int length = input.length();
         int count = 0;
         for(int i =0; i < length; i++){
             if(arr[i] == 'a'){
                 count += 1;
             }
         }
         System.out.println("So ky tu 'a' trong xau la: " +count);
    
}
}
