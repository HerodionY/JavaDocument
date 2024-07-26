/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul9;

/**
 *
 * @author ACER
 */
class SegiEmpat extends BangunDatar {
    private double panjang;
    private double lebar;
    
    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    public double hitungLuas() {
        return panjang * lebar;
    }
    @Override
    public String nama(){
            return "SegiEmpat";
    }
}

