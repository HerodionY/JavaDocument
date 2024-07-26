/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class KelolaPerusahaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pegawai[] daftarPegawai;
        Pegawai pegawai=new Pegawai();
        double totalgaji=0;
        
        // meminta input data perusahaan
        System.out.print("Masukkan nama perusahaan: ");
        String namaPerusahaan = input.nextLine();
        System.out.print("Masukkan alamat perusahaan: ");
        String alamatPerusahaan = input.nextLine();
        System.out.print("Masukkan nama pemilik perusahaan: ");
        String pemilikPerusahaan = input.nextLine();
        System.out.print("Masukkan NPWP perusahaan: ");
        String npwpPerusahaan = input.nextLine();

        // membuat objek perusahaan
        Perusahaan perusahaan = new Perusahaan(namaPerusahaan, alamatPerusahaan, pemilikPerusahaan, npwpPerusahaan, 0);
// meminta input jumlah pegawai
        System.out.print("Masukkan jumlah pegawai: ");
        int jumlahPegawai = input.nextInt();
        input.nextLine();
            daftarPegawai=new Pegawai[jumlahPegawai];
        // memasukkan data pegawai baru
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("Pegawai ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Golongan : ");
            int golongan;
            golongan = input.nextInt();
            System.out.print("Masukan NPP Pegawai : ");
            int NPP=input.nextInt();
            System.out.print("Masukan Status Pegawai Jika 1. Menikah dan 2.Belum menikah :");
            int status=input.nextInt();
            System.out.print("Masukan Jumlah anak : ");
            int jumlahAnak=input.nextInt();
            int gajiPokok=0; 
            int tunjanganKeluarga=0;
            int gajiTotal=0;
           gajiPokok=pegawai.menghitungGaji(golongan);
           
            totalgaji=totalgaji+gajiPokok;
            
    
            input.nextLine();
            daftarPegawai[i]=new Pegawai(nama, gajiPokok,  NPP,  golongan,  status,  jumlahAnak,  tunjanganKeluarga,  gajiTotal);
        }
        double rata2=totalgaji/jumlahPegawai;
        
        // menampilkan seluruh pegawai di perusahaan
        System.out.println("\nSeluruh Pegawai:");
        
        for (Pegawai daftarPegawai1 : daftarPegawai) {
            System.out.println("Nama: " + daftarPegawai1.getNama() + ", Jabatan: " + daftarPegawai1.getGolongan() + ", Gaji Pokok: " + daftarPegawai1.getGajiPokok());
        }
        Pegawai pegawaiGajiTertinggi = null;//inisiasi variabel bukuTerbitLama bertipe buku
int GajiTertinggi = Integer.MAX_VALUE;
       for (Pegawai daftarPegawai1 : daftarPegawai) {
           
    if (daftarPegawai1.getGajiPokok()< GajiTertinggi) {
        pegawaiGajiTertinggi = daftarPegawai1;
         GajiTertinggi = pegawai.getGajiPokok();
    }
}
//perintah mencetak buku yang sudah dietmukan dengan syarat bukuTerbitlama bukan null
if (pegawaiGajiTertinggi != null) {
    System.out.println("Pegawai dengan Gaji tertinggi ");
    System.out.println("Nama: " + pegawaiGajiTertinggi.getNama() + ", Jabatan: " + pegawaiGajiTertinggi.getGolongan() + ", Gaji Pokok: " + pegawaiGajiTertinggi.getGajiPokok());
  
   
} else {
    System.out.println("Tidak ada Pegawai.");
}
Pegawai pegawaiGajiTerendah = null;//inisiasi variabel bukuTerbitLama bertipe buku
int GajiTerendah = Integer.MIN_VALUE;
       for (Pegawai daftarPegawai1 : daftarPegawai) {
           
    if (daftarPegawai1.getGajiPokok()> GajiTerendah) {
        pegawaiGajiTerendah = daftarPegawai1;
         GajiTerendah = pegawai.getGajiPokok();
    }
}
//perintah mencetak buku yang sudah dietmukan dengan syarat bukuTerbitlama bukan null
if (pegawaiGajiTerendah != null) {
    System.out.println("Pegawai dengan Gaji terendah ");
    System.out.println("Nama: " + pegawaiGajiTerendah.getNama() + ", Jabatan: " + pegawaiGajiTerendah.getGolongan() + ", Gaji Pokok: " + pegawaiGajiTerendah.getGajiPokok());
  
   
} else {
    System.out.println("Tidak ada Pegawai.");
}
        System.out.println("Rata- rata Gaji Pegawai : "+rata2);

}

}
