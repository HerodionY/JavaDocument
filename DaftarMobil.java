/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class DaftarMobil {
   private String namaDealer;
    private String alamat;
    private String pemilik;
    private String NPWP;
    
    

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public void setNamaDealer(String namaDealer) {
        this.namaDealer = namaDealer;
    }

    public void setNPWP(String NPWP) {
        this.NPWP = NPWP;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getNamaDealer() {
        return namaDealer;
    }

    public String getNPWP() {
        return NPWP;
    }

    public String getAlamat() {
        return alamat;
    }

}
