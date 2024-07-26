/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;
import Modul3.Pegawai;
import static Modul3.Pegawai.nama;

/**
 *
 * @author ACER
 */
import java.util.Scanner;//mengimprt scanner dari java
public class ProgramStudi {//deklarasi class
   private String prodi;//deklarasi variabel bertipe string dan private
  static int kode_prodi;//mendeklarasi kan variabel bertipe int dan static
   static String nama_prodi;//mendeklarasi kan variabel bertipe int dan static
   
   
   public void ProgramStudi (){//metyode ProgramStudi
       String nama = Pegawai.nama;//variabel nama berisi variabel nama dari class menghitungGaji
        Scanner cari = new Scanner(System.in);//Scanner
   prodi=cari.nextLine().toUpperCase();//mengisi prodi dengan scanner yang akan menjadi huruf besar semua
       
   
   switch(prodi){//switch prodi
       case "INFORMATIKA"://case informatika akan memunculkan isi variabel nama_prodi kode_prodi dan nama dari class menghitungGaji
           nama_prodi="Informatika";
           kode_prodi=55201;
           Pegawai.nama="Nama Ketua Program Studi : " +"Robertus Adi Nugroho, S.T., M.Eng.";
            System.out.println("Nama Program Studi : "+nama_prodi);//mencetak tulisan "nama Program Studi" dan isi variabel nama_prodi
            System.out.println("Kode Program Studi : "+kode_prodi);//mencetak tulisan "Kode Program Studi " dan isi variabel kode_prodi
            System.out.println(Pegawai.nama);//memunculkan isi variabel nama
        break;
       case "TEKNIK MESIN"://case TEKNIK MESIN akan memunculkan isi variabel nama_prodi kode_prodi dan nama dari class menghitungGaji
           nama_prodi="Teknik Mesin";
           kode_prodi=21201;
           Pegawai.nama="Nama Ketua Program Studi : " +"Budi Setyahandana, M.T.";
            System.out.println("Nama Program Studi : "+nama_prodi);//mencetak tulisan "nama Program Studi" dan isi variabel nama_prodi
            System.out.println("Kode Program Studi : "+kode_prodi);//mencetak tulisan "Kode Program Studi " dan isi variabel kode_prodi
            System.out.println(Pegawai.nama);//memunculkan isi variabel nama
       break;
       case "TEKNIK ELEKTRO" : //case TEKNIK ELEKTRO akan memunculkan isi variabel nama_prodi kode_prodi dan nama dari class menghitungGaji
           nama_prodi="Teknik Elektro";
           kode_prodi=20201;
           Pegawai.nama="Nama Ketua Program Studi : " +"Ir. Martanto, M.T..";
            System.out.println("Nama Program Studi : "+nama_prodi);//mencetak tulisan "nama Program Studi" dan isi variabel nama_prodi
            System.out.println("Kode Program Studi : "+kode_prodi);//mencetak tulisan "Kode Program Studi " dan isi variabel kode_prodi
            System.out.println(Pegawai.nama);//memunculkan isi variabel nama
        break;
       case "MATEMATIKA"://case MATEMATIKA akan memunculkan isi variabel nama_prodi kode_prodi dan nama dari class menghitungGaji
            nama_prodi="Matematika";
           kode_prodi=44201;
           Pegawai.nama="Nama Ketua Program Studi : " +"Dr. rer nat. Herry Pribawanto S";
            System.out.println("Nama Program Studi : "+nama_prodi);//mencetak tulisan "nama Program Studi" dan isi variabel nama_prodi
            System.out.println("Kode Program Studi : "+kode_prodi);//mencetak tulisan "Kode Program Studi " dan isi variabel kode_prodi
            System.out.println(Pegawai.nama);//memunculkan isi variabel nama
       break;
       default : System.out.println("TIDAK DITEMUKAN");//default akan memunculkan tulisan tidak ditemukan
   }
   
   
   }
   }
   
    
    

