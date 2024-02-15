/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student std_me = new Student();
        System.out.print("Số lượng sinh viên muốn nhập: ");
        int n = scanner.nextInt();
        Student[] stds = new Student[n];
        int i;
        scanner.nextLine();
        for(i = 0; i < n; i++){
            System.out.printf("Nhập vào thông tin sinh viên thứ %d: ", i+1);
            
            System.out.print("\nTên: ");
            String name = scanner.nextLine();
            
            System.out.print("Gioi tinh (Nam/Nu): ");
            String sex = scanner.nextLine();
            
            System.out.print("Ngay sinh (viết liền ddmmyyyy): ");
            String birth = scanner.nextLine();
            
            System.out.print("Ma sinh vien: ");
            String studentID = scanner.nextLine();
            
            stds[i] = new Student(name, sex, birth, studentID);
        }
        System.out.println("\nThông tin các sinh viên: ");

        System.out.printf("STT\t%-40s%-15s%-15sID", "Name", "Sex", "Birth");        
        System.out.printf("\n%d\t%-40s%-15s%-15s%s\n", 0, std_me.getName(), std_me.getSex(), std_me.getBirth(), std_me.getStudentID());

        for(i = 0; i < n; i++){
            Student std = stds[i];
            System.out.printf("%d\t%-40s%-15s%-15s%s\n", i+1, std.getName(), std.getSex(), std.getBirth(), std.getStudentID());
        }
       /*System.out.println("\nSua thong tin sinh vien: ");
       System.out.println("\nNhap vao id sv can sua: ");
       String fixID = scanner.nextLine();
       for(i=0; i<n; i++){
           Student std = stds[i];
           if(fixID == std.getStudentID()){
                System.out.print("\nTên moi: ");
                String name = scanner.nextLine();               
           }
       }*/
    }
    
}
