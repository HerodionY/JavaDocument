/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekPboRevisi;

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
    private String[] seleksiKartu;

    PulsaPaketData(String data, String pulsa, String nomorHp, String namaKartu, String jenis, double hargaPulsaPaketData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    PulsaPaketData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Pulsa getPulsa() {
        return pulsa;
    }

    public void setPulsa(Pulsa pulsa) {
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

    @Override
    public String namaPembelian() {
        return "Pulsa/Paket Data";  // Mengembalikan nama pembelian pulsa/paket data sesuai kebutuhan
    }

    void setData(String dataPulsa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setPulsa(String pulsa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}