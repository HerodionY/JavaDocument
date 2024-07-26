/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.Modul_1;

/**
 *
 * @author ACER
 */

public class Buku {
   private String judul;
   private String pengarang;
   private String ISBN;
   private String penerbit;
   private String kategori;
   
  Buku(String judul,String ISBN){
      judul=judul;
    ISBN=ISBN;
  }
   public void Dipinjam(){
       System.out.println("Sedang Dipinjam");
   }
   public void Dikembalikan(){
       System.out.println("Sudah dikembalikan ");
   
   
   }
   public static void main(String[] args){
   Buku book1=new Buku("Struktur Data","1304595");
   book1.Dipinjam();
   
   Buku book2=new Buku("Java Fundamental","1304300");
   book2.Dikembalikan();
   
       
   
   
   }
}
