/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author Ban Hanh Rong
 */
public class GioHang {
    I_ThanhToan HinhthucTT;
    int soluong;
    HangHoa[] sanpham;
    public void setHinhthucTT(I_ThanhToan HinhthucTT) {
        this.HinhthucTT = HinhthucTT;
    }
    
    public void GioHang()
    {
        
    }
    public double ThanhToan()
    {
        double s=0;
        for(int i=0;i<soluong;i++)
            s=s+HinhthucTT.thanhtoan(sanpham[i].gia());
        return s;
    }
    public String danhsach()
    {
        String s="";
        for(int i=0;i<soluong;i++)
            s=s+sanpham[i].TenHang()+sanpham[i].gia();
        return s;
    }
}
