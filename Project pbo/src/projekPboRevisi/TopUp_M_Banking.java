/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekPboRevisi;

/**
 *
 * @author ACER
 */
public class TopUp_M_Banking extends TopUp {
    private String namaBank;

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    private void histori() {
        // Implementasi logika untuk mencatat histori top-up melalui m-banking
    }

    @Override
    public String namaMitra() {
        return "Mitra M-Banking";  // Mengembalikan nama mitra m-banking sesuai kebutuhan
    }
}
