/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul8;

/**
 *
 * @author ACER
 */

import java.util.Scanner;
public class MahasiswaMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user=new Scanner(System.in);
        int banyakMahasiswa,uts1,uts2,uas;
        String nama,nim,tglLahir;
          System.out.println("Masukan Banyak Mahasiswa Yang akan Dimasukan : ");
        banyakMahasiswa=user.nextInt();
        Mahasiswa[] mhs=new Mahasiswa[banyakMahasiswa];
        Mahasiswa m=new Mahasiswa();
        S2 s2 = new S2();
       
        
        String jenisMahasiswa;
      
        System.out.println("Masukan Daftar Mahasiswa Informatika Peserta PBO");
        System.out.println("____________________________________________________________________");
        for (int i = 0; i < banyakMahasiswa; i++) { 
            System.out.println("Masukan NIM : ");
            nim=m.ketik();
            System.out.print("Masukan Nama : ");
            nama=m.ketik();
            System.out.println("Masukan Tanggal Lahir : ");
            tglLahir=m.ketik();
            System.out.println("Masukan Nilai UTS1 : ");
            uts1=user.nextInt();
            System.out.println("Masukan Nilai UTS2 : ");
            uts2=user.nextInt();
            System.out.println("Masukan Nilai UAS : ");
            uas=user.nextInt();
            System.out.println("Masukan Jenis Mahasiswa : ");
            jenisMahasiswa=m.ketik().toUpperCase();
            
           double nilaiFinal=m.nilaiFinal(uts1, uts2, uas);
           
           
            if (jenisMahasiswa.equalsIgnoreCase("S1")) {
                   String namaHuruf=m.nilaiHuruf(nilaiFinal);
           String status=m.status(namaHuruf);
                    
                    mhs[i]=new S1( nama,  nim,  tglLahir,  namaHuruf, uts1, uts2,  uas,  nilaiFinal,jenisMahasiswa,status );
                    
                  
            }else if (jenisMahasiswa.equalsIgnoreCase("S2")) {
                String namaHuruf=s2.nilaiHuruf2(nilaiFinal);
           String status=m.status(namaHuruf);
                
                     mhs[i]=new S2( nama,  nim,  tglLahir,  namaHuruf, uts1, uts2,  uas,  nilaiFinal, jenisMahasiswa,status );
                
               
            }
            
           
           
      }
        System.out.println("Daftar Mahasiswa Informatika Peserta PBO S1 : ");
       System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________");
         System.out.printf("%-4s","No. ");
        System.out.printf("%-15s","NIM");
        System.out.printf("%-18s","Nama");
        System.out.printf("%-15s","Tgl Lahir ");
        System.out.printf("%-22s","Jenjang Mahasiswa ");
        System.out.printf("%-15s","Uts 1");
        System.out.printf("%-15s","Uts 2");
        System.out.printf("%-15s","UAS");
        System.out.printf("%-22s","Final");
        System.out.printf("%-15s","Nilai");
        System.out.printf("%-15s","Status Mahasiswa ");
        
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < banyakMahasiswa; i++) {
            if (mhs[i] instanceof S1 ) {
                 System.out.printf("%-4s",i+1);
        System.out.printf("%-15s",mhs[i].getNim());
        System.out.printf("%-18s",mhs[i].getNama());
        System.out.printf("%-15s",mhs[i].getTglLahir());
        System.out.printf("%-22s",mhs[i].getJenjang());
        System.out.printf("%-15s",mhs[i].getUts1());
        System.out.printf("%-15s",mhs[i].getUts2());
        System.out.printf("%-15s",mhs[i].getUas());
        System.out.printf("%-22s",mhs[i].getNilaiFinal());
        System.out.printf("%-15s",mhs[i].getNilaiHuruf());
        System.out.printf("%-15s",m.status(mhs[i].getNilaiHuruf()));
        System.out.println("");
            }
        
            
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Daftar Mahasiswa Informatika Peserta PBO S2 : ");
      System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.printf("%-4s","No. ");
        System.out.printf("%-15s","NIM");
        System.out.printf("%-18s","Nama");
        System.out.printf("%-15s","Tgl Lahir ");
        System.out.printf("%-22s","Jenjang Mahasiswa ");
        System.out.printf("%-15s","Uts 1");
        System.out.printf("%-15s","Uts 2");
        System.out.printf("%-15s","UAS");
        System.out.printf("%-22s","Final");
        System.out.printf("%-15s","Nilai");
        System.out.printf("%-15s","Status Mahasiswa ");
        
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < banyakMahasiswa; i++) {
            if ( mhs[i] instanceof S2) {
                System.out.printf("%-4s",i+1);
        System.out.printf("%-15s",mhs[i].getNim());
        System.out.printf("%-18s",mhs[i].getNama());
        System.out.printf("%-15s",mhs[i].getTglLahir());
        System.out.printf("%-22s", mhs[i].getJenjang());
        System.out.printf("%-15s",mhs[i].getUts1());
        System.out.printf("%-15s",mhs[i].getUts2());
        System.out.printf("%-15s",mhs[i].getUas());
        System.out.printf("%-22s",mhs[i].getNilaiFinal());
        System.out.printf("%-15s",mhs[i].getNilaiHuruf());
                System.out.printf("%-15s",m.status(mhs[i].getNilaiHuruf()));
        
        System.out.println("");
            }
         
            
        }
         System.out.println("-________________________________________________________________________________________________________________________________________________________________________________________________________________");
          System.out.println("Daftar Mahasiswa Informatika Peserta PBO  : ");
       System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________");
         System.out.printf("%-4s","No. ");
        System.out.printf("%-15s","NIM");
        System.out.printf("%-18s","Nama");
        System.out.printf("%-15s","Tgl Lahir ");
        System.out.printf("%-22s","Jenjang Mahasiswa ");
        System.out.printf("%-15s","Uts 1");
        System.out.printf("%-15s","Uts 2");
        System.out.printf("%-15s","UAS");
        System.out.printf("%-22s","Final");
        System.out.printf("%-15s","Nilai");
        System.out.printf("%-15s","Status Mahasiswa ");
        
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         for (int i = 0; i < banyakMahasiswa; i++) {
          
                System.out.printf("%-4s",i+1);
                System.out.printf("%-15s",mhs[i].getNim());
                System.out.printf("%-18s",mhs[i].getNama());
                System.out.printf("%-15s",mhs[i].getTglLahir());
                System.out.printf("%-22s", mhs[i].getJenjang());
                System.out.printf("%-15s",mhs[i].getUts1());
                System.out.printf("%-15s",mhs[i].getUts2());
                System.out.printf("%-15s",mhs[i].getUas());
                System.out.printf("%-22s",mhs[i].getNilaiFinal());
                System.out.printf("%-15s",mhs[i].getNilaiHuruf());
                System.out.printf("%-15s",m.status(mhs[i].getNilaiHuruf()));
        
        System.out.println("");
        
    }
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
               System.out.println("");
                System.out.println("Daftar Mahasiswa Informatika Peserta PBO S1 : ");
              System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________");
               System.out.printf("%-4s","No. ");
        System.out.printf("%-15s","NIM");
        System.out.printf("%-18s","Nama");
        System.out.printf("%-15s","Tgl Lahir ");
        System.out.printf("%-22s","Jenjang Mahasiswa ");
        System.out.printf("%-15s","Uts 1");
        System.out.printf("%-15s","Uts 2");
        System.out.printf("%-15s","UAS");
        System.out.printf("%-22s","Final");
        System.out.printf("%-15s","Nilai");
        System.out.printf("%-15s","Status Mahasiswa ");
        
        System.out.println("");
               System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

               for (int i = 0; i < banyakMahasiswa; i++) {
                   if (mhs[i] instanceof S1 ) {
                       if (mhs[i].getStatus().equalsIgnoreCase("Lulus")) {
               System.out.printf("%-4s",i+1);
               System.out.printf("%-15s",mhs[i].getNim());
               System.out.printf("%-18s",mhs[i].getNama());
               System.out.printf("%-15s",mhs[i].getTglLahir());
               System.out.printf("%-22s",mhs[i].getJenjang());
               System.out.printf("%-15s",mhs[i].getUts1());
               System.out.printf("%-15s",mhs[i].getUts2());
               System.out.printf("%-15s",mhs[i].getUas());
               System.out.printf("%-22s",mhs[i].getNilaiFinal());
               System.out.printf("%-15s",mhs[i].getNilaiHuruf());
               System.out.printf("%-15s",m.status(mhs[i].getNilaiHuruf()));
               System.out.println("");
                   }
                       }
                       
   

    
    }
               
}
}
