/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pbo;

/**
 *
 * @author ACER
 */
public class PulsaPaketData extends Pembelian {
    private PaketData data;
    private Pulsa pulsa;
    private String nomorHp;
    private String namaKartu;
    private String jenis;
    private double harga;
    String [] seleksiKartu;

    public PaketData getData() {
        return data;
    }

    public void setData(PaketData data) {
        this.data = data;
    }

    public Pulsa getPulsa() {
        return pulsa;
    }

    public void setPulsa(Pulsa pulsa) {
        this.pulsa = pulsa;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public String getNamaKartu() {
        return namaKartu;
    }

    public void setNamaKartu(String namaKartu) {
        this.namaKartu = namaKartu;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String[] getSeleksiKartu() {
        return seleksiKartu;
    }

    public void setSeleksiKartu(String[] seleksiKartu) {
        this.seleksiKartu = seleksiKartu;
    }
    
}
