/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.Modul_1;

/**
 *
 * @author ACER
 */
public class Lingkaran {//Deklarasi class
    double r;//Memesan tempat untuk biangan desimal dengan nama r
    double luas;//Memesan tempat untuk biangan desimal dengan nama luas
    final double PHI=3.14;//tipe data konstanta bernama PHI berisi 3.14
    Lingkaran(){};//memanggil konstruktor lingkaran

    public void luas(){//Deklarasi method void luas
        r=7;//Memasukkan 7 ke dalam variable r
        luas=PHI*r*r;//isi variable phi dikali dengan isi variabel r dikali isi variable r disimpan di luas

        System.out.println("Luas lingkaran dengan jari="+r+" adalah : "+luas);
        //Menampilkan tulisan "Luas lingkaran dengan jari=", menampilkan isi variable r, Menampilkan tulisan " adalah : ", menampilkan isi variable luas
    }
}

