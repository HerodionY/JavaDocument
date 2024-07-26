/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.Modul_1;

/**
 *
 * @author ACER
 */
public class Mobil {
     String warna;//deklarasi variable warna bertipe String

 Mobil(String wrn) { //kontruktor mobil dibuat dengan parameter wrn yang bertipe String wrn sama dengan warna
 warna = wrn;
 }
 void jalan_maju() {//Metode dengan Nama jalan_maju 
 System.out.print("Mobil warna " + warna);//Mencetak Tulisan "Mobil warna " ditambah dengan isi variable warna
 System.out.println(" Maju !");//mencetak tulisan "Maju !"
 }
 public static void main(String[] args) {//Metode main 
 Mobil sedan = new Mobil("merah");//objek sedan dibuat umtuk memanggil konstruktor mobil dengan parameter merah 
 sedan.jalan_maju();//objek sedan memanggi method jalan maju 
 }
}
