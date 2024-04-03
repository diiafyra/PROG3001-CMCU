/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai36;

/**
 *
 * @author DELL
 */
interface HocVien{
    public void hoc();
}

class SinhVien implements HocVien{
    @Override
    public void hoc() {
        System.out.println("học sinhvien");
    }
    
}

class GiangVien implements HocVien{
    @Override
    public void hoc() {
        System.out.println("học giangvien");
    }
    
}

class GiaoVienNghienCuuSinh implements HocVien{
    @Override
    public void hoc() {
        System.out.println("học GiaoVienNghienCuuSinh");
    }
    
}

public class bai36 {
    public static void main(String[] args){
        SinhVien a =new SinhVien();
        a.hoc();
        GiangVien b = new GiangVien();
        b.hoc();
        GiaoVienNghienCuuSinh c = new GiaoVienNghienCuuSinh();
        c.hoc();
    }
}
