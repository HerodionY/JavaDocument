/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class KelolaBuku {
    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Buku[] daftarBuku = new Buku[100];
        int jumlahBuku = 0;

        System.out.print("Berapa jumlah buku baru yang akan disimpan? ");
        int jumlahBukuBaru = input.nextInt();
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

            Buku buku = new Buku(kodeBuku, judul, tahunTerbit, daftarPengarang);
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        }

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

        // Menampilkan jumlah buku yang diterbitkan pada tahun tertentu
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
    }

}
