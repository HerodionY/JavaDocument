/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul7;

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
        Karyawan karyawan=new Karyawan(); 
        System.out.print("Masukan NPP Anda : ");
        String npp=input.nextLine();
        karyawan.setNpp(npp);
        System.out.print("Masukan Nama Anda : ");
        String nama=input.nextLine();
        karyawan.setNama(nama); 
        System.out.print("Masukan Banyak Anak Anda : ");
        int jumlAnak=input.nextInt();
        karyawan.setJumlAnak(jumlAnak);
        input.nextLine();
        System.out.print("Anda Karyawan Tetap Atau Karyawan Kontrak : ");
        String jenisKaryawan=input.nextLine().toUpperCase();
        
       
        switch(jenisKaryawan){
            case "KARYAWAN TETAP":
                KaryawanTetap kartet=new KaryawanTetap();
            System.out.print("Masukan Golongan Anda : ");
        int golongan=input.nextInt();
        karyawan.setGolongan(golongan);
       
        double subsidiAnak=karyawan.subsidianak(jumlAnak);
        double gajiPokok=kartet.menghitungGaji(golongan);
            System.out.println("Data Karyawan");
        System.out.println(karyawan.nama);
        System.out.println(karyawan.npp);
            System.out.println("Gaji total Anda adalah : "+kartet.hitungGatot(subsidiAnak));
            break;
            case "KARYAWAN KONTRAK":KaryawanKontrak karkon=new KaryawanKontrak();
            System.out.println("Masukan Banyak Upah Harian Anda : ");
            double upahHarian=input.nextDouble();
            System.out.println("Masukan Banyak Hari Anda Masuk : ");
            int banyakHariMasuk=input.nextInt();
             subsidiAnak=karyawan.subsidianak(jumlAnak);
            karkon.setUpahHarian(upahHarian, banyakHariMasuk);
            System.out.println("Data Karyawan");
            System.out.println(karyawan.nama);
            System.out.println(karyawan.npp);
            System.out.println("Total Upah Anda : "+karkon.upahTotal(karkon.getUpahHarian(), subsidiAnak));
        break;
            default : System.out.println("Tidak Ditemukan");
        
        }
        
        
        
        
        
        
        
        
    }
    
}
