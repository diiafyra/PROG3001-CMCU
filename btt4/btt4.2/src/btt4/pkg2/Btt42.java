/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btt4.pkg2;

import java.util.Scanner;


public class Btt42 {
public static int nhapsonguyen()
{
    Scanner scanner = new Scanner(System.in);
        int n;
        //float x;
        while(true)
        {
            try
            {
                System.out.print("Nhap vao so nguyen n: ");
                n=Integer.parseInt(scanner.nextLine());

                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Định dạng không hợp lệ.Vui lòng nhập lại.");
            }
        }
        return n;
}

public static float nhapsothuc()
{
    Scanner scanner = new Scanner(System.in);
        float x;
        while(true)
        {
            try
            {
                System.out.print("Nhap vao so thuc x: ");
                x = Float.parseFloat(scanner.nextLine());

                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Định dạng không hợp lệ.Vui lòng nhập lại.");
            }
        }
        return x;
}

public static float[] nhapmang()
        {
            Scanner scanner = new Scanner(System.in);
            int n;
            while(true)
            {
                try
                {
                    System.out.print("Nhap vao so luong phan tu: ");
                    n = Integer.parseInt(scanner.nextLine());

                    break;
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Định dạng không hợp lệ.Vui lòng nhập lại.");
                }
            }
            
            float[] a;

            int max = 1000000000; 
            try {
                a = new float[max];
                System.out.println("Cấp phát mảng thành công.");
            } catch (OutOfMemoryError e) {
                System.out.println("Cấp phát mảng thất bại.");
            }
            System.out.println("Nhập các phần tử của mảng:");
            a = new float[n];
           for (int i = 0; i < n; i++) {
               System.out.print("Phần tử thứ " + (i + 1) + ": ");
               a[i] = scanner.nextFloat();
           }
         
           return a;
        }
            

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] a = nhapmang();
        int n = a.length;
        int i;
        for( i=0; i<n; i++)
        {
            System.out.println("Phần tử thứ " + (i + 1) + ": " +a[i]);
        }
        
        /*float[] a;
        a = new float[10];
        
        int max = 1000000000; 
        try {
            a = new float[max];
            System.out.println("Cấp phát mảng thành công.");
        } catch (OutOfMemoryError e) {
            System.out.println("Cấp phát mảng thất bại.");
        }*/
        //Public là một từ khóa (keyword) trong Java dùng để xác định phạm vi truy cập của một thành phần (như hàm, lớp, biến) trong mã nguồn. Khi một hàm được khai báo là "public", nghĩa là nó có thể được truy cập từ bất kỳ đâu trong chương trình, bao gồm cả từ các lớp khác. Điều này cho phép hàm được gọi từ bất kỳ đâu trong chương trình.

        //Static là một từ khóa trong Java, dùng để khai báo thành viên (member) của một lớp. Khi một hàm được khai báo là "static", nghĩa là nó thuộc về lớp chứ không thuộc về một đối tượng cụ thể nào của lớp đó. Điều này có nghĩa là bạn có thể gọi hàm static mà không cần tạo một đối tượng của lớp đó.
        
        //int n;
  
        //float x;
        /*while(true)
        {
            try
            {
                System.out.print("Nhap vao so nguyen n: ");
                n=Integer.parseInt(scanner.nextLine());

                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Định dạng không hợp lệ.Vui lòng nhập lại.");
            }
        }
        while(true)
        {
            try
            {
                System.out.print("Nhap vao so thuc x: ");
                x = Float.parseFloat(scanner.nextLine());

                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Định dạng không hợp lệ.Vui lòng nhập lại.");
            }
        }*/

        System.out.println("So nguyen n: " +nhapsonguyen());
        System.out.println("So thuc x: " +nhapsothuc());
        
    }
    
}
}
