/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekPboRevisi;

/**
 *
 * @author ACER
 */
public class TopUp {
    private String metodeTopUp;
    private int tanggal;
    private int bulan;
    private int tahun;
    private int jam;
    private int menit;
    private double nominal;
    private double biayaAdmin;
    private double minTransfer;

    TopUp(String metodeTopUp, int tanggalTopUp, int bulanTopUp, int tahunTopUp, int jamTopUp, int menitTopUp, double nominalTopUp, double biayaAdminTopUp, double minimalTransferTopUp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    TopUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getMinTransfer() {
        return minTransfer;
    }

    public void setMinTransfer(double minTransfer) {
        this.minTransfer = minTransfer;
    }

    public double getBiayaAdmin() {
        return biayaAdmin;
    }

    public void setBiayaAdmin(double biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
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

    void setMinimalTransfer(double minimalTransferTopUp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getMinimalTransfer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
