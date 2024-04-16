/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg44;

import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author DELL
 */
class SinhVien {
    public String msv;
    public String hoVaDem;
    public String ten;
    public int tuoi;
    public String gioiTinh;
    public float diemTB;

    public SinhVien(String msv, String hoVaDem, String ten, int tuoi, String gioiTinh, float diemTB) {
        this.msv = msv;
        this.hoVaDem = hoVaDem;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }
    
    
}
public class Bài44 {
    public static List<SinhVien> nhapSV(){
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> sinhvien = new ArrayList<>();
        boolean flag = true;
        int i = 1;
        while(flag){
            System.out.println("Nhap vao thong tin sinh vien thu " +i + ": ");
            System.out.print("Nhap vao ma sinh vien: ");
            String msv = scanner.nextLine();
            if(msv.equals("#")){
                flag = false;
                break;
            }
            System.out.print("Nhap vao ho va dem sinh vien: ");
            String hoVaDem = scanner.nextLine();
            System.out.print("Nhap vao ten sinh vien: ");
            String ten = scanner.nextLine();
            System.out.print("Nhap vao tuoi sinh vien: ");
            int tuoi = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhap vao gioi tinh sinh vien: ");
            String gioiTinh = scanner.nextLine();
            System.out.print("Nhap vao diem TB sinh vien: ");
            float diemTB = scanner.nextFloat();
            scanner.nextLine();
            System.out.println();
            SinhVien sv = new SinhVien(msv, hoVaDem, ten, tuoi, gioiTinh, diemTB);
            sinhvien.add(sv);
            i++;                                                            
        }
        return sinhvien;    
    }
    
    public static void inThongTinSV(SinhVien sv){
        System.out.println("Ma sinh vien: "+ sv.msv);
        System.out.println("Ho va dem sinh vien: "+ sv.hoVaDem);
        System.out.println("Ten sinh vien: "+ sv.ten);
        System.out.println("Tuoi sinh vien: "+ sv.tuoi);
        System.out.println("Gioi tinh sinh vien: "+ sv.gioiTinh);
        System.out.println("Diem TB sinh vien: "+ sv.diemTB);
        System.out.println("---------------------");
    }
    
    public static void inDSSV(List<SinhVien> dssv){
        int i = 1;
        for(SinhVien sv : dssv){
            System.out.println("Thong tin sinh vien thu "+ i +": ");
            inThongTinSV(sv);
            i++;
        }
        System.out.println();
    }
    
    public static void sapxeptangdiem(List<SinhVien> dSSV){
        Collections.sort(dSSV, new Comparator<SinhVien>(){
        @Override
        public int compare(SinhVien sv1, SinhVien sv2){
                if (sv1.diemTB < sv2.diemTB) {
                    return -1;
                } else if (sv1.diemTB > sv2.diemTB) {
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
            if(sinhVien.diemTB>5){
                count++;
            }
        }
        System.out.println("Số sv có số điểm trên 5 là: "+count);
    }
    
    public static void sVDauTienTren9(List<SinhVien>dSSV){
    for(SinhVien sinhVien : dSSV){
        if(sinhVien.diemTB>9){
            System.out.println("SV đầu tiên có số điểm trên 9 là: ");
            inThongTinSV(sinhVien);
            break;
        }
    }
}    
    
    public static void listSVminmaxdiem(List<SinhVien>dSSV){
        Float minSV = dSSV.get(0).diemTB;
        Float maxSV = dSSV.get(0).diemTB;
        for(SinhVien sinhVien : dSSV){
            if(sinhVien.diemTB > maxSV){
                maxSV = sinhVien.diemTB;
            }
            if(sinhVien.diemTB<minSV){
                minSV = sinhVien.diemTB;
            }    
        }
        
        System.out.println("DSSV có số điểm cao nhat là: ");
        for(SinhVien sinhVien : dSSV){
            if(sinhVien.diemTB == maxSV){
               inThongTinSV(sinhVien);
            }

        }
        
        System.out.println("DSSV có số điểm thap nhat là: ");
        for(SinhVien sinhVien : dSSV){    
             if(sinhVien.diemTB == minSV){
               inThongTinSV(sinhVien);
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
                writer.write(sinhVien.msv + "," + sinhVien.hoVaDem + "," + sinhVien.ten + "," + sinhVien.tuoi + "," + sinhVien.gioiTinh + "," + sinhVien.diemTB);
                writer.newLine();
            }
            System.out.println("Ghi danh sách sinh viên vào " + filePath + " thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void ghiCsvFile(List<SinhVien> dSSV, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("ID,hoDem,ten,tuoi,gioiTinh,diem");
            writer.newLine();

            for (SinhVien sinhVien : dSSV) {
                writer.write(sinhVien.msv + "," + sinhVien.hoVaDem + "," + sinhVien.ten + "," + sinhVien.tuoi + "," + sinhVien.gioiTinh + "," + sinhVien.diemTB);
                writer.newLine();
            }
            System.out.println("Ghi danh sách sinh viên vào " + filePath + " thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
        
    public static void ghiJsonFile(List<SinhVien> danhSachSinhVien, String tenTep) {
        JSONArray jsonArray = new JSONArray();
        
        // Chuyển đổi danh sách sinh viên thành định dạng JSON
        for (SinhVien sv : danhSachSinhVien) {
            JSONObject sinhVienJson = new JSONObject();
            sinhVienJson.put("MSV", sv.ten);
            sinhVienJson.put("Ho va dem", sv.hoVaDem);
            sinhVienJson.put("Ten", sv.ten);
            sinhVienJson.put("Tuoi", sv.tuoi);
            sinhVienJson.put("Gioi tinh", sv.gioiTinh);
            sinhVienJson.put("Diem TB", sv.diemTB);
            jsonArray.add(sinhVienJson);
        }

        // Ghi chuỗi JSON vào tệp .json
        try (FileWriter file = new FileWriter(tenTep)) {
            file.write(jsonArray.toJSONString());
            System.out.println("Ghi danh sách sinh viên vào " + tenTep + " thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi danh sách sinh viên vào " + tenTep);
            e.printStackTrace();
        }
    }
    
    public static void hienThiDanhSachSinhVien(List<SinhVien> danhSachSinhVien) {
        JFrame frame = new JFrame("Danh sách sinh viên");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columns = {"MSV", "Họ và đệm", "Tên", "Tuổi", "Giới tính", "Điểm TB"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        for (SinhVien sv : danhSachSinhVien) {
            Object[] row = {sv.msv, sv.hoVaDem, sv.ten, sv.tuoi, sv.gioiTinh, sv.diemTB};
            model.addRow(row);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }    

    
    
    public static void main(String[] args) {
        List<SinhVien> dssv = nhapSV();
        inDSSV(dssv);
        hienThiDanhSachSinhVien(dssv);
        sapxeptangdiem(dssv);
        System.out.println("Danh sach sinh vien sap xep theo thu tu diem tang dan: ");
        inDSSV(dssv);
        System.out.println("Danh sach sinh vien sap xep theo thu tu diem giam dan: ");        
        sapxepgiamdiem(dssv);
        inDSSV(dssv);
        demSVTren5(dssv);
        
        ghiTxtFile(dssv, "dssv.txt");
        ghiCsvFile(dssv, "dssv.csv");
        ghiJsonFile(dssv, "dssv.json");
    }
    
}
