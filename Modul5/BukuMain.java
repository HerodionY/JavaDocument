/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

import static Modul5.Buku.input;
import Modul5.Pengarang;

/**
 *
 * @author ACER
 */
import java.util.Scanner;//mengimport Scanner
public class BukuMain {//class
    public static void main(String[] args) {//main
        Scanner input=new Scanner(System.in);//
        //array of daftarBuku bertipe Buku
        int jumlahBukuBaru=0;
        Buku[] daftarBuku = new Buku[100];
        int jumlahBuku=0;
        //membuat objec array of daftar buku bertipe buku bejumlah jumlahBuku
              while (true) {//untuk mengulang menu sampai keluar atau salah
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Daftar Buku Lengkap");
            System.out.println("3. Cari Buku Berdasarkan Tahun Terbit");
            System.out.println("4. Cari Buku Berdasarkan Pengarang");
             System.out.println("5. Tampilkan Buku Terbit Paling Lama");
                  System.out.println("6. Tampilkan Buku Terbit Paling Baru");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            int pilihan = input.nextInt();//untuk memilih menu
            switch (pilihan) {
                case 0://fitur untuk keluar
                    System.out.println("Terima kasih!");
                    System.exit(0);
                case 1:
                    
//                    Tambah Buku: Fitur ini memungkinkan pengguna untuk menambahkan beberapa buku sekaligus beserta detailnya 
//                            seperti kode buku, judul buku, tahun terbit buku, dan nama pengarang.
                    // Meminta masukan berapa jumlah buku baru yang akan disimpan
       System.out.print("Berapa jumlah buku baru yang akan disimpan? ");
         jumlahBukuBaru = input.nextInt();
        input.nextLine();
            
        for (int i = 1; i <= jumlahBukuBaru; i++) {
            System.out.println("Buku ke-" + i);
            System.out.print("Kode Buku: ");
            String kodeBuku = input.nextLine();

            System.out.print("Judul: ");
            String judul = input.nextLine();

            System.out.print("Tahun Terbit: ");
            int tahunTerbit = input.nextInt();
            input.nextLine();

            System.out.print("Jumlah Pengarang: ");
            int jumlahPengarang = input.nextInt();
            input.nextLine();
            Pengarang[] daftarPengarang = new Pengarang[jumlahPengarang];
            
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

            Buku buku = new Buku(kodeBuku, judul, tahunTerbit, daftarPengarang);
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        }

            

           
        
                    break;

                case 2://Tampilkan Daftar Buku Lengkap: Fitur ini akan menampilkan daftar buku yang telah ditambahkan sebelumnya, 
                    //termasuk detailnya seperti kode buku, judul buku, tahun terbit buku, dan nama pengarang.
                   // Menampilkan data buku beserta pengarangnya masing-masing
        System.out.println("\nData Buku");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Kode Buku: " + daftarBuku[i].getKodeBuku());
            System.out.println("Judul: " + daftarBuku[i].getJudul());
            System.out.println("Tahun Terbit: " + daftarBuku[i].getTahunTerbit());
            System.out.println("Daftar Pengarang:");
            for (int j = 0; j < daftarBuku[i].getJumlahPengarang(); j++) {
                System.out.println("NIK: " + daftarBuku[i].getDaftarPengarang()[j].getNIK());
                System.out.println("Nama: " + daftarBuku[i].getDaftarPengarang()[j].getNama());
                System.out.println("Alamat: " + daftarBuku[i].getDaftarPengarang()[j].getAlamat());
            }
            System.out.println();
        }
                break;
                case 3:
                    //Cari Buku Berdasarkan Tahun Terbit: Fitur ini akan menampilkan daftar buku yang terbit pada tahun yang ditentukan oleh pengguna.
                     // Menampilkan jumlah buku yang terbit pada tahun tertentu
         // Menampilkan jumlah buku yang diterbitkan pada tahun tertentu
    System.out.print("\nMasukkan tahun yang diinginkan: ");
    int tahun = input.nextInt();
    int jumlahBukuTahun = 0;
    for (int i = 0; i < jumlahBuku; i++) {
        if (daftarBuku[i].getTahunTerbit() == tahun) {
            jumlahBukuTahun++;
        }
    }
    System.out.println("Jumlah buku yang diterbitkan pada tahun " + tahun + ": " + jumlahBukuTahun);

        break;
                case 4:
                    //Cari Buku Berdasarkan Pengarang: Fitur ini akan menampilkan daftar buku yang ditulis oleh pengarang yang ditentukan oleh pengguna.
                    // Menampilkan data buku yang ditulis oleh pengarang tertentu
        // Mencari buku berdasarkan nama pengarang
    System.out.print("\nMasukkan nama pengarang yang ingin dicari: ");
    String namaPengarang = input.nextLine();
    boolean ditemukan = false;
    for (int i = 0; i < jumlahBuku; i++) {
        Pengarang[] daftarPengarang = daftarBuku[i].getDaftarPengarang();
        for (int j = 0; j < daftarPengarang.length; j++) {
            if (daftarPengarang[j].getNama().equals(namaPengarang)) {
                System.out.println("Buku dengan nama pengarang " + namaPengarang + ":");
                System.out.println(daftarBuku[i].toString());
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            break;
        }
    }
    if (!ditemukan) {
        System.out.println("Buku dengan nama pengarang " + namaPengarang + " tidak ditemukan.");
    }
  
                break;
                
                
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
        System.out.println(daftarBuku[indeksBukuTerbitPalingLama].toString());
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
        System.out.println(daftarBuku[indeksBukuTerbitPalingBaru].toString());
    } else {
        System.out.println("Tidak ada buku yang ditemukan.");
    }
break;
                default: System.out.println("Tidak ditemukan");



                
        

       
  
        
            }
 
          

                
                }
}
}


