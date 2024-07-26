/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul7;

/**
 *
 * @author ACER
 */
public class KaryawanKontrak extends Karyawan {
    private double upahHarian;
    

    

    public void setUpahHarian(double upahHarian,int hariMasuk) {
        this.upahHarian = upahHarian*hariMasuk;
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
