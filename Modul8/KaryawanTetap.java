/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul8;



/**
 *
 * @author ACER
 */
public class KaryawanTetap extends Karyawan {
    
    
   

    public KaryawanTetap() {
    }

    public KaryawanTetap(String npp, String nama, int golongan, int jumlAnak, double subsidiAnak, double gajiPokok, double totalGaji, String StatusPegawai) {
        super(npp, nama, golongan, jumlAnak, subsidiAnak, gajiPokok, totalGaji, StatusPegawai);
      
    }

   
    
     public double menghitungGaji(int golongan) {//method menghitung gsji
        double gajiPokok;
        switch(golongan){//swicth
            //case 1 maka variabel gajiPokok berisi 1300000
            case 1 : gajiPokok=1300000;
            break;
            //case 2 maka variabel gajiPokok berisi 1750000
            case 2 : gajiPokok=1750000;
            break;
            //case 3 maka variabel gajiPokok berisi 2000000 
            case 3 : gajiPokok=2000000; 
            break;
            default : gajiPokok=0;
           
         
        }
        return gajiPokok;//nilai balikan adalah gajiPokok
        
     }
public double hitungGatot(double gajiPokok,double subsidiAnak){
double gajiTotal = 0;
gajiTotal=gajiPokok+subsidiAnak;


        return gajiTotal;



}
}
