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
public class Chia implements I_Tinh {
    @Override
    public float tinhtoan(float a, float b)
    {
        if(b==0)
            if(a>=0)
                return Float.POSITIVE_INFINITY;
            else
                return Float.NEGATIVE_INFINITY;
        else
            return (float)a/b;
    }
}
