
import Modul4.Buku;
import static Modul4.Buku.input;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class KelolaDealer {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
       int N=0;
       Mobil[] daftarMobil = null;
       
              while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Tampilkan Daftar Mobil Lengkap");
            System.out.println("3. Cari Mobil Berdasarkan Tahun ");
            System.out.println("4. Cari Mobil Berdasarkan Warna");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            int pilihan = input.nextInt();
             switch (pilihan) {
                case 0:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                case 1:
                    // Meminta masukan berapa jumlah buku baru yang akan disimpan
        System.out.print("Masukkan jumlah data Mobil baru yang akan disimpan: ");
         N = input.nextInt();
        // Membuat obyek buku dan memasukkan kode buku, judul, tahun terbit, dan nama pengarang
        daftarMobil = new Mobil[N];
        for (int i = 0; i < N; i++) {
            
            System.out.print("Masukkan Merk : ");
            String merk = input();
            System.out.print("Masukkan Warna : ");
            String warna = input();
            System.out.print("Masukkan tahun : ");
            int tahun = input.nextInt();
            
          daftarMobil[i]=new Mobil(warna,merk,tahun);
        }
                break;
               case 2 :
                    if (N==0) {
                        System.out.println("Belum ada Mobil ");
                    }else{
                        System.out.println("Daftar Mobil lengkap:");
        System.out.println("Merk     Warna     Tahun");
        for (Mobil mobil : daftarMobil) {
            System.out.printf("%s",mobil.getMerk());
            System.out.printf("%14s",mobil.getWarna());
            System.out.printf("%10s",mobil.getTahun());
            System.out.println();
        }
      
                        
                    }
                break;
                case 3:
                     // Menampilkan jumlah buku yang terbit pada tahun tertentu
         System.out.print("Masukkan tahun terbit: ");
       int tahunCari=input.nextInt();
        System.out.println("Buku yang terbit pada tahun " + tahunCari + ":");
        
        for (Mobil mobil : daftarMobil) {
            if (mobil.getTahun() == tahunCari) {
                System.out.println("Merk: " + mobil.getMerk());
                System.out.println("Warna: " + mobil.getWarna());
                System.out.println("Tahun : " + mobil.getTahun());
                
                System.out.println();
        }
        else{
            System.out.println("Tidak ada Mobil Pada tahun " + tahunCari);
        }
                    
            }
        break;
                case 4:
                    // Menampilkan data buku yang ditulis oleh pengarang tertentu
        System.out.print("Masukkan warna Mobil yang ingin ditampilkan: ");
        String cariWarna = input.next();
       
                 for (Mobil mobil1 : daftarMobil){
                    if (mobil1.getWarna().equalsIgnoreCase(cariWarna)) {
                       System.out.println("Merk: " + mobil1.getMerk());
                System.out.println("Warna: " + mobil1.getWarna());
                System.out.println("Tahun : " + mobil1.getTahun());
                
                System.out.println();
                    }
                    else{
                        System.out.println("Tidak ada Mobil yang berwarna"+cariWarna);
                    }
                 }
                    break;
                
                
        

       
  
        
            }
 
          

                
                }
    
    
    
    
    }
    
}

