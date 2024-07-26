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
    public class TopUp_M_Banking extends TopUp {
    private String namaBank;

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    

    @Override
    public String namaMitra() {
        return "Mitra M-Banking";  // Mengembalikan nama mitra m-banking sesuai kebutuhan
    }


}