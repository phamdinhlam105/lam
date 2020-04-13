/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Pham Dinh Lam
 */
public abstract class GetTT implements I_Thongtin {

    @Override
    public String GetThongTin() {
        Scanner sc = new Scanner(System.in);
        Nhanvien nv=new Nhanvien();
        System.out.println("Nhap Ten");
         nv.Ten = sc.nextLine();
         System.out.println("Nhap Tuoi");
         nv.tuoi = sc.nextInt();
        
         System.out.println("Nhap DiaChi");
         nv.DiaChi = sc.nextLine();
         System.out.println("Nhap Luong");
         nv.tienluong = sc.nextDouble();
         System.out.println("Nhap Tong So Gio Lam");
         nv.tongsogiolam = sc.nextInt(); 
         return "1";
    }

   
    
}
