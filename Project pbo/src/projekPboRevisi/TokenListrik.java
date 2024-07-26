/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekPboRevisi;

/**
 *
 * @author ACER
 */
public class TokenListrik extends Pembelian {
    private String noListrik;
    private String daftarHarga;
    private double harga;

    TokenListrik(String noListrik, String daftarHarga, double hargaTokenListrik) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    TokenListrik() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNoListrik() {
        return noListrik;
    }

    public void setNoListrik(String noListrik) {
        this.noListrik = noListrik;
    }

    public String getDaftarHarga() {
        return daftarHarga;
    }

    public void setDaftarHarga(String daftarHarga) {
        this.daftarHarga = daftarHarga;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void token() {
        // Implementasi logika untuk membeli token listrik
    }

    @Override
    public String namaPembelian() {
        return "Token Listrik";  // Mengembalikan nama pembelian token listrik sesuai kebutuhan
    }
}
