/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Buku {//class
    //mendeklarasikan variabel-variabel yang akan digunakan dalam kelas Buku. 
    private String kodeBuku;
    private String judul;
    private int tahunTerbit;
    private Pengarang[] daftarPengarang;
    private int jumlahPengarang;
    private Buku bukuLama;
    private Buku bukuBaru;
//konstruktor dari kelas Buku yang memiliki empat parameter yaitu kodeBuku bertipe data String, judul bertipe data String, tahunTerbit bertipe data int, 
    //dan namaPengarang bertipe data String.

    Buku(String kodeBuku, String judul, int tahunTerbit, Pengarang[] daftarPengarang) {
       this.kodeBuku=kodeBuku;
        this.judul=judul;
        this.tahunTerbit=tahunTerbit;
        this.daftarPengarang=daftarPengarang;
    }
    

    

    public void setDaftarPengarang(Pengarang[] pengarang) {
        this.daftarPengarang = pengarang;
    }

    public Pengarang[] getDaftarPengarang() {
        return daftarPengarang;
    }

    public Buku(String kodeBuku, String judul, int tahunTerbit, Pengarang[] daftarPengarang, Buku bukuLama, Buku bukuBaru) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.daftarPengarang = daftarPengarang;
        this.bukuLama = bukuLama;
        this.bukuBaru = bukuBaru;
        
    }
    
   
//getter Buku LAma
    public Buku getBukuLama() {
        return bukuLama;
    }
//getter Buku baru
    public Buku getBukuBaru() {
        return bukuBaru;
    }
//setter BukuLama
    public void setBukuLama(Buku bukuLama) {
        this.bukuLama = bukuLama;
    }
//setter bukuy baru
    public void setBukuBaru(Buku bukuBaru) {
        this.bukuBaru = bukuBaru;
    }
    //array of daftarBuku bertipe Buku
    
    //setter Tahun terbit
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
//setter nama Pengarang
    
//setter Kode Buku
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }
//setter judul buku
    public void setJudul(String judul) {
        this.judul = judul;
    }
//getter kode buku
    public String getKodeBuku() {
        return kodeBuku;
    }
//getter judul
    public String getJudul() {
        return judul;
    }
//getter tahun
    public int getTahunTerbit() {
        return tahunTerbit;
    }
//getter nama pengarang
   
//metode scanner
  public static String input(){
  Scanner user = new Scanner(System.in);
        return user.nextLine();
  }

   

    public int getJumlahPengarang() {
        return jumlahPengarang;
    }

    public void setJumlahPengarang(int jumlahPengarang) {
        this.jumlahPengarang = jumlahPengarang;
    }


  }
 

  