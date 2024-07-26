/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;


public class Pembelian extends Dompet {
    private String pembelian;
    private String kodePembayaran;

    int bulan;
    int tahun;
    int jam;
    int menit;
    private double totalBayar;
    private String jenis;
    private String nama;
    private double harga;
    private String tanggal;

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Pembelian(String jenis, String nama, double harga,double saldo, String tanggal) {
        super(saldo);
        this.jenis = jenis;
        this.nama = nama;
        this.harga = harga;
        this.tanggal = tanggal;
    }

    Pembelian() {
    }

    public String getJenis() {
        return jenis;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
    
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
    @Override
     public String toString() {
    StringBuilder sb = new StringBuilder();
         sb.append(String.format("%-18s", jenis));
        sb.append(String.format("%-23s", tanggal));
        sb.append(String.format("%-18s",harga));
        sb.append(String.format("%-18s", saldo));
        sb.append("\n");
        
        

    return sb.toString();
}
   
}