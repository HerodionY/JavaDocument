package Modul9;

public class Honorer extends Pegawai {

    private double lemburan;
    private String email = "@honorer.usd.ac.id";
    
    double getLembur() {
        return lemburan;
    }

    void setLembur(double myLembur) {
        lemburan = myLembur;
    }

    
    double hitungGaTot() {
        return getGapok() + lemburan;
    }

    
    double getTunjangan() {
        return lemburan;
    }

    
    String getStatus() {
        return "Honorer";
    }

    
    public String getEmail() {
        email = getNpp() + email;
        return email;
    }
}