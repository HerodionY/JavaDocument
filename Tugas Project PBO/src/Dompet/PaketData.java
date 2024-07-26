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
public class PaketData extends PulsaPaketData {

    private String namaKartu;
    private String[] daftarVoucher;
    private double[] hargaVoucher;

    public double getPaketData(int pilihan) {
        double[] nominalList = {19000.0, 29000.0, 39500.0, 59000.0};
        return nominalList[pilihan - 1];
    }

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