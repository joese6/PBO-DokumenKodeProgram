/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diklatpbo.tugaspraktik4;
//menambahkan liblary java.awt.Graphics pada Kelas
import java.awt.Graphics;
/**
 * Kelas untuk struktur data Lingkaran
 * @author Mas Johan
 * @version 1.0, 14/06/2020
 */
public class Lingkaran extends Bangun2Dall{
    //mendeklarasikan variabel jarijari dengan tipe data double
    double jarijari;
    
    //membuat constructor tanpa parameter
    Lingkaran(){
        
    }
    
    /**
     * membuat constructor dengan parameter
     * @param jari nilai jari-jari lingkaran
     */
    Lingkaran (double jari){
        this.jarijari=jari;
    }
    
    /**
     * mengembalikan nilai jarijari dengan tipe data integer
     * @return jari-jari lingkaran
     * @see int
     */
    int getJariInteger(){
        return (int)jarijari;
    }
    
    //membuat method InfoLuas
    @Override
    void InfoLuas(){
        /*mendeklarasikan variabel LuasL bertipe data double dengan nilai
            3.14*jarijari*jarijari
        */
        double LuasL=3.14*jarijari*jarijari;
        
        //menampilkan output MENGHITUNG LUAS BANGUN DATAR
        System.out.println("MENGHITUNG LUAS BANGUN DATAR");
        
        //menampilkan output Menghitung Luas Lingkaran
        System.out.println("Menghitung Luas Lingkaran");
        
        /*menampilkan output Jari-Jari : yang nilainya didapatkan dari method
        *getJariInteger
        */
        System.out.println("Jari-Jari : "+this.getJariInteger());
        
        /*menampilkan output Luas Lingkaran : yang nilainya didapatkan dari
        *variabel LuasL
        */
        System.out.println("Luas Lingkaran : "+LuasL);
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