/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ban Hanh Rong
 */
public class BaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang gh1 = new GioHang();
        gh1.setHinhthucTT(new ThanhToanOnline());
        gh1.soluong=3;
        gh1.sanpham[0]= new BiaTiger();
        gh1.sanpham[1]= new Chivas18();
        gh1.sanpham[2]= new BiaTiger();
        System.out.println(gh1.danhsach());
        System.out.println(gh1.ThanhToan());
    }
    
}
