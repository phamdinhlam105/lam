/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Ban Hanh Rong
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context bt1 = new bieuthuc1();
        bt1.setTinhtoan(new Cong());
        System.out.println(bt1.Tinh(75, 12));
        context bt2=new bieuthuc1();
        bt2.setTinhtoan(new Tru());
        System.out.println(bt2.Tinh(54, 78));
    }
    
}
