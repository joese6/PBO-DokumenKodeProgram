/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diklatpbo.tugaspraktik4;
//menambahkan liblary java.awt.Graphics pada Kelas
import java.awt.Graphics;

/**
 * Kelas untuk struktur data PersegiPanjang
 * @author Mas Johan
 * @version 1.0, 14/06/2020
 */
public class PersegiPanjang extends Bangun2Dall{
    //mendeklarasikan variabel panjang,lebar dengan tipe data double
    double panjang,lebar;
    
    //membuat constructor tanpa parameter
    PersegiPanjang(){
        
    }
    /**
     * membuat constructor dengan parameter
     * @param panjang nilai panjang persegipanjang
     * @param lebar nilai lebar persegipanjang
     */
    PersegiPanjang(double panjang,double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    
    /**
     * mengembalikan nilai panjang dengan tipe data integer
     * @return panjang persegipanjang
     * @see int
     */
    int getPanjangInteger(){
        return (int)panjang;
    }
    
    /**
     * mengembalikan nilai lebar dengan tipe data integer
     * @return lebar persegipanjang
     * @see int
     */
    int getLebarInteger(){
        return (int)lebar;
    }
    
    //membuat method InfoLuas
    @Override
    void InfoLuas(){
        /*mendeklarasian variabel LuasPP bertipe data double 
        * dengan nilai panjang*lebar
        */
        double LuasPP=this.panjang*this.lebar;
        
        //menampilkan output MENGHITUNG LUAS BANGUN DATAR
        System.out.println("MENGHITUNG LUAS BANGUN DATAR");
        
        //menampilkan output MENGHITUNG Luas Persegi Panjang
        System.out.println("Menghitung Luas Persegi Panjang");
        
        /*menampilkan output Panjang : yang nilainya didapatkan dari 
        * method getPanjangInteger
        */
        System.out.println("Panjang : "+this.getPanjangInteger());
        
        /*menampilkan output Lebar : yang nilainya didapatkan dari 
        * method getLebarInteger
        */
        System.out.println("Lebar : "+this.getLebarInteger());
        
        /*menampilkan output Luas Persegi Panjang : yang nilainya 
        * didapatkan dari variabel LuasPP
        */
        System.out.println("Luas Persegi Panjang : "+LuasPP);
    }
    
    /*membuat method paintComponent sebagai tempat untuk menggambar 
    * bangun datar 2D 
    */
    @Override
    public void paintComponent(Graphics g){
        // Memanggil method paintComponent dari superclass
        super.paintComponent(g);
    }
}