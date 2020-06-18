/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diklatpbo.tugaspraktik4;
//menambahkan liblary java.awt.Graphics pada Kelas
import java.awt.Graphics;
/**
 * Kelas untuk struktur data Segitiga
 * @author Mas Johan
 * @version 1.0, 14/06/2020
 */
public class Segitiga extends Bangun2Dall{
    //mendeklarasikan variabel alas,tinggi dengan tipe data double
    double alas,tinggi;
    
    //membuat constructor tanpa parameter
    public Segitiga(){
        
    }
    
    /**
     * membuat constructor dengan parameter
     * @param alas nilai alas segitiga
     * @param tinggi nilai tinggi segitiga
     */
    public Segitiga(double alas, double tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }
    
    /**
     * mengembalikan nilai alas dengan tipe data integer
     * @return alas segitiga
     * @see int
     */
    int getAlasInteger(){
        return (int)alas;
    }
    
    /**
     * mengembalikan nilai tinggi dengan tipe data integer
     * @return tinggi segitiga
     * @see int
     */
    int getTinggiInteger(){
        return (int)tinggi;
    }
    
    //membuat method InfoLuas
    @Override
    void InfoLuas(){
        /*mendeklarasikan variabel LuasS bertipe data double dengan
        * nilai 0.5*alas*tinggi
        */
        double LuasS=0.5*alas*tinggi;
        
        //menampilkan output MENGHITUNG LUAS BANGUN DATAR
        System.out.println("MENGHITUNG LUAS BANGUN DATAR");
        
        //menampilkan output Menghitung Luas Segitiga
        System.out.println("Menghitung Luas Segitiga");
        
        /*menampilkan output Alas : yang nilainya didapatkan dari 
        * method getAlasInteger
        */
        System.out.println("Alas : "+this.getAlasInteger());
        
        /*menampilkan output Tinggi : yang nilainya didapatkan dari 
        * method getTinggiInteger
        */
        System.out.println("Tinggi : "+this.getTinggiInteger());
        
        /*menampilkan output Luas Segitiga : yang nilainya didapatkan dari 
        * variabel LuasS
        */
        System.out.println("Luas Segitiga : "+LuasS);
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