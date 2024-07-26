package Modul10;

public class Pemasaran extends Pegawai{
    private double bonus;
    private String email = "@marketing.usd.ac.id";
    
    double getBonus() {
        return bonus;
    }
    void setBonus(double myBonus){
        bonus = myBonus;
    } 
    
    double hitungGaTot(){
        return getGapok()+bonus;
    }
    
    double getTunjangan() {
        return bonus;
    }
    
    String getStatus() { return "Pemasaran"; }

    
    public String getEmail() {
        email = getNpp() + email;
        return email;
    }
}