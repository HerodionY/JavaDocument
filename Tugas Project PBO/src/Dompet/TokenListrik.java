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
public class TokenListrik extends Pembelian {
    private String noListrik;
    private double nominal;
  
    public String getNoListrik() {
        return noListrik;
    }

    public void setNoListrik(String noListrik) {
        this.noListrik = noListrik;
    }

    public double getNominal() {
        return nominal;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
    }

    public double getTokenListrik(int pilihan) {
        double[] nominalList = {20500.0, 50500.0, 100500.0, 500500.0};
        return nominalList[pilihan - 1];
    }

    public String namaPembelian(Dompet dompet) {
        return "Token Listrik";
    }
}