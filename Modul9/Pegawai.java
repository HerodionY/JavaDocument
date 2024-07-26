package Modul9;

public abstract class Pegawai implements Email{

    private int npp;
    private String nama;
    private double gajiPokok;

    int getNpp() {
        return npp;
    }

    String getNama() {
        return nama;
    }

    double getGapok() {
        return gajiPokok;
    }

    void setNpp(int nopeg) {
        npp = nopeg;
    }

    void setNama(String nampeg) {
        nama = nampeg;
    }

    void setGapok(double upah) {
        gajiPokok = upah;
    }

    void setLembur(double overTime) {
    }

    void setTunJab(double honJab) {
    }

    void setBonus(double myBonus) {
    }

    double getTunjab() {
        return 0;
    }

    double getLembur() {
        return 0;
    }

    double getBonus() {
        return 0;
    }

    abstract String getStatus();

    abstract double getTunjangan();

    abstract double hitungGaTot();
}