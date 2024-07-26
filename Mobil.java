/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Mobil {
   private String warna;
   private String merk;
   private int tahun ;
    //Kelas Mobil memiliki atribut warna yang di-set sebagai public.
  

//Kelas Mobil memiliki konstruktor yang menerima parameter wrn untuk menginisialisasi atribut warna.
    public Mobil(String Warna, String Merk, int Tahun) { //constructor
        this.merk=Merk;
        this.tahun=Tahun;
        this.warna= Warna;
        
        
        
       
    }

//Kelas Mobil memiliki method jalan_maju() yang mencetak tulisan "Mobil warna [warna mobil] Maju !" ke layar.
    void jalan_maju() {
        System.out.print("Mobil warna " + warna);
        System.out.println(" Maju !");
    }
   

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public int getTahun() {
        return tahun;
    }

    public String getMerk() {
        return merk;
    }

    //Pada method main, objek sedan dibuat dengan memanggil konstruktor dengan parameter "merah", 
    //kemudian method jalan_maju() dipanggil pada objek tersebut.
    public static void main(String[] args) {
     
    }
//Output yang dihasilkan dari program ini adalah "Mobil warna merah Maju !".

    private static class Int {

        public Int() {
        }
    }
}
    

