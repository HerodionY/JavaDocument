/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dompet;



/**
 *
 * @author Michael
 */
public class Barang extends Pembelian {
    private String nama;
    private String namaToko;
    private double harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    private void histori() {
        // Implementasi logika untuk mencatat histori pembelian barang
    }

    @Override
    public String namaPembelian() {
        return "Pembelian Barang";  // Mengembalikan nama pembelian barang sesuai kebutuhan
    }
    
}