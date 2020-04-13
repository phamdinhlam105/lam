/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Ban Hanh Rong
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Nhanvien Nv = new Nhanvien();
        Nhanvien Nv1 = new Nhanvien();
        Nv.getThongTin();
        Nv1.getThongTin();
        System.out.println("-------------NHAN VIEN 1-----------------");
        System.out.println("Ten:" + Nv.Ten);
        System.out.println("Tuoi :" + Nv.Tuoi);
        System.out.println("Dia chi :" + Nv.DiaChi);
        System.out.println("Luong:" + Nv.Luong);
        System.out.println("Tong so gio lam :" + Nv.TongSoGio);
        System.out.println("Tien thuong cho vien :"+ Nv.tinhThuong());
        System.out.println("-------------NHAN VIEN 2-----------------");
        System.out.println("Ten:" + Nv1.Ten);
        System.out.println("Tuoi:" + Nv1.Tuoi);
        System.out.println("Dia chi:" + Nv1.DiaChi);
        System.out.println("Luong:" + Nv1.Luong);
        System.out.println("Tong so gio lam :" + Nv1.TongSoGio);
        System.out.println("Tien thuong cho vien"+ Nv1.tinhThuong());
    }
    
}
