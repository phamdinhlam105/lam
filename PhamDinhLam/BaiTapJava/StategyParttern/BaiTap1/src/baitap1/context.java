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
public abstract class context {
    I_Tinh tinhtoan;
    void context()
    {
    }
   
    public void setTinhtoan(I_Tinh tinhtoan) {
        this.tinhtoan = tinhtoan;
    }
    public float Tinh(float a,float b)
    {
        return tinhtoan.tinhtoan(a, b);
    }
    
}
