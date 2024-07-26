/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul8;



/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Karyawan {
    private String npp;
    private String nama;
    private int golongan;
    private int jumlAnak;
    private double subsidiAnak,gajiPokok,totalGaji;
    private String StatusPegawai;
    
    

   

    public Karyawan(String npp, String nama, int golongan, int jumlAnak, double subsidiAnak, double gajiPokok, double totalGaji, String StatusPegawai ) {
        this.npp = npp;
        this.nama = nama;
        this.golongan = golongan;
        this.jumlAnak = jumlAnak;
        this.subsidiAnak = subsidiAnak;
        this.gajiPokok = gajiPokok;
        this.totalGaji = totalGaji;
        this.StatusPegawai = StatusPegawai;
      
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setTotalGaji(double totalGaji) {
        this.totalGaji = totalGaji;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setStatusPegawai(String StatusPegawai) {
        this.StatusPegawai = StatusPegawai;
    }

    public String getStatusPegawai() {
        return StatusPegawai;
    }
    
    

    public Karyawan() {
    }

    

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public void setJumlAnak(int jumlAnak) {
        this.jumlAnak = jumlAnak;
    }

    public void setNpp(String npp) {
        this.npp = npp;
    }

    public void setSubsidiAnak(double subsidiAnak) {
        this.subsidiAnak = subsidiAnak;
    }


    public double getSubsidiAnak() {
        return subsidiAnak;
    }

    public String getNpp() {
        return npp;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlAnak() {
        return jumlAnak;
    }

    public int getGolongan() {
        return golongan;
    }
public double subsidianak(int jumlAnak){
        subsidiAnak=jumlAnak*100000;


        return subsidiAnak;

}
public String inputString(){
    Scanner input = new Scanner(System.in);
        return input.nextLine().toUpperCase();
    
}
}
