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
public class Pembelian extends Dompet {
    private String pembelian;
    private String kodePembayaran;
    private int tanggal;
    private int bulan;
    private int tahun;
    private int jam;
    private int menit;
    private double totalBayar;

    public String getKodePembayaran() {
        return kodePembayaran;
    }

    public void setKodePembayaran(String kodePembayaran) {
        this.kodePembayaran = kodePembayaran;
    }

    public String getPembelian() {
        return pembelian;
    }

    public void setPembelian(String pembelian) {
        this.pembelian = pembelian;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public String namaPembelian() {
        return "Nama Pembelian";  // Mengembalikan nama pembelian sesuai kebutuhan
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }
}