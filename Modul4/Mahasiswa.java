/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul4;

/**
 *
 * @author ACER
 */
public class Mahasiswa {
   
 private String nim;
 private String nama;
 private String email;
 private int umur;

 public Mahasiswa(String no, String nm) {
 nim=no;
 nama=nm;
 }
 public String getNim() {
 return nim;
 }
 public String getNama() {
 return nama;
 }
 public String getEmail() {
 return email;
 }

 

    public int getUmur() {
        return umur;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
 public void setUmur(int usia){
 umur = usia;
 }
 }


