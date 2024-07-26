/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;


public class TopUp_Minimarket extends TopUp {
    private String namaMinimarket;

    public TopUp_Minimarket(String metodeTopUp, String namaMiniMarket, double saldo,double nominal,String tanggal) {
        super(metodeTopUp,saldo,nominal,tanggal);
        this.namaMinimarket=namaMiniMarket;
    }

    

   

    public void setNamaMinimarket(String namaMinimarket) {
        this.namaMinimarket = namaMinimarket;
    }

    public String getNamaMinimarket() {
        return namaMinimarket;
    }

    @Override
    public String namaMitra() {
        return "Mitra Minimarket";  // Mengembalikan nama mitra minimarket sesuai kebutuhan
    }
    
}