/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diklatpbo.tugaspraktik4;
//menambahkan library yang dibutuhkan
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Kelas untuk struktur data Bangun2Dall
 * @author Mas Johan
 * @version 1.0, 14/06/2020
 */
public class Bangun2Dall extends JPanel{
    //mendeklarasikan variabel Luas dengan tipe data double
    double Luas;
    //mendeklarasikan variabel PerbesarGmb dengan tipe data integer bernilai 3
    int PerbesarGmb=3;
    
    /*mendeklarasikan variabel phi,jari2,luasLingkaran dengan tipa data double
    *memberi nilai phi:3.14 ,nilai jari2:10,nilai luasLingkaran:phi*jari2*jari2
    */
    double phi=3.14,jari2=10,luasLingkaran=phi*jari2*jari2;
    /*mendeklarasikan variabel p,l,luasPersegiPanjang dengan tipe data double
    * memberi nilai p:15 , l:10 , luasPersegiPanjang:p*l
    */
    double p=15,l=10,luasPersegiPanjang=p*l;
    /* mendeklarasikan variabel a,t,luasSegitiga dengan tipe data double
    * memberi nilai a:10 , t:20 , luasSegitiga:0.5*a*t
    */
    double a=10,t=20,luasSegitiga=0.5*a*t; 
    
    //membuat constructor tanpa parameter
    Bangun2Dall(){
        
    }
    
    /*membuat method paintComponent sebagai tempat untuk menggambar 
    * bangun datar 2D 
    */
    @Override
     public void paintComponent(Graphics g){
        // Memanggil method paintComponent dari superclass
        super.paintComponent(g);
        //seting Font
        Font f = new Font ("Arial", 1, 4);
        g.setFont(f);
        
        Graphics2D g2d=(Graphics2D)g;
        //PERBESARAN 3 KALI untuk gambar string dan bangun 2D
        g2d.scale(PerbesarGmb, PerbesarGmb);
        
        //MENGGAMBAR LINGKARAN
        //seting warna teks dan lingkaran berwarna biru
        g.setColor(Color.BLUE);
        //menggambar string jari-jari di koordinat x:4,y:10
        g.drawString("Jari-jari : "+jari2, 4, 10);
        //menggambar string Luas Lingkaran di koordinat x:4,y:18
        g.drawString("Luas Lingkaran : "+luasLingkaran, 4, 18);
        //menggambar string Perbesaran gambar di koordinat x:4,y:25
        g.drawString("Perbesaran gambar : "+PerbesarGmb+" kali", 4, 25);
        //membuat stroke oval koordinat x:4,y:40, width:20px,height:20px
        g.drawOval(4, 40, 20, 20);
        //menggambar string LINGKARAN di koordinat x:4,y:70
        g.drawString("LINGKARAN", 4, 70);
        
        //memberi warna background pada gambar persegi panjang
        g.setColor(Color.GREEN);
        //membuat fill rectangle koordinat x:60,y:0, width:620px,height:380px
        g.fillRect(60, 0, 620, 380);
        
        //MENGGAMBAR PERSEGI PANJANG
        //seting warna teks dan persegi panjang berwarna biru
        g.setColor(Color.BLUE);
        //menggambar string Panjang di koordinat x:70,y:10
        g.drawString("Panjang : "+p, 70, 10);
        //menggambar string Lebar di koordinat x:70,y:18
        g.drawString("Lebar : "+l, 70, 18);
        //menggambar string Luas Persegi Panjang di koordinat x:70,y:25
        g.drawString("Luas Persegi Panjang : "+luasPersegiPanjang, 70, 25);
        //menggambar string Perbesaran gambar di koordinat x:70,y:32
        g.drawString("Perbesaran gambar : "+PerbesarGmb+" kali", 70, 32);
        //membuat stroke rectangle koordinat x:70,y:40, width:40px,height:20px
        g.drawRect(70, 40, 40, 20); 
        //menggambar string PERSEGI PANJANG di koordinat x:70,y:70
        g.drawString("PERSEGI PANJANG", 70, 70);
        
        //memberi warna background pada gambar segitiga
        g.setColor(Color.MAGENTA);
        //membuat fill rectangle koordinat x:130,y:0, width:620px,height:380px
        g.fillRect(130, 0, 620, 380);
        
        //MENGGAMBAR SEGITIGA
        //seting warna teks dan segitiga berwarna biru
        g.setColor(Color.BLUE);
        //menggambar string Alas di koordinat x:140,y:10
        g.drawString("Alas : "+a, 140, 10);
        //menggambar string Tinggi di koordinat x:140,y:18
        g.drawString("Tinggi : "+t, 140, 18);
        //menggambar string Luas Segitiga di koordinat x:140,y:25
        g.drawString("Luas Segitiga : "+luasSegitiga, 140, 25);
        //menggambar string Perbesaran Gambar di koordinat x:140,y:32
        g.drawString("Perbesaran gambar : "+PerbesarGmb+" kali", 140, 32);
        //menggambar string SEGITIGA di koordinat x:140,y:70
        g.drawString("SEGITIGA", 140, 70);
        //mendeklarasikan array x1
        int[]x1= {140, 146, 154};
        //mendeklarasikan array y1
        int[] y1={40, 60, 40};
        /*menggambar stroke polygon dengan koordinat x diambil dari x1
        * koordinat y diambil dari y1 , dengan jumlah titik 3
        */
        g.drawPolygon(x1,y1 , 3);
     }
     
