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
public class ThanhToanOnline implements I_ThanhToan {
    @Override
    public double thanhtoan(int tienhang)
    {
        if(tienhang<1000000)
            return (double)tienhang*95/100;
        else
            return (double)tienhang*93/100;
    }
}
