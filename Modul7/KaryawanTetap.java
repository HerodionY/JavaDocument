/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul7;

/**
 *
 * @author ACER
 */
public class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    


   
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
     public double menghitungGaji(int golongan) {//method menghitung gsji
        
        switch(golongan){//swicth
            //case 1 maka variabel gajiPokok berisi 1300000
            case 1 : this.gajiPokok=1300000;
            break;
            //case 2 maka variabel gajiPokok berisi 1750000
            case 2 : this.gajiPokok=1750000;
            break;
            //case 3 maka variabel gajiPokok berisi 2000000 
            case 3 : this.gajiPokok=2000000; 
            break;
            default : this.gajiPokok=0;
           
         
        }
        return gajiPokok;//nilai balikan adalah gajiPokok
        
     }
public double hitungGatot(double subsidiAnak){
double gajiTotal = 0;
gajiTotal=gajiPokok+subsidiAnak;


        return gajiTotal;



}
}
