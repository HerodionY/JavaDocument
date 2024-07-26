/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul4;

import static Modul4.Buku.input;


/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class BukuMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Buku[] daftarBuku;
        
        int jumlahBuku=0;
        daftarBuku=new Buku[jumlahBuku];
              while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Daftar Buku Lengkap");
            System.out.println("3. Cari Buku Berdasarkan Tahun Terbit");
            System.out.println("4. Cari Buku Berdasarkan Pengarang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 0:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                case 1:
                    // Meminta masukan berapa jumlah buku baru yang akan disimpan
        System.out.print("Masukkan jumlah buku baru yang akan disimpan: ");
         jumlahBuku = input.nextInt();
        
        
        
        
        // Membuat obyek buku dan memasukkan kode buku, judul, tahun terbit, dan nama pengarang
        daftarBuku = new Buku[jumlahBuku];
        for (int i = 0; i < jumlahBuku; i++) {
            
            System.out.print("Masukkan kode buku: ");
            String kodeBuku = input();
            System.out.print("Masukkan judul buku: ");
            String judulBuku = input();
            System.out.print("Masukkan tahun terbit buku: ");
            int tahunTerbit = input.nextInt();
            System.out.print("Masukkan nama pengarang buku: ");
            String namaPengarang = input();

            daftarBuku[i] = new Buku(kodeBuku, judulBuku, tahunTerbit, namaPengarang);
        }
                    break;
                case 2:
                    if (jumlahBuku==0) {
                        System.out.println("Belum ada Buku ");
                    }else{
                        System.out.println("Daftar buku lengkap:");
        System.out.println("Kode Buku     Judul     Tahun Terbit     Nama Pengarang");
        for (Buku buku : daftarBuku) {
            System.out.printf("%s",buku.getKodeBuku());
            System.out.printf("%14s",buku.getJudul());
            System.out.printf("%10s",buku.getTahunTerbit());
            System.out.printf("%17s",buku.getNamaPengarang());
            System.out.println();
        }
      
                        
                    }
                break;
                case 3:
                     // Menampilkan jumlah buku yang terbit pada tahun tertentu
         System.out.print("Masukkan tahun terbit: ");
       int tahunCari=input.nextInt();
        System.out.println("Buku yang terbit pada tahun " + tahunCari + ":");
        
        for (Buku buku : daftarBuku) {
            if (buku.getTahunTerbit() == tahunCari) {
                System.out.println("Kode buku: " + buku.getKodeBuku());
                System.out.println("Judul: " + buku.getJudul());
                System.out.println("Tahun terbit: " + buku.getTahunTerbit());
                System.out.println("Nama pengarang: " + buku.getNamaPengarang());
                System.out.println();
        }
        else{
            System.out.println("Tidak ada buku yang terbit pada tahun " + tahunCari);
        }
                    
            }
        break;
                case 4:
                    // Menampilkan data buku yang ditulis oleh pengarang tertentu
        System.out.print("Masukkan nama pengarang yang ingin ditampilkan: ");
        String namaPengarangCari = input.next();
        System.out.println("Data buku yang ditulis oleh " + namaPengarangCari + ":");
                for (Buku daftarBuku1 : daftarBuku) {
                    if (daftarBuku1.getNamaPengarang().equalsIgnoreCase(namaPengarangCari)) {
                        System.out.println("Kode buku: " + daftarBuku1.getKodeBuku());
                        System.out.println("Judul: " + daftarBuku1.getJudul());
                        System.out.println("Tahun terbit: " + daftarBuku1.getTahunTerbit());
                        System.out.println("Nama pengarang: " + daftarBuku1.getNamaPengarang());
                        System.out.println();
                    }
                    else{
                        System.out.println("Tidak ada buku yang terbit pada tahun " + namaPengarangCari);
                    }
                    
                }break;
                
                
                case 5: 
                    Buku bukuTerbitLama = null;
                    int tahunTerbitLama = 0;
                        for (Buku daftarBuku1 : daftarBuku) {
                        if (daftarBuku1.getTahunTerbit()<tahunTerbitLama) {
                            tahunTerbitLama = daftarBuku1.getTahunTerbit();
                           bukuTerbitLama=daftarBuku1;
                        }
                    }
                    System.out.println("Buku terbitan paling lama:");
                    System.out.println(bukuTerbitLama);
                    break;
                case 6: Buku bukuTerbitbaru = null;
                    int tahunTerbitBaru = 0;
                        for (Buku daftarBuku1 : daftarBuku) {
                        if (daftarBuku1.getTahunTerbit()<tahunTerbitBaru) {
                            tahunTerbitBaru = daftarBuku1.getTahunTerbit();
                           bukuTerbitbaru=daftarBuku1;
                        }
                    }
                    System.out.println("Buku terbitan paling lama:");
                    System.out.println(bukuTerbitbaru);


                
        

       
  
        
            }
 
          

                
                }
}
}


