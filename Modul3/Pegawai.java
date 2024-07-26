/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul3;

/**
 *
 * @author ACER
 */
public class Pegawai {//class
    static int gajiPokok;//deklarasi variabel gajiPokok
    static int NPP;//deklarasi variabel NPP
    public static String nama;//deklarasi variabel nama
    static int golongan;//deklarasi golongan
    static int status;//deklarasi variabel status
    static int jumlahAnak;//deklarasi variabel jumlahAnak
    static int tunjanganKeluarga;//deklarasi variabel tunjanganKeluarga
    static int gajiTotal;//deklarasi variabel gajiTotal
    
    
Pegawai(){};
    
    

   

    public  void setNama(String nama) {
        this.nama = nama;
    }
    

    public String getNama() {
        return nama;
    }
    

    public static int menghitungGaji(int golongan) {//method menghitung gsji
        
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
    

       
        
  

    public static int getTunjanganKeluarga() {//method getTunjanganKeluarga
        return tunjanganKeluarga = 300000+(jumlahAnak*100000);//nilai balikan
    }
        
        
    public static int getGajiTotal(){//method getGajiTotal
    
        return gajiTotal=gajiPokok+tunjanganKeluarga;//nilai balikan
    
    }    

   
   
       
    
}
