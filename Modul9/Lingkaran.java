/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul9;

/**
 *
 * @author ACER
 */
class Lingkaran extends BangunDatar {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
    
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    String nama() {
      return "Lingkaran";  }
}
