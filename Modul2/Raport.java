/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author ACER
 */
public class Raport {
    private String namaMatakuliah;
     public void setNamaMatakuliah( String nama ) {
         namaMatakuliah = nama;
     
     }
     public String getNamaMatakuliah(){
     
         return namaMatakuliah; 
     }
     public void tampilPesan(){
         System.out.printf( "Selamat datang di buku raport\n%s!\n",getNamaMatakuliah());
     
     }
     
     
     
}
