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
public class KaryawanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan jumlah karyawan yang ingin anda data = ");
        int n = input.nextInt();
        Karyawan[] kary=new Karyawan[n]; 
        Karyawan karyawan = new Karyawan();
        KaryawanKontrak karkon=new KaryawanKontrak();
        for (int i = 0; i < n; i++) {
            System.out.print("Masukan NPP Anda : ");
        String npp= karyawan.inputString();
       
        System.out.print("Masukan Nama Anda : ");
        String nama=karyawan.inputString();
       
        System.out.print("Masukan Banyak Anak Anda : ");
        int jumlAnak=input.nextInt();
        
        input.nextLine();
        System.out.print("Anda Karyawan Tetap Atau Karyawan Kontrak : ");
        String jenisKaryawan=karyawan.inputString();
        
       
        switch(jenisKaryawan){
            case "KARYAWAN TETAP":
                KaryawanTetap kartet=new KaryawanTetap();
            System.out.print("Masukan Golongan Anda : ");
        int golongan=input.nextInt();
       
       
        double subsidiAnak=karyawan.subsidianak(jumlAnak);
        double gajiPokok=kartet.menghitungGaji(golongan);
        double totalGaji=kartet.hitungGatot(gajiPokok,subsidiAnak);
        kary[i]=new KaryawanTetap(npp, nama,  golongan,  jumlAnak,  subsidiAnak,  gajiPokok,  totalGaji, jenisKaryawan );
            
            break;
            case "KARYAWAN KONTRAK":
                
            
            System.out.println("Masukan Banyak Upah Harian Anda : ");
            double upahHarian=input.nextDouble();
            System.out.println("Masukan Banyak Hari Anda Masuk : ");
            int banyakHariMasuk=input.nextInt();
             subsidiAnak=karyawan.subsidianak(jumlAnak);
            double totalUpahHarian=karkon.UpahHarian(upahHarian, banyakHariMasuk);
            double upahTotal=karkon.upahTotal(totalUpahHarian, subsidiAnak);
            kary[i]=new KaryawanKontrak(npp, nama,  0,  jumlAnak,  subsidiAnak,  totalUpahHarian,  upahTotal, jenisKaryawan );
        break;
            default : System.out.println("Tidak Ditemukan");
        }
        
        
        }
        System.out.println("Daftar Pegawai Lengkap : ");
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.printf("%-7s","No ");
            System.out.printf("%-15s","NPP ");
            System.out.printf("%-20s","Nama ");
            System.out.printf("%-20s","Jenis Karyawan ");
            System.out.printf("%-18s","Golongan ");
            System.out.printf("%-18s","Gaji Pokok  ");
            System.out.printf("%-18s","Subsidi Anak ");
            System.out.printf("%-20s","Gaji Total ");
            
            System.out.println("");
            System.out.println("=================================================================================================================");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-7s",i+1);
            System.out.printf("%-15s",kary[i].getNpp());
            System.out.printf("%-20s",kary[i].getNama());
            System.out.printf("%-20s",kary[i].getStatusPegawai());
            System.out.printf("%-18s",kary[i].getGolongan());
            System.out.printf("%-18s",kary[i].getGajiPokok());
            System.out.printf("%-18s",kary[i].getSubsidiAnak());
            System.out.printf("%-20s",kary[i].getTotalGaji());
            System.out.println("");
            
            
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Daftar Pegawai Tetap : ");
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.printf("%-7s","No ");
            System.out.printf("%-15s","NPP ");
            System.out.printf("%-20s","Nama ");
            System.out.printf("%-20s","Jenis Karyawan ");
            System.out.printf("%-18s","Golongan ");
            System.out.printf("%-18s","Gaji Pokok  ");
            System.out.printf("%-18s","Subsidi Anak ");
            System.out.printf("%-20s","Gaji Total ");
            
            System.out.println("");
            System.out.println("=================================================================================================================");
        for (int i = 0; i < n; i++) {
            if (kary[i] instanceof KaryawanTetap) {
                 int t=0;
                System.out.printf("%-7s",t+1);
                System.out.printf("%-15s",kary[i].getNpp());
                System.out.printf("%-20s",kary[i].getNama());
                System.out.printf("%-20s",kary[i].getStatusPegawai());
                System.out.printf("%-18s",kary[i].getGolongan());
                System.out.printf("%-18s",kary[i].getGajiPokok());
                System.out.printf("%-18s",kary[i].getSubsidiAnak());
                System.out.printf("%-20s",kary[i].getTotalGaji());
                System.out.println("");
            }
           
            
            
        }
         System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Daftar Pegawai Kontrak : ");
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.printf("%-7s","No ");
            System.out.printf("%-15s","NPP ");
            System.out.printf("%-20s","Nama ");
            System.out.printf("%-20s","Jenis Karyawan ");
            System.out.printf("%-18s","Gaji Pokok  ");
            System.out.printf("%-18s","Subsidi Anak ");
            System.out.printf("%-20s","Gaji Total ");
            
            System.out.println("");
            System.out.println("=================================================================================================================");
        for (int i = 0; i < n; i++) {
            if (kary[i] instanceof KaryawanKontrak) {
                 int t=0;
                System.out.printf("%-7s",t+1);
                System.out.printf("%-15s",kary[i].getNpp());
                System.out.printf("%-20s",kary[i].getNama());
                System.out.printf("%-20s",kary[i].getStatusPegawai());
                
                System.out.printf("%-18s",kary[i].getGajiPokok());
                System.out.printf("%-18s",kary[i].getSubsidiAnak());
                System.out.printf("%-20s",kary[i].getTotalGaji());
                System.out.println("");
            }
           
            
            
        }
        System.out.println("Daftar Karyawan Kontrak dengan Upah Total < 1 Juta");
         
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.printf("%-7s","No ");
            System.out.printf("%-15s","NPP ");
            System.out.printf("%-20s","Nama ");
            System.out.printf("%-20s","Jenis Karyawan ");
            System.out.printf("%-18s","Gaji Pokok  ");
            System.out.printf("%-18s","Subsidi Anak ");
            System.out.printf("%-20s","Gaji Total ");
            
            System.out.println("");
            System.out.println("=================================================================================================================");
      

int count = 0;

for (int i = 0; i < n; i++) {
    if (kary[i] instanceof KaryawanKontrak) {  
        KaryawanKontrak Kary = (KaryawanKontrak) kary[i];
        double upahTotal = kary[i].getTotalGaji();
        
        if (upahTotal < 1000000) {
            count++;
             System.out.printf("%-7s",count);
                System.out.printf("%-15s",kary[i].getNpp());
                System.out.printf("%-20s",kary[i].getNama());
                System.out.printf("%-20s",kary[i].getStatusPegawai());
                
                System.out.printf("%-18s",kary[i].getGajiPokok());
                System.out.printf("%-18s",kary[i].getSubsidiAnak());
                System.out.printf("%-20s",kary[i].getTotalGaji());
                System.out.println("");
            if (count == 0) {
        System.out.println("Tidak ada karyawan kontrak dengan upah total kurang dari 1 juta.");}
        }
       
    }
}
    }
}


      
        
        
        
        
        

