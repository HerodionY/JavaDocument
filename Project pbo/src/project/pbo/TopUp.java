/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pbo;



/**
 *
 * @author ACER
 */
public class TopUp extends DompetKu {
    private String metode_TopUp;
    private int tanggal;
    private int bulan;
    private int tahun;
    private int jam;
    private int menit;
    private double nominal;
    private double biayaAdmin;
    private double min_tranfer;

    public TopUp() {
    }

    public String getMetode_TopUp() {
        return metode_TopUp;
    }

    public int getTanggal() {
        return tanggal;
    }

    public int getBulan() {
        return bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public double getNominal() {
        return nominal;
    }

    public double getBiayaAdmin() {
        return biayaAdmin;
    }

    public double getMin_tranfer() {
        return min_tranfer;
    }

    public void setMetode_TopUp(String metode_TopUp) {
        this.metode_TopUp = metode_TopUp;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
    }

    public void setBiayaAdmin(double biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public void setMin_tranfer(double min_tranfer) {
        this.min_tranfer = min_tranfer;
    }
    
    
}
