/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

/**
 *
 * @author ACER
 */
public class Pengarang {
    private String NIK, nama, alamat;//inisiasi variabel
    
//setter dan getter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNIK() {
        return NIK;
    }

    public String getAlamat() {
        return alamat;
    }

    public Pengarang(String NIK, String nama, String alamat ) {//konstrukto Pengarang Dengan parameter NIK, Nama, Alamat bertipe String
        this.NIK = NIK;
        this.nama = nama;
        this.alamat = alamat;
       
    }

}
