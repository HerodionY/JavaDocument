/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul4;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class MahasiswaNim {
    private String nim;
    private String nama;
    private String tglLahir;
    private double uts1;
    private double uts2;
    private double uas;
  
    

    public MahasiswaNim(String nim, String nama, String tglLahir ) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
       
    }
      
    

    public void setUts2(double uts2) {
        this.uts2 = uts2;
    }

    public void setUts1(double uts1) {
        this.uts1 = uts1;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getUts2() {
        return uts2;
    }

    public double getUts1() {
        return uts1;
    }

    public double getUas() {
        return uas;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

   private double nilaiFinal;
  private String tandaNilai;

 

   
   public void setTandaNilai(String tandaNilai) {
        this.tandaNilai = tandaNilai;
    }

    public void setNilaiFinal(double nilaiFinal) {
        this.nilaiFinal = nilaiFinal;
    }

    public String getTandaNilai() {
        return tandaNilai;
    }

    public double getNilaiFinal() {
        return nilaiFinal;
    }

   public double nilaiFinal(double uts1,double uts2,double uas){
       
       
       this.nilaiFinal=(0.3*uts1)+(0.3*uts2)+(0.3*uas);
     
       return this.nilaiFinal;
   
   }
    public String tandaNilai( double nilaiFinal){
        
        if (nilaiFinal>=80) {
            return this.tandaNilai="A";
  
        }else if (nilaiFinal>=70&&nilaiFinal<80) {
            return this.tandaNilai="B";
            
        }else if (nilaiFinal>=56&&nilaiFinal<70) {
            return this.tandaNilai="C";
        }else if (nilaiFinal>=45&&nilaiFinal<56) {
            return this.tandaNilai="D";
            
        }else if (nilaiFinal<45) {
            return this.tandaNilai="E";
            
        }


        return this.tandaNilai;


}
    
  public static String user(){
  Scanner user = new Scanner(System.in);
        return user.nextLine();
  
  }  
}
