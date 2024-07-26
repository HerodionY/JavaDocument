/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

import static Modul6.Buku.input;


/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class BukuMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int jumlahBukuBaru=0;
       Buku[] daftarBuku = new Buku[100];
        int jumlahBuku=0;
        int jumlahPengarang=0;
        daftarBuku=new Buku[jumlahBuku];
              while (true) {
             System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Daftar Buku Lengkap");
            System.out.println("3. Cari Buku Berdasarkan Tahun Terbit");
            System.out.println("4. Cari Buku Berdasarkan Pengarang");
             System.out.println("5. Tampilkan Buku Terbit Paling Lama");
                  System.out.println("6. Tampilkan Buku Terbit Paling Baru");
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
         jumlahBukuBaru = input.nextInt();
        
        
        
        
        // Membuat obyek buku dan memasukkan kode buku, judul, tahun terbit, dan nama pengarang
        daftarBuku = new Buku[jumlahBukuBaru];
        for (int i = 0; i < jumlahBukuBaru; i++) {
            
            System.out.print("Masukkan kode buku: ");
            String kodeBuku = input();
            System.out.print("Masukkan judul buku: ");
            String judulBuku = input();
            System.out.print("Masukkan tahun terbit buku: ");
            int tahunTerbit = input.nextInt();
            System.out.print("Masukkan jumlah pengarang buku: ");
             jumlahPengarang= input.nextInt();
            System.out.println();
            Pengarang[] daftarPengarang = new Pengarang[10];
            for (int j = 1; j <= jumlahPengarang; j++) {
                System.out.println("Pengarang ke-" + j);
                System.out.print("NIK: ");
                String NIK = input.nextLine();
                System.out.print("Nama: ");
                String nama = input.nextLine();
                System.out.print("Alamat: ");
                String alamat = input.nextLine();

                daftarPengarang[j-1] = new Pengarang(NIK, nama, alamat);
            }

            Buku buku = new Buku(kodeBuku, judulBuku, tahunTerbit, daftarPengarang);
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;

           
        }
                    break;
                case 2:
                    if (jumlahBuku==0) {
                        System.out.println("Belum ada Buku ");
                    }else{
                        System.out.println("Daftar buku lengkap:");
        
        for (Buku buku : daftarBuku) {
            System.out.println("Kode Buku : "+buku.getKodeBuku());
            System.out.println("Judul Buku : "+buku.getJudul());
            System.out.println("Tahun Terbit Buku : "+buku.getTahunTerbit());
            for (int i = 0; i < jumlahPengarang; i++) {
                System.out.print("NIK PEngarang : "+buku.getDaftarPengarang()[i].getNIK());
                System.out.println("Nama Pengarang : "+buku.getDaftarPengarang()[i].getNama());
                System.out.println("Alamat Pengarang : "+buku.getDaftarPengarang()[i].getAlamat());
            }
            
            System.out.println();
        }
      
                        
                    }
                break;
                case 3:
                     // Menampilkan jumlah buku yang terbit pada tahun tertentu
         System.out.print("Masukkan tahun terbit: ");
       int tahunCari=input.nextInt();
        System.out.println("Buku yang terbit pada tahun " + tahunCari + ":");
        int jmlhBuku=0;
        for (Buku buku : daftarBuku) {
            int i=0;
            if (buku.getTahunTerbit() == tahunCari) {
                
                        jmlhBuku =jmlhBuku+1;
                System.out.println("Kode buku: " + buku.getKodeBuku());
                System.out.println("Judul: " + buku.getJudul());
                System.out.println("Tahun terbit: " + buku.getTahunTerbit());
                System.out.println("Nama pengarang: " + buku.getDaftarPengarang()[i].getNama());
               
                System.out.println();
        }
        else{
            System.out.println("Tidak ada buku yang terbit pada tahun " + tahunCari);
        }
           i++;          
            }
            System.out.println("Jumlah Buku Pada tahun "+tahunCari+" Adalah : "+jmlhBuku);
        break;
                case 4:
                    // Menampilkan data buku yang ditulis oleh pengarang tertentu
        System.out.print("Masukkan nama pengarang yang ingin ditampilkan: ");
        String namaPengarangCari = input.nextLine();
        System.out.println("Data buku yang ditulis oleh " + namaPengarangCari + ":");
                for (Buku daftarBuku1 : daftarBuku) {
                    int i=0;
                    if (daftarBuku1.getDaftarPengarang()[i].getNama().equalsIgnoreCase(namaPengarangCari)) {
                        System.out.println("Kode buku: " + daftarBuku1.getKodeBuku());
                        System.out.println("Judul: " + daftarBuku1.getJudul());
                        System.out.println("Tahun terbit: " + daftarBuku1.getTahunTerbit());
                        System.out.println("Nama pengarang: " + daftarBuku1.getDaftarPengarang()[i].getNama());
                        System.out.println();
                    }
                    else{
                        System.out.println("Tidak ada buku yang terbit pada tahun " + namaPengarangCari);
                    }
                    i++;
                }break;
                
                
                case 5: //Tampilkan Buku Terbit Paling Lama: Fitur ini akan menampilkan buku yang memiliki tahun terbit paling lama dari daftar buku yang telah ditambahkan sebelumnya.
                   //inisiasi variabel bukuTerbitLama bertipe buku//inisiasi variabel tahunTerbitLama bertipe integer
                    // Menampilkan buku terbitan paling lama
    int tahunTerbitPalingLama = Integer.MAX_VALUE;
    int indeksBukuTerbitPalingLama = -1;
    for (int i = 0; i < jumlahBuku; i++) {
        if (daftarBuku[i].getTahunTerbit() < tahunTerbitPalingLama) {
            tahunTerbitPalingLama = daftarBuku[i].getTahunTerbit();
            indeksBukuTerbitPalingLama = i;
        }
    }
    if (indeksBukuTerbitPalingLama != -1) {
        System.out.println("Buku terbitan paling lama:");
        System.out.println(daftarBuku[indeksBukuTerbitPalingLama].getKodeBuku());
        System.out.println(daftarBuku[indeksBukuTerbitPalingLama].getJudul());
        System.out.println(daftarBuku[indeksBukuTerbitPalingLama].getTahunTerbit());
        System.out.println(daftarBuku[indeksBukuTerbitPalingLama].getDaftarPengarang()[1].getNama());
    } else {
        System.out.println("Tidak ada buku yang ditemukan.");
    }
                        
                    break;
//inisiasi variabel bukuTerbitBaru bertipe Buku//inisiasi variabel
                case 6: //Tampilkan Buku Terbit Paling Baru: Fitur ini akan menampilkan buku yang memiliki tahun terbit paling baru dari daftar buku yang telah ditambahkan sebelumnya.
                  // Menampilkan buku terbitan paling baru
    int tahunTerbitPalingBaru = Integer.MIN_VALUE;
    int indeksBukuTerbitPalingBaru = -1;
    for (int i = 0; i < jumlahBuku; i++) {
        if (daftarBuku[i].getTahunTerbit() > tahunTerbitPalingBaru) {
            tahunTerbitPalingBaru = daftarBuku[i].getTahunTerbit();
            indeksBukuTerbitPalingBaru = i;
        }
    }
    if (indeksBukuTerbitPalingBaru != -1) {
        System.out.println("Buku terbitan paling baru:");
        System.out.println(daftarBuku[indeksBukuTerbitPalingBaru].getKodeBuku());
        System.out.println(daftarBuku[indeksBukuTerbitPalingBaru].getJudul());
        System.out.println(daftarBuku[indeksBukuTerbitPalingBaru].getTahunTerbit());
        System.out.println(daftarBuku[indeksBukuTerbitPalingBaru].getDaftarPengarang()[indeksBukuTerbitPalingBaru].getNama());
    } else {
        System.out.println("Tidak ada buku yang ditemukan.");
    }
break;
                default: System.out.println("Tidak ditemukan");


       
  
        
            }
 
          

                
                }
}
}


