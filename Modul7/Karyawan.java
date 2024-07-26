/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul7;

/**
 *
 * @author ACER
 */
public class Karyawan {
    public String npp;
    public String nama;
    public int golongan;
    public int jumlAnak;
    public double subsidiAnak;
    
    

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
}
