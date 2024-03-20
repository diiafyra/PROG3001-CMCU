/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai27;

import static bai27.Bai27.tinhDienTichTamGiac;
import static java.lang.Math.abs;
import java.util.Scanner;

class tugiac {
     float ab;
     float bc;
     float cd;
     float da;
     float ac;

    public tugiac(float ab, float bc, float cd, float da, float ac) {
        this.ab = ab;
        this.bc = bc;
        this.cd = cd;
        this.da = da;
        this.ac = ac;
    }
    
    public float tinh_dien_tich(){
        float area = tinhDienTichTamGiac(ab, bc, ac)*2;
        return area;
    }
    
    public float tinh_chu_vi(){
        float p = ab+bc+cd+da;
        return p;
    }
}


class hinhbinhhanh extends tugiac{
    public hinhbinhhanh(float ab,float bc,float ac)
    {
        super(ab,bc,ab,bc,ac);
    }
    @Override
    public float tinh_dien_tich(){
        float area = tinhDienTichTamGiac(ab, bc, ac)*2;
        return area;
    }
    @Override
    public float tinh_chu_vi(){
        float p = (ab+bc)*2;
        return p;
    }
}
class hinhchunhat extends hinhbinhhanh{

    public hinhchunhat(float ab,float bc)
    {
        super(ab,bc,(float)Math.sqrt(ab*ab+bc*bc));
    }
    
    
    @Override
    public float tinh_dien_tich()
    {
        return ab*bc;
    }
}


class hinhvuong extends hinhchunhat{
    public hinhvuong(float ab){
        super(ab,ab);
    }
    
    @Override
    public float tinh_dien_tich()
    {
        return ab*ab;
    }

    @Override
    public float tinh_chu_vi(){
        float p = (ab+bc)*2;
        return p;
    }
}


class hinhthoi extends hinhbinhhanh{

    public hinhthoi(float ab, float ac) {
        super(ab, ab, ac);
    }
    
}

public class Bai27 {
    public static float tinhDienTichTamGiac(float ab, float bc, float ca){
        float area;
        float p = (ab +bc + ca)/2;
        area = (float) Math.sqrt(p*(p-ab)*(p-ca)*(p-bc))*2;
        return area;
    }
    
public static boolean kiemTraTamGiac(float ab, float bc, float ac) {
    if ((ab + bc <= ac) || (ab + ac <= bc) || (bc + ac <= ab) || ab <= 0 || bc <= 0 || ac <= 0|| abs(ab - bc) >= ac || abs(ab - ac) >= bc || abs(bc - ac) >= ab) {
        throw new IllegalArgumentException("Cac canh cua tam giac phai co do dai duong va thoa man dieu kien tam giac");
    }
    return true;
}
    
    public static void main(String[] args) {
        tugiac ob_tg;
        ob_tg=new tugiac((float)5.0,(float)4.0,(float)6.0,(float)3.0,(float)7.0);
        
        hinhbinhhanh ob_hbh;
        ob_hbh=new hinhbinhhanh((float)5.0,(float)8.0,(float)7.0);
        
        hinhchunhat ob_hcn;
        ob_hcn=new hinhchunhat((float)3.0,(float)4.0);//...
        
        hinhvuong ob_hv;
        ob_hv=new hinhvuong((float)6.0);
        
        hinhthoi ob_ht;
        ob_ht=new hinhthoi((float)3.0,(float)4.0);//3 là cạnh, 4 là đường chéo
        
        
        //Gọi các hàm tính diện tích các hình
        System.out.println("Diện tích hình vuông là:");
        System.out.println(ob_hv.tinh_dien_tich());
        System.out.println("Diện tích hình tứ giác là:");
        System.out.println(ob_tg.tinh_dien_tich());
        System.out.println("Diện tích hình bình hành là:");
        System.out.println(ob_hbh.tinh_dien_tich());
        
        System.out.println("Chu vi bình hành là:");
        System.out.println(ob_hbh.tinh_chu_vi());
        System.out.println("Chu vi hình vuông là:");
        System.out.println(ob_hv.tinh_chu_vi());
        System.out.println("Chu vi hình tứ giác là:");
        System.out.println(ob_tg.tinh_chu_vi());
        System.out.println("Chu vi hình chữ nhật là:");
        System.out.println(ob_hcn.tinh_chu_vi());        
        System.out.println("Chu vi hình thoi là:");
        System.out.println(ob_ht.tinh_chu_vi());
       
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài các cạnh từ bàn phím
        System.out.println("Nhap do dai cac canh cua tu giac:");
        System.out.print("Nhap do dai canh AB: ");
        float ab = scanner.nextFloat();
        System.out.print("Nhap do dai canh BC: ");
        float bc = scanner.nextFloat();
        System.out.print("Nhap do dai canh CD: ");
        float cd = scanner.nextFloat();
        System.out.print("Nhap do dai canh DA: ");
        float da = scanner.nextFloat();
        System.out.print("Nhap do dai canh CA: ");
        float ca = scanner.nextFloat();

        try {
            // Kiểm tra xem các cạnh có phải là cạnh của một tứ giác không
            if (kiemTraTamGiac(ab, bc, ca)&&kiemTraTamGiac(da, cd, ca)) {
                System.out.println("Day la mot tu giac.");
            } else {
                System.out.println("Day khong phai la mot tu giac.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }        
        
    }
}