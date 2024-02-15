/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.ex2;

import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Nhap vao mot xau ky tu bat ki: ");
         String input = scanner.nextLine();
         char[] arr = input.toCharArray();
         int length = input.length();
         int[] count = new int[length];
         int a = 0, i, j;       
         for(i =0; i < length; i++){
             count[i] = 1;
         }
         for( i =0; i < length; i++){
                for (j = i + 1; j < length; j++){
                if(arr[i] == 'a'){
                    if(arr[j] == 'a'){
                        count[a] += 1;
                    } else {
                        a = a+1;
                        break;
                        
                    }
                    
                }
             }
         }
         int max =0;
         for(i=0; i<length; i++){
             if(max < count[i]){
                 max = count[i];
             }
         }
         String cutArr = input.trim();
         System.out.println("Chuoi sau khi cat: " +cutArr);
         System.out.println("Max a lien nhau: " +max);
    }
    
}
