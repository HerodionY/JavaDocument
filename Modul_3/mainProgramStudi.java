/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;

import static Modul3.Pegawai.nama;//mengimport Dari package modul 3 class mengihitung gaji metode nama
import static Modul_3.ProgramStudi.kode_prodi;//mengimport
import static Modul_3.ProgramStudi.nama_prodi;//mengimport

/**
 *
 * @author ACER
 */
public class mainProgramStudi {//class 
     public static void main(String[]args){//main
       
      
       System.out.println("Program Studi Di FST");//memunculkan tulisan "Program Studi Di FST
       System.out.println("Cari Program Studi : ");//memunculkan tulisan Cari Program Studi
       ProgramStudi prodi=new ProgramStudi();//membuat objek Prodi
        
       System.out.println("Program Studi");//mencetak tulisan "Program Studi"
       System.out.println("---------------------------------------------------");//mencetak "--------------------------------------------------"
      prodi.ProgramStudi();//memanggil method ProgramStudi dari objek Prodi
      
      
      
      
      
      
      
      }
   
    
}
