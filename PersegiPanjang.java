/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Rsm
 */
public class PersegiPanjang extends BangunDatar{
    int panjang;
    int lebar;
    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public float luas(){
        return this.panjang * this.lebar;
    }
}
