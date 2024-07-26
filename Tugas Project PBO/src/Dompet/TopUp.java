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
public class TopUp extends Dompet{

    private String metodeTopUp;
    private int tanggal;
    private int bulan;
    private int tahun;
    private int jam;
    private int menit;
    private double nominal;
    private double biayaAdmin;
    private double minTransfer;
    private String namaMiniMarket;

    public double getMinTransfer() {
        return minTransfer;
    }

    public void setMinTransfer() {
        this.minTransfer = 10000;
    }

    public double getBiayaAdmin() {
        return biayaAdmin;
    }

    public void setBiayaAdmin() {
        this.biayaAdmin = 3000;
    }

    public String getMetodeTopUp() {
        return metodeTopUp;
    }

    public void setMetodeTopUp(String metodeTopUp) {
        this.metodeTopUp = metodeTopUp;
    }

    public double getNominal() {
        return nominal;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
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

    public String namaMitra() {
        return "Mitra TopUp";  // Mengembalikan nama mitra top-up sesuai kebutuhan
    }

    public void tambahSaldo(Dompet dompet) {
        double saldoSebelumnya = dompet.getSaldo();
        double saldoBaru = saldoSebelumnya + nominal - getBiayaAdmin();
        dompet.setSaldo(saldoBaru);
        System.out.println("Saldo Berhasil Ditambahkan");
        System.out.println("Saldo Saat Ini: " + dompet.getSaldo());
    }

    public String setNamaMiniMarket(String indomaret) {
        return indomaret;
    }
}