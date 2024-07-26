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
public class Pulsa extends PulsaPaketData {

    private double pulsa;
    private double harga;
    private double nominal;

    @Override
    public double getPulsa(int pilihan) {
        double[] nominalList = {10500.0, 20500.0, 50500.0, 100500.0, 200500.0};
        return nominalList[pilihan - 1];
    }
//
//    public void setPulsa(int pulsa) {
//        this.pulsa = pulsa;
//
//    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
    }
}