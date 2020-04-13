/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Ban Hanh Rong
 */
public class GetThongTin implements I_Thongtin {

    @Override
    public GetThongTin() {
        Scanner sc = new Scanner(System.in);
        Nhanvien nv=new Nhanvien();
        System.out.println("Nhap Ten");
         nv.Ten = sc.nextLine();
         System.out.println("Nhap Tuoi");
         nv.tuoi = sc.nextInt();
         sc.nextLine();
         System.out.println("Nhap DiaChi");
         nv.DiaChi = sc.nextLine();
         System.out.println("Nhap Luong");
         nv.tienluong = sc.nextDouble();
         System.out.println("Nhap T ongSo Gio Lam");
         nv.tongsogiolam = sc.nextInt();
    }

    @Override
    public double tinhThuong() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
