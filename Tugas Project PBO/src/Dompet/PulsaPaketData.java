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
public class PulsaPaketData extends Pembelian {

    private PaketData data;
    private double pulsa;
    private String nomorHp;
    private String namaKartu;
    private String jenis;
    private double harga;
    private String[] seleksiKartu;
    private double nominal;

    public double getPulsa(int pilihan) {
        double[] pulsaList = {10, 20, 50, 100, 200};
        if (pilihan >= 1 && pilihan <= pulsaList.length) {
            return pulsaList[pilihan - 1];
        } else {
            return 0;  // Nilai default jika pilihan tidak valid
        }
    }

    public double getPaketData(int pilihan) {
        double[] hargaList = {19000.0, 29000.0, 39500.0, 59000.0};
        if (pilihan >= 1 && pilihan <= hargaList.length) {
            return hargaList[pilihan - 1];
        } else {
            return 0.0;  // Nilai default jika pilihan tidak valid
        }
    }

    public void setPulsa(int pulsa) {
        this.pulsa = pulsa;
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

    public String getNamaKartu() {
        return namaKartu;
    }

    public void setNamaKartu(String namaKartu) {
        this.namaKartu = namaKartu;
    }

    public PaketData getData() {
        return data;
    }

    public void setData(PaketData data) {
        this.data = data;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    private void seleksiKartu() {
        // Implementasi logika untuk melakukan seleksi kartu
    }

    public String namaPembelian(Dompet dompet) {
        return "Pulsa/Paket Data";  // Mengembalikan nama pembelian pulsa/paket data sesuai kebutuhan
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
        
    }

}