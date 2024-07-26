/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author ACER
 */
public class Perusahaan {//Ini adalah sebuah kelas Java bernama "Perusahaan" yang mewakili sebuah perusahaan. Kelas ini memiliki beberapa field atau variabel private:
    private String namaPerusahaan;
    private String alamat;
    private String pemilik;
    private String NPWP;
    private Pegawai[] daftarPegawai;
    private int jumlahPegawai;

    public Perusahaan(String namaPerusahaan, String alamat, String pemilik, String NPWP, int jumlahPegawai) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.NPWP = NPWP;
        this.daftarPegawai = new Pegawai[jumlahPegawai];
        this.jumlahPegawai = 0;
    }

    // getter dan setter
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getNPWP() {
        return NPWP;
    }
     public void setNPWP(String NPWP) {
        this.NPWP = NPWP;
    }

    
}
