/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author ACER
 */
public class Pegawai {//class
    private int gajiPokok;//deklarasi variabel gajiPokok
    private int NPP;//deklarasi variabel NPP
    private String nama;//deklarasi variabel nama
    private int golongan;//deklarasi golongan
    private int status;//deklarasi variabel status
    private int jumlahAnak;//deklarasi variabel jumlahAnak
    private int tunjanganKeluarga;//deklarasi variabel tunjanganKeluarga
    private int gajiTotal;//deklarasi variabel gajiTotal
     private Pegawai[] daftarPegawai;

    Pegawai() {
            }
    

//setter anda getter calss pegawai 
    public void setTunjanganKeluarga(int tunjanganKeluarga) {
        this.tunjanganKeluarga = tunjanganKeluarga;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setNPP(int NPP) {
        this.NPP = NPP;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public void setGajiTotal(int gajiTotal) {
        this.gajiTotal = gajiTotal;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getNPP() {
        return NPP;
    }

    public int getStatus() {
        return status;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public int getGolongan() {
        return golongan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }
//construktor dengan parameter String nama,int gajiPokok, int NPP, int golongan, int status, int jumlahAnak, int tunjanganKeluarga, int gajiTotal
    public Pegawai(String nama,int gajiPokok, int NPP, int golongan, int status, int jumlahAnak, int tunjanganKeluarga, int gajiTotal) {
        this.nama=nama;
        this.gajiPokok = gajiPokok;
        this.NPP = NPP;
        this.golongan = golongan;
        this.status = status;
        this.jumlahAnak = jumlahAnak;
        this.tunjanganKeluarga = tunjanganKeluarga;
        this.gajiTotal = gajiTotal;
     
    }
    
    

   
//setter and getter
    public  void setNama(String nama) {
        this.nama = nama;
    }
    

    public String getNama() {
        return nama;
    }
    

    public int menghitungGaji(int golongan) {//method menghitung gsji
        
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
    

       
        
  

    public int getTunjanganKeluarga() {//method getTunjanganKeluarga
        return this.tunjanganKeluarga = 300000+(jumlahAnak*100000);//nilai balikan
    }
        
        
    public int getGajiTotal(){//method getGajiTotal
    
        return this.gajiTotal=gajiPokok+tunjanganKeluarga;//nilai balikan
    
    }    

   
   
       
    
}
