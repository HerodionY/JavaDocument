/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul8;



/**
 *
 * @author ACER
 */
public class KaryawanKontrak extends Karyawan {
    private double upahHarian;
    

    public KaryawanKontrak() {
    }

    public KaryawanKontrak( String npp, String nama, int golongan, int jumlAnak, double subsidiAnak, double gajiPokok, double totalGaji, String StatusPegawai) {
        super(npp, nama, golongan, jumlAnak, subsidiAnak, gajiPokok, totalGaji, StatusPegawai);
        
        
    }
    

    

    public double UpahHarian(double upahHarian,int hariMasuk) {
        double upahHarianTotal= upahHarian*hariMasuk;
        return upahHarianTotal;
    }

    public double getUpahHarian() {
        return upahHarian;
    }
 
  public double upahTotal(double upahHarian, double subsidiAnak){
  double upahTotal;
  upahTotal=upahHarian+subsidiAnak;
  
        return upahTotal;
  
  
  }
    
}
