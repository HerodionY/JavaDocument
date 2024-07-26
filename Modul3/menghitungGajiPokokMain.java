/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul3;

/**
 *
 * @author ACER
 */

import java.util.Scanner;//mengimport Scanner
import javax.swing.JOptionPane;//mengimport panel

public class menghitungGajiPokokMain {//class 
    public static void main(String[] args){//class main
    Pegawai MenghitungGaji=new Pegawai();//object
    Scanner input=new Scanner(System.in);//menamai scanner
     int gajiPokok;//deklarasi variabel gaji pokok bertype int
    int NPP;//deklarasi NPP bertype int
    String nama;//deklarasi variabel nama bertype string
    int golongan;//deklarasi variabel golongan bertype int
    int status;//deklarasi variabel status bertype int
    int jumlahAnak;//deklarasi variabel jumlahAnak bertype int
    int tunjanganKeluarga;//deklarasi varaibel tunjanganKeluarga bertype int
    int gajiTotal;//deklarasi variabel gaji bertype int
    
    NPP=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nomor Pendaftaran Perusahaan : "));
//menginput isi variabel NPP melalui input dialog serta menampilkan tulisan "Masukkan Nomor Pendaftaran Perusahaan : "
    nama=JOptionPane.showInputDialog("Masukan Nama anda : ");
    //menginput isi variabel nama melalui input dialog serta menampilkan tulisan "Masukan Nama anda : "
    golongan=Integer.parseInt(JOptionPane.showInputDialog("Masukan Golongan anda : dari 1 sampai 3"));
    //menginput isi variabel golongan melalui input dialog serta menampilkan tulisan "Masukan Golongan anda : "
    status=Integer.parseInt(JOptionPane.showInputDialog("Apakah Status anda 1.Menikah atau 2.tidak menikah "));
    //menginput isi variabel status melalui input dialog serta menampilkan tulisan "Apakah Status anda 1.Menikah atau 2.tidak menikah "
     gajiPokok=Pegawai.menghitungGaji(golongan );//menghitung melalui method menghitungGaji
    
    switch(status){
        case 1 : jumlahAnak=Integer.parseInt(JOptionPane.showInputDialog("Berapakah anak anda : "));
    //menginput isi variabel jumlahAnak melalui input dialog serta menampilkan tulisan "Berapakah anak anda : "
       
        break;
        case 2 :  jumlahAnak=0;
    tunjanganKeluarga=Pegawai.getTunjanganKeluarga();//menghitung melalui method getTunjanganKeluarga
    gajiTotal=Pegawai.getGajiTotal();//menghitung melalui method getGajiTotal
    JOptionPane.showMessageDialog(null,  "Anda mendapatkan gaji pokok sebesar : "+ gajiPokok+"' dengan tunjangan sebesar : "+tunjanganKeluarga+" Dengan itu mendapatkan gaji sebesar : "+gajiTotal);
    //menampilkan message dialog 
        break;
        default : JOptionPane.showMessageDialog(null,  "Error!!!!!!!!!!!!");
    //menampilkan message dialog 
    
    
    
    }
    
   
    
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    }
    


