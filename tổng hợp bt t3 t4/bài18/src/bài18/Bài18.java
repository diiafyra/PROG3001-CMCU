/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SinhVien{
    public String ID;
    public String hoDem;
    public String ten;
    public int tuoi;
    public String gioiTinh;
    public float diem;

    public SinhVien(String ID, String hoDem, String ten, int tuoi, String gioiTinh, float diem) {
        this.ID = ID;
        this.hoDem = hoDem;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }
    
    
}

public class Bài18 {
    public static List<SinhVien> nDSSV(){
        List<SinhVien> listSV = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên. Nhập '#' để hoàn thành.");
        int i=0;
        while(true){
            System.out.printf("Mã sinh viên %d: ", i+1);
            String maSV = scanner.nextLine();
            if(maSV.equals("#")){
                break;
            }
            System.out.printf("Họ và tên đêm sv %d: ", i+1);
            String hoDem = scanner.nextLine();
            
            System.out.printf("Tên sinh viên %d: ", i+1);
            String ten = scanner.nextLine();
            
            System.out.printf("Tuổi sinh viên %d: ", i+1);
            int tuoi = scanner.nextInt();
            
            scanner.nextLine();
            System.out.printf("Giới tính sinh viên %d: ", i+1);
            String gioiTinh = scanner.nextLine();
            
            System.out.printf("Điểm sinh viên %d: ", i+1);
            float diem = scanner.nextFloat();
            scanner.nextLine();
            
            SinhVien sinhVien = new SinhVien(maSV, hoDem, ten, tuoi, gioiTinh, diem);
            
            listSV.add(sinhVien);
            
            i++;
        }
        return listSV;   
    }
    
    public static void iDSSV(List<SinhVien> dSSV){
        System.out.println("Danh sách sinh viên:");
        for (SinhVien sinhVien : dSSV) {
            System.out.println("Mã sinh viên: " + sinhVien.ID);
            System.out.println("Họ và đệm: " + sinhVien.hoDem);
            System.out.println("Tên: " + sinhVien.ten);
            System.out.println("Tuổi: " + sinhVien.tuoi);
            System.out.println("Giới tính: " + sinhVien.gioiTinh);
            System.out.println("Điểm trung bình: " + sinhVien.diem);
            System.out.println("---------------------");
        }
    } 
    
    public static void sapxeptangdiem(List<SinhVien> dSSV){
        Collections.sort(dSSV, new Comparator<SinhVien>(){
        @Override
        public int compare(SinhVien sv1, SinhVien sv2){
                if (sv1.diem < sv2.diem) {
                    return -1;
                } else if (sv1.diem > sv2.diem) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
    
    public static void demSVTren5(List<SinhVien>dSSV){ 
        int count =0;
    for(SinhVien sinhVien : dSSV){
        if(sinhVien.diem>5){
            count++;
        }
    }
    System.out.println("Số sv có số điểm trên 5 là: "+count);
}
    
    public static void hienThiSV(SinhVien sinhVien){
            System.out.println("Mã sinh viên: " + sinhVien.ID);
            System.out.println("Họ và đệm: " + sinhVien.hoDem);
            System.out.println("Tên: " + sinhVien.ten);
            System.out.println("Tuổi: " + sinhVien.tuoi);
            System.out.println("Giới tính: " + sinhVien.gioiTinh);
            System.out.println("Điểm trung bình: " + sinhVien.diem);
            System.out.println("---------------------");
    }
    public static void sVDauTienTren9(List<SinhVien>dSSV){
    for(SinhVien sinhVien : dSSV){
        if(sinhVien.diem>9){
            System.out.println("SV đầu tiên có số điểm trên 9 là: ");
            hienThiSV(sinhVien);
            break;
        }
    }
}    
    
    public static void listSVminmaxdiem(List<SinhVien>dSSV){
        Float minSV = dSSV.get(0).diem;
        Float maxSV = dSSV.get(0).diem;
    for(SinhVien sinhVien : dSSV){
        if(sinhVien.diem>maxSV){
            maxSV = sinhVien.diem;
        }
        if(sinhVien.diem<minSV){
            minSV = sinhVien.diem;
        }    
    }
    System.out.println("DSSV có số điểm cao nhat là: ");
    for(SinhVien sinhVien : dSSV){
        if(sinhVien.diem == maxSV){
           hienThiSV(sinhVien);
        }
     
    }
    System.out.println("DSSV có số điểm thap nhat là: ");
    for(SinhVien sinhVien : dSSV){    
         if(sinhVien.diem == minSV){
           hienThiSV(sinhVien);
        } 
    }
}      
    
    public static List<SinhVien> daonguoc (List<SinhVien> dSSV){
    Collections.reverse(dSSV);
    return dSSV;
}
    public static void sapxepgiamdiem(List<SinhVien> dSSV){
        sapxeptangdiem(dSSV);
        Collections.reverse(dSSV);
    }
    
    public static void ghiTxtFile(List<SinhVien> dSSV, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (SinhVien sinhVien : dSSV) {
                writer.write(sinhVien.ID + "," + sinhVien.hoDem + "," + sinhVien.ten + "," + sinhVien.tuoi + "," + sinhVien.gioiTinh + "," + sinhVien.diem);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void ghiCsvFile(List<SinhVien> dSSV, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("ID,hoDem,ten,tuoi,gioiTinh,diem");
            writer.newLine();

            for (SinhVien sinhVien : dSSV) {
 writer.write(sinhVien.ID + "," + sinhVien.hoDem + "," + sinhVien.ten + "," + sinhVien.tuoi + "," + sinhVien.gioiTinh + "," + sinhVien.diem);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    
    public static void main(String[] args) {
        List<SinhVien> dSSV = nDSSV();
        iDSSV(dSSV);
        //sapxeptangdiem(dSSV);
        //sapxepgiamdiem(dSSV);
        //iDSSV(dSSV);
        //demSVTren5(dSSV);
        ghiTxtFile(dSSV, "dssv.txt");
        ghiCsvFile(dSSV, "dssv.csv");
        
    }
    
}
