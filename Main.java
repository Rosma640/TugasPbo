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
public class Main {
    public static void main(String[] args) {
        BangunDatar bangundatar = new BangunDatar();
        Persegi persegi = new Persegi(2);
        PersegiPanjang persegipanjang = new PersegiPanjang(5, 2);
        Lingkaran lingkaran = new Lingkaran(23);

        bangundatar.luas();
        bangundatar.keliling();
        
        System.out.println("Luas persegi panjang : " + persegipanjang.luas()+"\n");
        System.out.println("Luas persegi : " + persegi.luas());
        System.out.println("keliling persegi : " + persegi.keliling()+"\n");
        System.out.println("Luas lingkaran : " + lingkaran.luas());
        System.out.println("keliling lingkaran : " + lingkaran.keliling());
    }
}
