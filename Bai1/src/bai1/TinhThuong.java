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
public abstract class TinhThuong implements I_Thongtin {

    @Override

    public double TinhThuong() {
        double luongthuong;
        Nhanvien nv=new Nhanvien();
        if(nv.tongsogiolam >= 200)
        {
            luongthuong =  nv.tienluong*20/100;
        }else if(nv.tongsogiolam <200 &&nv.tongsogiolam>=100)
        {
             luongthuong = nv.tienluong*10/100;
        }else
        {
            luongthuong = nv.tienluong;
        }
        return luongthuong;
        }
    
    
}
