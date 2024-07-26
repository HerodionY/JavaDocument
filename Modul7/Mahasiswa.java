/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul7;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Mahasiswa {
    private String nama,nim,tglLahir,nilaiHuruf;
    private int uts1,uts2,uas;
    private double nilaiFinal;
  

    public Mahasiswa(String nama, String nim, String tglLahir, String nilaiHuruf, int uts1, int uts2, int uas, double nilaiFinal ) {
        this.nama = nama;
        this.nim = nim;
        this.tglLahir = tglLahir;
        this.nilaiHuruf = nilaiHuruf;
        this.uts1 = uts1;
        this.uts2 = uts2;
        this.uas = uas;
        this.nilaiFinal = nilaiFinal;
  
    }

    public String getNilaiHuruf() {
        return nilaiHuruf;
    }

    public void setNilaiHuruf(String nilaiHuruf) {
        this.nilaiHuruf = nilaiHuruf;
    }
    

    public void setNilaiFinal(double nilaiFinal) {
        this.nilaiFinal = nilaiFinal;
    }

    public double getNilaiFinal() {
        return nilaiFinal;
    }


    public Mahasiswa(String nama, String nim, String tglLahir, int uts1, int uts2, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tglLahir = tglLahir;
        this.uts1 = uts1;
        this.uts2 = uts2;
        this.uas = uas;
        
    }
    public double nilaiFinal(int uts1,int uts2,int uas){
            double nilaiFinal=0;
            nilaiFinal=(0.3*uts1)+(0.3*uts2)+(0.4*uas);
        return nilaiFinal;
    }
    
    public String nilaiHuruf(double nilaiFinal){
        if (nilaiFinal>=80) {
            return "A";
            
        }
        else if(70<=nilaiFinal&&nilaiFinal<80){
        return "B";
        }
        else if(56<=nilaiFinal&&nilaiFinal<70){
        return "C";
         }
        else if(45<=nilaiFinal&&nilaiFinal<56){
        return "D";
          }
        else if(nilaiFinal<45){
        return "E";
                }
        return "Tidak Ditemukan";
    
    
    }
    public String ketik(){
    Scanner Ketik= new Scanner(System.in);
        return Ketik.nextLine().toUpperCase();
    
    
    
    
    }

    public int getUts2() {
        return uts2;
    }

    public int getUts1() {
        return uts1;
    }

    public int getUas() {
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

    public void setUts2(int uts2) {
        this.uts2 = uts2;
    }

    public void setUts1(int uts1) {
        this.uts1 = uts1;
    }

    public void setUas(int uas) {
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

    public Mahasiswa() {
    }
public  int cariMahasiswaTertinggi(Mahasiswa[] mahasiswas) {
    
    
    int mahasiswaTertinggi = 0 ;
    
    for (int i = 0; i < mahasiswas.length; i++) {
        if (mahasiswas[i].getNilaiFinal() > mahasiswas[mahasiswaTertinggi].getNilaiFinal()) {
            mahasiswaTertinggi = i;
        }
    }
    
    return mahasiswaTertinggi;
}



}
