package Modul9;

public class Manajer extends Pegawai{

    private double tunjanganJabatan, lemburan;
    private String email = "@manajer.usd.ac.id";
    
    double getTunJab() {
        return tunjanganJabatan;
    }

    double getLembur() {
        return lemburan;
    }

    void setTunJab(double honJab) {
        tunjanganJabatan = honJab;
    }

    void setLembur(double overtime) {
        lemburan = overtime;
    }

    
    double hitungGaTot() {
        return getGapok() + tunjanganJabatan + lemburan;
    }

   
    double getTunjangan() {
        return tunjanganJabatan + lemburan;
    }

    
    String getStatus() {
        return "Manajer";
    }

    
    public String getEmail() {
        email = getNpp()+email;
        return email;
    }
}