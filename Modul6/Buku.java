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
public class Buku {
    private String kodeBuku;
    private String judul;
    private int tahunTerbit;
    private Pengarang[] daftarPengarang;

    

    public void setDaftarPengarang(Pengarang[] daftarPengarang) {
        this.daftarPengarang = daftarPengarang;
    }

    public Pengarang[] getDaftarPengarang() {
        return daftarPengarang;
    }
    public Buku(String kodeBuku, String judul, int tahunTerbit, Pengarang[] daftarPengarang) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.daftarPengarang = daftarPengarang;
    }
    
    /**
     *
     */
//    public static Buku[] daftarBuku = {
//            new Buku("B01", "The Pragmatic Programmer: Your Journey to Mastery", 1999, "Andrew Hunt, David Thomas"),
//            new Buku("B02", " HTML and CSS: Design and Build Websites", 2021, "Jon Duckett"),
//            new Buku("B03", "Rapid Development: Taming Wild Software Schedules", 2022, "Steve McConnel"),
//            new Buku("B04", "You Don’t Know JS Yet: Get Started", 2020, "Kyle Simpson"),
//            new Buku("B05", "Effective Java", 2021, "Joshua Bloch"),
//            new Buku("B06", "Java Concurrency in Practice", 2022, "Brian Goetz")
//    };
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    
  public static String input(){
  Scanner user = new Scanner(System.in);
        return user.nextLine();
  }
// public void cariBukuTahun(int tahunCari,Buku daftarBuku[]) {
//        
//        System.out.println("Buku yang terbit pada tahun " + tahunCari + ":");
//        
//        for (Buku buku : daftarBuku) {
//            if (buku.getTahunTerbit() == tahunCari) {
//                System.out.println("Kode buku: " + buku.getKodeBuku());
//                System.out.println("Judul: " + buku.getJudul());
//                System.out.println("Tahun terbit: " + buku.getTahunTerbit());
//                System.out.println("Nama pengarang: " + buku.getNamaPengarang());
//                System.out.println();
//        }
//        else{
//            System.out.println("Tidak ada buku yang terbit pada tahun " + tahunCari);
//        }
  
  }
 

  