    //membuat method InfoLuas
    void InfoLuas(){
        //menampilkan output Program Luas Bangun Datar 2D"
        System.out.println("Program Luas Bangun Datar 2D");
        //menampilkan output ============================
        System.out.println("============================");
    }
    
    /**
     * membuat method main untuk menampilkan output dari program yang dibuat
     * beserta objek-objek didalamnya
     * @param args parameter args
     */
    public static void main(String[]args){
        //memanggil Kelas Bangun2Dall dengan nama b2d
        Bangun2Dall b2d=new Bangun2Dall();
        //seting warna backround untuk b2d berwarna kuning
        b2d.setBackground(Color.YELLOW);
        //memanggil method InfoLuas yang ada pada Kelas Bangun2Dall
        b2d.InfoLuas();
        
        //Blok try-catch untuk menangkap kesalahan Arithmetic Exception
        try{
            /*Memanggil Constructor Lingkaran berparameter yang ada
            * pada Kelas Lingkaran dengan nama ling
            */
            Lingkaran ling=new Lingkaran(10);
            //memanggil method InfoLuas yang ada pada Kelas Lingkaran
            ling.InfoLuas();
        }catch(ArithmeticException exc){
            System.out.println(exc);
        }
                
        /*Memanggil Constructor PersegiPanjang berparameter yang ada 
        * pada Kelas PersegiPanjang dengan nama pp
        */
        PersegiPanjang pp=new PersegiPanjang(15,10);
        //memanggil method InfoLuas yang ada pada Kelas PersegiPanjang
        pp.InfoLuas();
        
        /*Memanggil Constructor Segitiga berparameter yang ada 
        * pada kelas Segitiga dengan nama s
        */
        Segitiga s=new Segitiga(10,20);
        //memanggil method InfoLuas yang ada pada Kelas Segitiga
        s.InfoLuas();
        
        //menambahkan Kelas JFrame ke dalam program dengan nama jf
        JFrame jf=new JFrame();
        
        //memberi judul frame
        jf.setTitle("Menggambar Bangun Datar");
        
        //mensetting ukuran frame width:620px height:380px
        jf.setSize(620, 380);
        
        //mensetting visibily frame
        jf.setVisible(true);
        
        //Mengakhiri jalannya program bila frame ditutup
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //menambahkan Kelas Bangun2Dall ke dalam JFrame
        jf.add(b2d);
    }
}