/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekPboRevisi;

/**
 *
 * @author ACER
 */
public class PaketData extends PulsaPaketData {
    private String namaKartu;
    private String[] daftarVoucher;
    private double[] hargaVoucher;

    public String getNamaKartu() {
        return namaKartu;
    }

    public void setNamaKartu(String namaKartu) {
        this.namaKartu = namaKartu;
    }

    public double[] getHargaVoucher() {
        return hargaVoucher;
    }

    public void setHargaVoucher(double[] hargaVoucher) {
        this.hargaVoucher = hargaVoucher;
    }

    public String[] getDaftarVoucher() {
        return daftarVoucher;
    }

    public void setDaftarVoucher(String[] daftarVoucher) {
        this.daftarVoucher = daftarVoucher;
    }

    public int cetakDaftarVoucher(PaketData[] paketDataList, String kartu) {
        // Implementasi logika untuk mencetak daftar voucher berdasarkan kartu
        return 0;  // Menyimpan jumlah voucher yang tercetak
    }

    public void cetakVoucher(String[] voucherList, double[] hargaList) {
        // Implementasi logika untuk mencetak voucher
    }
}
